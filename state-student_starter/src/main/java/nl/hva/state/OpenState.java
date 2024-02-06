package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public class OpenState implements State {
    private final AircraftDoor door;

    public OpenState(AircraftDoor door) {
        this.door = door;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String closeDoor() {
        door.setState(door.getClosedState());
        return Messages.CLOSED_STATE_MESSAGE;
    }

    @Override
    public String openDoor() {
        if(door.getState() instanceof ArmedState) {
            door.setState(door.getDeployedState());
            return Messages.SLIDE_DEPLOYED;
        }
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Already open
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION;
    }

    @Override
    public String toString() {
        return Messages.OPEN_STATE_MESSAGE;
    }
}
