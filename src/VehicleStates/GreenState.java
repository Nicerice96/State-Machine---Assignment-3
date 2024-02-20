package VehicleStates;

import CrossWalkStates.State;
import Main.Context;
import Main.CrossWalkSimulation;

public class GreenState extends State {
    @Override
    public void handleEvent() {
        System.out.println("Are pedestrians waiting?: " + CrossWalkSimulation.buttonPushed);


        System.out.println("GREEN");


        long startTime = System.currentTimeMillis();
        long endTime = startTime + 20000;

        // Loop until 10 seconds have elapsed or pedestrians start waiting
        while (System.currentTimeMillis() < endTime) {



            // Check if pedestrians are waiting
            if (CrossWalkSimulation.buttonPushed) {

                System.out.println("Traffic Light notified that Pedestrians are waiting");

                CrossWalkSimulation.setPedestrianWaiting(false);

                CrossWalkSimulation.timeout(10000);
                CrossWalkSimulation.setState(new YellowState());
                return;
            }
        }

        CrossWalkSimulation.setState(new vehiclesGreenInt());
    }
}
