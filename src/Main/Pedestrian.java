package Main;

import java.util.Random;

public class Pedestrian implements Runnable {

    private boolean buttonPressed = false;

    private boolean pedestrians = true;


    Pedestrian() {
    }

    public boolean pedestriansAvailable() {

        Random rand = new Random();
        int num = rand.nextInt(0, 2);

        if (num == 1) {
            this.pedestrians = true;
            return this.pedestrians;
        } else {
            this.pedestrians = false;
            return this.pedestrians;
        }

    }


    public int randomize() {


        Random random = new Random();

        int num = random.nextInt(1 * 1000, 20 * 1000);

        System.out.println("Pedestrian will press the button in: " + num + " milliseconds");

        return num;

    }


    @Override
    public void run() {


        while (true) {

            if (this.pedestrians) {

                if (!CrossWalkSimulation.walkLightOn) {

                    if (!buttonPressed) {

                        try {
                            Thread.sleep(randomize());
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }

                        CrossWalkSimulation.setPedestrianWaiting(true);
                        System.out.println("Pedestrian Pressed the button!");
                        this.buttonPressed = true;
                    } else {

                        System.out.println("button has been pressed");

                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }

                        this.buttonPressed = false;

                    }
                }
                else {
                    System.out.println("Pedestrians Crossing!");
                    this.pedestrians = false;
                    try {
                        Thread.sleep(50000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            } else {
                pedestriansAvailable();

                System.out.println("No pedestrians...");
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}


