package builder_pattern;

public interface ComputerBuilder {
    void buildRam();

    void buildCpu();

    void buildGpu();

    void buildStorage();

    Computer getComputer();

}
