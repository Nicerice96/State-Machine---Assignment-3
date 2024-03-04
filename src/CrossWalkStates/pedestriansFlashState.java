package CrossWalkStates;

import Main.CrossWalkSimulation;
import VehicleStates.GreenState;

/**
 * performs the actions of the pedestrian Light
 */

public class pedestriansFlashState extends State {

    CrossWalkSimulation crossWalkSimulation;

    /**
     * pedestrianFlashState Constructor
     * @param crossWalkSimulation
     */

    public pedestriansFlashState(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;
    }

    /**
     * handles the Flashing of the pedestrian light
     */
    @Override
    public void handleEvent() {


        int pedestrianFlashCtr = 7;

        while (pedestrianFlashCtr > 0){



            if ((pedestrianFlashCtr & 1) == 0){

                CrossWalkSimulation.signalPedestrians(false);

            }



            pedestrianFlashCtr--;

        }

        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }


        crossWalkSimulation.timeout(new GreenState(this.crossWalkSimulation));



    }
}
