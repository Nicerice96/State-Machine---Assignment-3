package Main;

public class Pedestrian implements Runnable{
    @Override
    public void run() {

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Pedestrian Pressed a Button");
        System.out.println(CrossWalkSimulation.setPedestrianWaiting(true));

    }
}
