package CrossWalkStates;

import Main.CrossWalkSimulation;

public class pedestriansWalk extends State {
    @Override
    public void handleEvent() {


        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }


        CrossWalkSimulation.signalPedestrians(true);

        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }


        CrossWalkSimulation.setState(new pedestriansFlashState());




    }
}
