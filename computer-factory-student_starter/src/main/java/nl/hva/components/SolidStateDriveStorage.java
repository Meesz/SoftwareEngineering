package nl.hva.components;

public class SolidStateDriveStorage implements Storage{
    @Override
    public String getDetails() {
        return StorageType.SolidStateDrive.toString();
    }
}
