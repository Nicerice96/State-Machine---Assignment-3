package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;

/**
 * Performs the actions of the "Yellow" traffic signal
 */
public class YellowState implements State {

    CrossWalkSimulation crossWalkSimulation;


    /**
     * YellowState constructor
     * @param crossWalkSimulation
     */

    public YellowState (CrossWalkSimulation crossWalkSimulation) {

        this.crossWalkSimulation = crossWalkSimulation;

    }

    /**
     * handles the Yellow State
     */
    @Override
    public void handleEvent() {


        System.out.println("YELLOW");

        try{
            Thread.sleep(3000);
        }
        catch (Exception e)
        {

        }


        crossWalkSimulation.timeout(new RedState(this.crossWalkSimulation));

    }
}
