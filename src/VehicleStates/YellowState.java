package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;

public class YellowState extends State {
    @Override
    public void handleEvent() {


        System.out.println("YELLOW");

        CrossWalkSimulation.timeout(3000);

        CrossWalkSimulation.setState(new RedState());

    }
}
