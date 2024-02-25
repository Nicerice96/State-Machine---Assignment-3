package CrossWalkStates;

import Main.CrossWalkSimulation;

public class pedestriansWalk implements State {

    CrossWalkSimulation crossWalkSimulation;

    public pedestriansWalk(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;
    }
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


        crossWalkSimulation.timeout(new pedestriansFlashState(this.crossWalkSimulation));




    }
}
