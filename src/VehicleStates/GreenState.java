package VehicleStates;

import CrossWalkStates.State;
import Main.Context;
import Main.CrossWalkSimulation;

public class GreenState implements State {

    CrossWalkSimulation crossWalkSimulation;

    public GreenState(CrossWalkSimulation crossWalkSimulation){

        this.crossWalkSimulation = crossWalkSimulation;



    }
    @Override
    public void handleEvent() {


        System.out.println("GREEN");



        while (crossWalkSimulation.setTimer(10 * 1000)){

                crossWalkSimulation.timeout(new vehiclesGreenInt(this.crossWalkSimulation));


        }

        System.out.println("No pedestrians");


        try{
            Thread.sleep(15 * 1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

       crossWalkSimulation.timeout(new YellowState(this.crossWalkSimulation));


    }
}
