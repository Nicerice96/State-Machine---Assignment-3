package CrossWalkStates;

import Main.CrossWalkSimulation;

public class pedestriansWalk extends State {
    @Override
    public void handleEvent() {


        CrossWalkSimulation.timeout(1000);

        CrossWalkSimulation.signalPedestrians(true);

        CrossWalkSimulation.timeout(1000);

        CrossWalkSimulation.setState(new pedestriansFlashState());




    }
}
