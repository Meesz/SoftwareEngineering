package nl.hva.computers;

import nl.hva.components.StorageType;
import nl.hva.factories.IntelGamingComputerComponentFactory;

public class GamingComputer extends Computer{
    public GamingComputer(IntelGamingComputerComponentFactory factory) {
        super(factory);
    }
    @Override
    public void prepare() {
        System.out.println("Building " + name);
        computerCase = computerComponentFactory.selectCase();
        powerSupply = computerComponentFactory.selectPowerSupply();
        motherBoard = computerComponentFactory.selectMotherBoard();
        processor = computerComponentFactory.selectProcessor();
        memory = computerComponentFactory.selectMemory();
        storage = computerComponentFactory.selectStorage();
        graphicsCard = computerComponentFactory.selectGraphicsCard();
    }
}
