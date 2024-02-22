package Main;

public class Pedestrian implements Runnable{


    Pedestrian(){}




    @Override
    public void run() {

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }


        CrossWalkSimulation.setPedestrianWaiting(true);


    }
}
