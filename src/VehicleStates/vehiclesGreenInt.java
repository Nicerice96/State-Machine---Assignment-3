package VehicleStates;

import CrossWalkStates.State;
import Main.Context;
import Main.CrossWalkSimulation;

/**
 * Performs the necessary actions when the Green state is interrupted
 */
public class vehiclesGreenInt implements State {

    CrossWalkSimulation crossWalkSimulation;


    /**
     * vehiclesGreenInt Constructor
     * @param crossWalkSimulation
     */

    public vehiclesGreenInt(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;

    }

    /**
     * handles the vehicleGreenInt state
     */
    @Override
    public void handleEvent() {

            System.out.println("Traffic Light notified that Pedestrians are waiting");

            CrossWalkSimulation.buttonPushed = false;

            try{
                Thread.sleep(10 * 1000);
            }
            catch (Exception e)
            {

            }

            crossWalkSimulation.timeout(new YellowState(this.crossWalkSimulation));
        }

    }
