package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public class ClosedState implements State {
    private final AircraftDoor door;

    public ClosedState(AircraftDoor door) {
        this.door = door;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Already locked
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_CANNOT_PERFORM_THIS_ACTION; // Already closed
    }

    @Override
    public String openDoor() {
        if (door.getState() instanceof ArmedState) {
            // If the door is armed, deploying the slide
            // door.setState(door.getDeployedState());
            // return Messages.SLIDE_DEPLOYED;
            return Messages.DOOR_NEEDS_RESETTING; // Assuming slide deploys, needs resetting
        }
        door.setState(door.getOpenState());
        return Messages.OPEN_STATE_MESSAGE;
    }

    @Override
    public String armDoor() {
        door.setState(door.getArmedState());
        return Messages.ARMED_STATE_MESSAGE;
    }

    @Override
    public String toString() {
        return Messages.CLOSED_STATE_MESSAGE;
    }

}