package CrossWalkStates;

import Main.CrossWalkSimulation;

/**
 * entry to the Pedestrian states
 */
public class pedestriansWalk extends State {

    CrossWalkSimulation crossWalkSimulation;

    /**
     * pedestrianWalk Constructor
     * @param crossWalkSimulation
     */
    public pedestriansWalk(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;
    }

    /**
     * handles the pedestrianWalk state
     */
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
