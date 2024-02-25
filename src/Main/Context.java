package Main;

import CrossWalkStates.State;

public interface Context {

    void timeout(State state);

    boolean pedestrianWaiting();

}
