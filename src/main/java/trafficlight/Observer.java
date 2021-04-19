package trafficlight;

import trafficlight.states.State;

public interface Observer {

    void update(State s);

    /*
    void update(Subject s); //generischer
    void update(State s);
    * */


}
