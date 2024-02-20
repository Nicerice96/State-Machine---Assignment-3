package CrossWalkStates;

import Main.CrossWalkSimulation;

public class pedestriansWalk extends State {
    @Override
    public void handleEvent() {

        try{

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        CrossWalkSimulation.signalPedestrians(true);

        try{

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        CrossWalkSimulation.setState(new pedestriansFlashState());




    }
}
