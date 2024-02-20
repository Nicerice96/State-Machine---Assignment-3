package VehicleStates;

import CrossWalkStates.State;
import CrossWalkStates.pedestriansWalk;
import Main.CrossWalkSimulation;

public class RedState extends State {
    @Override
    public void handleEvent() {

        System.out.println("RED");

        CrossWalkSimulation.setState(new pedestriansWalk());

    }
}
