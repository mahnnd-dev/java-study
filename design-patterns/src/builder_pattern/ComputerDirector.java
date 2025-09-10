package builder_pattern;

public class ComputerDirector {
    private final ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
        builder.buildGpu();
        return builder.getComputer();
    }
}
