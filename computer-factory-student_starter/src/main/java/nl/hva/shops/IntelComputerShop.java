package nl.hva.shops;

import nl.hva.computers.BasicComputer;
import nl.hva.computers.Computer;
import nl.hva.computers.ComputerTypes;
import nl.hva.computers.GamingComputer;
import nl.hva.factories.ComputerComponentFactory;
import nl.hva.factories.IntelBasicComputerComponentFactory;
import nl.hva.factories.IntelGamingComputerComponentFactory;

public class IntelComputerShop extends ComputerShop {
    @Override
    protected Computer buildComputer(String computerType) {
        ComputerComponentFactory factory;
        Computer computer = null;

        if (computerType.equals(ComputerTypes.BASIC_COMPUTER)) {
            factory = new IntelBasicComputerComponentFactory();
            computer = new BasicComputer((IntelBasicComputerComponentFactory) factory);
            computer.setName("Intel Basic PC");
        } else if (computerType.equals(ComputerTypes.GAMING_COMPUTER)) {
            factory = new IntelGamingComputerComponentFactory();
            computer = new GamingComputer((IntelGamingComputerComponentFactory) factory);
            computer.setName("Intel Gaming PC");
        }

        return computer;
    }
}
