package Main;

public class Pedestrian implements Runnable{
    @Override
    public void run() {

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        CrossWalkSimulation.setPedestrianWaiting(true);
        System.out.println("A Pedestrian has pressed the button, Pedestrian is Waiting");

    }
}
