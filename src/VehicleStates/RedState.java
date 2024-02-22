package VehicleStates;

import CrossWalkStates.State;
import CrossWalkStates.pedestriansWalk;
import Main.CrossWalkSimulation;

public class RedState extends State {
    @Override
    public void handleEvent() {

        System.out.println("RED");


        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }

        CrossWalkSimulation.setState(new pedestriansWalk());

    }
}
