package Main;

import CrossWalkStates.State;
import VehicleStates.GreenState;

public class VehiclesEnabled extends State {
    @Override
    public void handleEvent() {

        if (!CrossWalkSimulation.buttonPushed){



            CrossWalkSimulation.setState(new GreenState());
        }



    }
}
