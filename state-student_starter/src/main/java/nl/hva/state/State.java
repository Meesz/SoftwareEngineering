package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

public interface State {
    String lockDoor();
    String closeDoor();
    String openDoor();
    String armDoor();

    default String slideDeployed() {
        return Messages.SLIDE_DEPLOYED;
    }

}
