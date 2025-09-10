package builder_pattern;

public class GamingComputer implements ComputerBuilder {
    private final Computer computer;

    public GamingComputer() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i5");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

    @Override
    public void buildGpu() {
        computer.setGpu("Onboard Graphics");
    }

}
