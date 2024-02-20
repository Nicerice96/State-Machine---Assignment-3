package CrossWalkStates;

import Main.CrossWalkSimulation;
import VehicleStates.GreenState;

public class pedestriansFlashState extends State {
    @Override
    public void handleEvent() {


        int pedestrianFlashCtr = 7;

        while (pedestrianFlashCtr > 0){



            if ((pedestrianFlashCtr & 1) == 0){

                CrossWalkSimulation.signalPedestrians(false);

            }



            pedestrianFlashCtr--;

        }

        CrossWalkSimulation.timeout(1000);

        CrossWalkSimulation.setState(new GreenState());


    }
}
