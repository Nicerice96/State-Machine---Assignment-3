package VehicleStates;

import CrossWalkStates.State;
import Main.CrossWalkSimulation;
import VehicleStates.GreenState;

/**
 * Vehicles Enabled Class acts as the entry to the Traffic light states
 */
public class VehiclesEnabled extends State {
    CrossWalkSimulation crossWalkSimulation;

    public VehiclesEnabled(CrossWalkSimulation crossWalkSimulation){
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
