package Main;

import CrossWalkStates.State;
import VehicleStates.VehiclesEnabled;

/**
 * CrossWalkSimulation simulates a pedestrian crossing via State Machine
 */

public class CrossWalkSimulation implements Context {


    public static boolean walkLightOn = false;
    private State state;
    public static volatile boolean buttonPushed;

    /**
     * CrossWalkSimulation Constructor
     */
    CrossWalkSimulation(){

        this.state = new VehiclesEnabled(this);
        state.handleEvent();
    }

    /**
     * Makes the state machine wait or a given amount of time
     * @param time
     * @return
     */
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

    /**
     * Simulates the Flashing of the "WALK LIGHT" and the flashing of the "DO NOT WALK" light
     * @param flag
     */


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

    /**
     * Set's if the pedestrian crossing button was pressed or not
     * @param buttonPushed
     */

    public static void setPedestrianWaiting(Boolean buttonPushed){
        CrossWalkSimulation.buttonPushed = buttonPushed;

    }

    /**
     * Indicates the changing of a state within the State Machine
     * @param state
     */

    @Override
    public void timeout(State state) {
        this.state = state;
        state.handleEvent();
    }

    /**
     * Indicates whether the button was pressed or not
     * @return boolean
     */
    @Override
    public boolean pedestrianWaiting() {
        return buttonPushed;
    }
}