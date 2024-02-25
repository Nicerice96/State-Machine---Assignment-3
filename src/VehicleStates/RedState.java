package VehicleStates;

import CrossWalkStates.State;
import CrossWalkStates.pedestriansWalk;
import Main.CrossWalkSimulation;

public class RedState implements State {

    CrossWalkSimulation crossWalkSimulation;

    public RedState (CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;
    }
    @Override
    public void handleEvent() {

        System.out.println("RED");


        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }

        crossWalkSimulation.timeout(new pedestriansWalk(this.crossWalkSimulation));

    }
}
