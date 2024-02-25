package Main;

import CrossWalkStates.State;

import java.util.HashMap;

public class CrossWalkSimulation implements Context {


    public static boolean walkLightOn = false;
    private State state;

    public static volatile boolean buttonPushed;


    CrossWalkSimulation(){

        this.state = new VehiclesEnabled(this);
        state.handleEvent();
    }

    public boolean setTimer(long time){
        long startTime = System.currentTimeMillis();
        long endTime = startTime + time;

        while (System.currentTimeMillis() < endTime){


        }

        if (pedestrianWaiting()){

            return true;
        }

        System.out.println("Timer has finished!");

        return false;


    }


    public static void signalPedestrians(boolean flag) {
        if (flag) {
            CrossWalkSimulation.walkLightOn = true;
            System.out.println("FLASH WALK LIGHT");
            try{
                Thread.sleep(15000);
            }
            catch (Exception ignored)
            {

            }

        }
        else{
            CrossWalkSimulation.walkLightOn = false;
            System.out.println("FLASH DONT WALK LIGHT");
            try{
                Thread.sleep(1000);
            }
            catch (Exception ignored)
            {

            }

        }
    }



    public static void setPedestrianWaiting(Boolean buttonPushed){
        CrossWalkSimulation.buttonPushed = buttonPushed;

    }

    @Override
    public void timeout(State state) {
        this.state = state;
        state.handleEvent();
    }

    @Override
    public boolean pedestrianWaiting() {
        return buttonPushed;
    }
}