package VehicleStates;

import CrossWalkStates.State;
import CrossWalkStates.pedestriansWalk;
import Main.CrossWalkSimulation;

/**
 * Performs the necessary actions of the "Red" signal on the traffic light
 */
public class RedState implements State {

    CrossWalkSimulation crossWalkSimulation;

    /**
     * RedState constructor
     * @param crossWalkSimulation
     */

    public RedState (CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;
    }

    /**
     * handle the Red state
     */
    @Override
    public void handleEvent() {

        System.out.println("RED");


        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }

        crossWalkSimulation.timeout(new pedestriansWalk(this.crossWalkSimulation));

    }
}
