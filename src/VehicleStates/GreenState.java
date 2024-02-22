package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;

public class GreenState extends State {
    @Override
    public void handleEvent() {
        System.out.println("Are pedestrians waiting?: " + CrossWalkSimulation.buttonPushed);


        System.out.println("GREEN");

        CrossWalkSimulation.setTimer(20000);

        // Loop until 10 seconds have elapsed or pedestrians start waiting
        while (System.currentTimeMillis() < CrossWalkSimulation.time) {

            CrossWalkSimulation.setState(new vehiclesGreenInt());

        }

        CrossWalkSimulation.setState(new YellowState());


    }
}
