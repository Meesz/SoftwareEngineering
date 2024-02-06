package nl.hva.computers;

import nl.hva.factories.IntelBasicComputerComponentFactory;

public class BasicComputer extends Computer {
    public BasicComputer(IntelBasicComputerComponentFactory factory) {
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
        graphicsCard = null;
    }
}
