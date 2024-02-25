package VehicleStates;

import CrossWalkStates.State;
import Main.Context;
import Main.CrossWalkSimulation;

public class vehiclesGreenInt implements State {

    CrossWalkSimulation crossWalkSimulation;

    public vehiclesGreenInt(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;

    }
    @Override
    public void handleEvent() {





            System.out.println("Traffic Light notified that Pedestrians are waiting");

            CrossWalkSimulation.buttonPushed = false;

            try{
                Thread.sleep(15 * 1000);
            }
            catch (Exception e)
            {

            }

            crossWalkSimulation.timeout(new YellowState(this.crossWalkSimulation));
        }

    }
