package Main;

import CrossWalkStates.State;
import VehicleStates.GreenState;

public class VehiclesEnabled implements State {
    CrossWalkSimulation crossWalkSimulation;

    VehiclesEnabled(CrossWalkSimulation crossWalkSimulation){
        this.crossWalkSimulation = crossWalkSimulation;

    }
    @Override
    public void handleEvent() {

        System.out.println("Handling Vehicles Enabled");

        while (true) {

            if (!crossWalkSimulation.pedestrianWaiting()) {

                crossWalkSimulation.timeout(new GreenState(this.crossWalkSimulation));
            }
        }



    }
}
