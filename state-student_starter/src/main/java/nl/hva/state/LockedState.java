package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public class LockedState implements State {
    private final AircraftDoor door;

    public LockedState(AircraftDoor door) {
        this.door = door;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Already locked
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Cannot close, it's a state post-closure
    }

    @Override
    public String openDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Cannot open when locked
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Cannot arm when locked
    }

    @Override
    public String toString() {
        return Messages.LOCKED_STATE_MESSAGE;
    }
}
