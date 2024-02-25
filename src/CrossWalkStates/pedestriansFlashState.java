package CrossWalkStates;

import Main.CrossWalkSimulation;
import VehicleStates.GreenState;

public class pedestriansFlashState implements State {

    CrossWalkSimulation crossWalkSimulation;

    public pedestriansFlashState(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;
    }
    @Override
    public void handleEvent() {


        int pedestrianFlashCtr = 7;

        while (pedestrianFlashCtr > 0){



            if ((pedestrianFlashCtr & 1) == 0){

                CrossWalkSimulation.signalPedestrians(false);

            }



            pedestrianFlashCtr--;

        }

        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {

        }


        crossWalkSimulation.timeout(new GreenState(this.crossWalkSimulation));



    }
}
