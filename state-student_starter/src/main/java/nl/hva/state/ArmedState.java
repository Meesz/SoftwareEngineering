package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public class ArmedState implements State {
    private final AircraftDoor door;

    public ArmedState(AircraftDoor door) {
        this.door = door;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Cannot lock when armed
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Cannot close, it's a state post-closure
    }

    @Override
    public String openDoor() {
        // If the door is opened in an armed state, we assume the slide deploys and the door needs resetting
        door.setState(door.getDeployedState());
        return Messages.SLIDE_DEPLOYED; // Assuming slide deploys, needs resetting
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Already armed
    }

    @Override
    public String toString() {
        return Messages.ARMED_STATE_MESSAGE;
    }
}
