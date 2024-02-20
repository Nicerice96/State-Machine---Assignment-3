package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;

public class vehiclesGreenInt extends State {
    @Override
    public void handleEvent() {



        // If 20 seconds have elapsed without pedestrians waiting, transition to VehicleStates.YellowState
        CrossWalkSimulation.timeout(10000);
        CrossWalkSimulation.setState(new YellowState());

    }
}
