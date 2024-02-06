package nl.hva.aircraft;

import nl.hva.state.*;

public class AircraftDoor {

    private State state;
    private final State openState;
    private final State closedState;
    private final State lockedState;
    private final State armedState;
    private final State deployedState; // Implement if needed
    private final String id;



    public AircraftDoor(String id) {
        this.id = id;
        // Initialize states
        openState = new OpenState(this);
        closedState = new ClosedState(this);
        lockedState = new LockedState(this);
        armedState = new ArmedState(this);
        deployedState = new DeployedState(this);

        // Set default state
        this.state = openState;
    }


    public String openDoor(){
        return state.openDoor();
    }
    public String closeDoor() {
        return state.closeDoor();
    }
    public String armDoor() {
        return state.armDoor();
    }
    public String lockDoor() {
        return state.lockDoor();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
    public State getOpenState(){ return openState; }
    public State getClosedState(){ return closedState; }
    public State getLockedState(){ return lockedState; }
    public State getArmedState() { return armedState; }

    public State getDeployedState() {
        return deployedState;
    }

    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append("\nnl.hva.aircraft.Aircraft Door: "+id);
        status.append("\n");
        status.append("nl.hva.state.State is " + state + "\n");
        return status.toString();
    }


}
