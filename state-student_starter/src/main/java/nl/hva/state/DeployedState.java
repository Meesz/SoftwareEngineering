package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public class DeployedState implements State {
    private final AircraftDoor door;

    public DeployedState(AircraftDoor door) {
        this.door = door;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String openDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String slideDeployed() {
        return Messages.SLIDE_DEPLOYED; // Specific action for deployed state
    }

    @Override
    public String toString() {
        return Messages.SLIDE_DEPLOYED;
    }

}
