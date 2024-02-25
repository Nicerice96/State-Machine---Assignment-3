package VehicleStates;

import CrossWalkStates.State;
import Main.Context;
import Main.CrossWalkSimulation;


/**
 * Green State class signals the traffic light to green
 */

public class GreenState implements State {

    CrossWalkSimulation crossWalkSimulation;

    /**
     * Green state Constructor
     * @param crossWalkSimulation
     */

    public GreenState(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;



    }

    /**
     * Green State handler waits until at least 10 seconds have passed in the "Green" stage of the traffic before interrupts are allowed, if no interrupts are detected by the end of the
     * 10-second period, then the green light signal is allowed to run even longer before moving to "Yellow State", as no pedestrians are detected, otherwise the "Green state" changes to "vehiclesGreenInt"
     *
     */
    @Override
    public void handleEvent() {


        System.out.println("GREEN");



        while (crossWalkSimulation.setTimer(10 * 1000)){

                crossWalkSimulation.timeout(new vehiclesGreenInt(this.crossWalkSimulation));


        }

        System.out.println("No pedestrians");


        try{
            Thread.sleep(15 * 1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

       crossWalkSimulation.timeout(new YellowState(this.crossWalkSimulation));


    }
}
