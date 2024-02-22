package Main;

import CrossWalkStates.State;

public class CrossWalkSimulation implements context {


    private static State state;

    public static long time;


    public static volatile boolean buttonPushed;




    CrossWalkSimulation(State state){

        CrossWalkSimulation.state = state;
        state.handleEvent();

    }

    public static void setTimer(long time){
        long startTime = System.currentTimeMillis();
        long endTime = startTime + time;

        CrossWalkSimulation.time = endTime;
    }



    public boolean timeout(int time){

        while (System.currentTimeMillis() > time){
            return true;
        }
            return false;

    }

    public static void signalPedestrians(boolean flag) {
        if (flag) {
            System.out.println("FLASH WALK LIGHT");
            try{
                Thread.sleep(15000);
            }
            catch (Exception ignored)
            {

            }

        }
        else{
            System.out.println("FLASH DONT WALK LIGHT");
            try{
                Thread.sleep(1000);
            }
            catch (Exception ignored)
            {

            }

        }
    }

    @Override
    public boolean pedestrianWaiting() {
        return CrossWalkSimulation.buttonPushed;
    }

    public static void setPedestrianWaiting(Boolean buttonPushed){
        CrossWalkSimulation.buttonPushed = buttonPushed;

    }


    public static void setState(State state){

        CrossWalkSimulation.state = state;
        state.handleEvent();
    }



    public static void main (String [] args){

        Thread pedestrian = new Thread(new Pedestrian());
        pedestrian.start();

        CrossWalkSimulation crossWalkSimulation = new CrossWalkSimulation(new VehiclesEnabled());





    }



}