package VehicleStates;

import CrossWalkStates.State;
import Main.Context;
import Main.CrossWalkSimulation;


/**
 * Green State class signals the traffic light to green
 */

public class GreenState extends State {

    CrossWalkSimulation crossWalkSimulation;

    /**
     * Green state Constructor
     * @param crossWalkSimulation
     */

    public GreenState(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;



    }

    /**
     * Green State handler waits until at least 5 seconds have passed in the "Green" stage of the traffic before interrupts are allowed, if no interrupts are detected by the end of the
     * 5-second period, then the green light signal is allowed to run even longer before moving to "Yellow State", as no pedestrians are detected, otherwise the "Green state" changes to "vehiclesGreenInt"
     *
     */
    @Override
    public void handleEvent() {


        System.out.println("GREEN");



        while (crossWalkSimulation.setTimer(5 * 1000)){

            // If a pedestrian is detected, then change to yellow in the next 5 seconds

                crossWalkSimulation.timeout(new vehiclesGreenInt(this.crossWalkSimulation));


        }

        System.out.println("No pedestrians detected...");

        // If no pedestrians are detected, then the light may remain green for its entire duration

        try{
            Thread.sleep(15 * 1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

       crossWalkSimulation.timeout(new YellowState(this.crossWalkSimulation));


    }
}
