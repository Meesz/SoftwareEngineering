package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public class SlideDeployedState implements State{
    private final AircraftDoor door;

    public SlideDeployedState(AircraftDoor door) {
        this.door = door;
    }

    @Override
    public String lockDoor() {
        // Locking might not be allowed when slide is deployed
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String closeDoor() {
        // Closing might not be allowed when slide is deployed
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String openDoor() {
        // Opening might already be in its final state or require reset
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String armDoor() {
        // Arming might not be allowed when slide is deployed
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String slideDeployed() {
        // This action could be to initiate a reset procedure
        // Assuming there's a method to reset the door to a safe state,
        // that logic would be implemented here.
        return Messages.SLIDE_DEPLOYED;
    }

    @Override
    public String toString() {
       return Messages.SLIDE_DEPLOYED;
    }
}
