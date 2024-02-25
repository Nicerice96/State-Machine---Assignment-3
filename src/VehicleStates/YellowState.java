package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;

public class YellowState implements State {

    CrossWalkSimulation crossWalkSimulation;

    public YellowState (CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;


    }
    @Override
    public void handleEvent() {


        System.out.println("YELLOW");

        try{
            Thread.sleep(3000);
        }
        catch (Exception e)
        {

        }


        crossWalkSimulation.timeout(new RedState(this.crossWalkSimulation));

    }
}
