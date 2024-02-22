package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;

public class vehiclesGreenInt extends State {
    @Override
    public void handleEvent() {



        // Check if pedestrians are waiting
        if (CrossWalkSimulation.buttonPushed) {

            System.out.println("Traffic Light notified that Pedestrians are waiting");

            CrossWalkSimulation.buttonPushed = false;

            try{
                Thread.sleep(15000);
            }
            catch (Exception e)
            {

            }

            CrossWalkSimulation.setState(new YellowState());
        }

    }
}
