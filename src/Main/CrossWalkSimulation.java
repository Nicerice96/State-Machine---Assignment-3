package Main;

import CrossWalkStates.State;
import VehicleStates.GreenState;

import javax.naming.*;
import javax.naming.Context;
import java.util.Hashtable;

public class CrossWalkSimulation implements Context {


    private static State state;

    public static volatile boolean  buttonPushed;



    CrossWalkSimulation(State state){

        this.state = state;

    }

    public static void timeout(int time){

        try {
            Thread.sleep(time);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void signalPedestrians(boolean flag) {
        if (flag) {
            System.out.println("WALK LIGHT ON");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
        else{
            System.out.println("DONT WALK LIGHT ON");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }

            System.out.println("DONT WALK LIGHT OFF");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }



    public static boolean setPedestrianWaiting(Boolean buttonPushed){
        return CrossWalkSimulation.buttonPushed = buttonPushed;
    }

    public static void setState(State state){

        CrossWalkSimulation.state = state;
        state.handleEvent();
    }



    public static void main (String [] args){

        Thread pedestrian = new Thread(new Pedestrian());
        pedestrian.start();
        CrossWalkSimulation.setState(new GreenState());






    }
































    @Override
    public Object lookup(Name name) throws NamingException {
        return null;
    }

    @Override
    public Object lookup(String name) throws NamingException {
        return null;
    }

    @Override
    public void bind(Name name, Object obj) throws NamingException {

    }

    @Override
    public void bind(String name, Object obj) throws NamingException {

    }

    @Override
    public void rebind(Name name, Object obj) throws NamingException {

    }

    @Override
    public void rebind(String name, Object obj) throws NamingException {

    }

    @Override
    public void unbind(Name name) throws NamingException {

    }

    @Override
    public void unbind(String name) throws NamingException {

    }

    @Override
    public void rename(Name oldName, Name newName) throws NamingException {

    }

    @Override
    public void rename(String oldName, String newName) throws NamingException {

    }

    @Override
    public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
        return null;
    }

    @Override
    public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
        return null;
    }

    @Override
    public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
        return null;
    }

    @Override
    public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
        return null;
    }

    @Override
    public void destroySubcontext(Name name) throws NamingException {

    }

    @Override
    public void destroySubcontext(String name) throws NamingException {

    }

    @Override
    public Context createSubcontext(Name name) throws NamingException {
        return null;
    }

    @Override
    public Context createSubcontext(String name) throws NamingException {
        return null;
    }

    @Override
    public Object lookupLink(Name name) throws NamingException {
        return null;
    }

    @Override
    public Object lookupLink(String name) throws NamingException {
        return null;
    }

    @Override
    public NameParser getNameParser(Name name) throws NamingException {
        return null;
    }

    @Override
    public NameParser getNameParser(String name) throws NamingException {
        return null;
    }

    @Override
    public Name composeName(Name name, Name prefix) throws NamingException {
        return null;
    }

    @Override
    public String composeName(String name, String prefix) throws NamingException {
        return null;
    }

    @Override
    public Object addToEnvironment(String propName, Object propVal) throws NamingException {
        return null;
    }

    @Override
    public Object removeFromEnvironment(String propName) throws NamingException {
        return null;
    }

    @Override
    public Hashtable<?, ?> getEnvironment() throws NamingException {
        return null;
    }

    @Override
    public void close() throws NamingException {

    }

    @Override
    public String getNameInNamespace() throws NamingException {
        return null;
    }
}