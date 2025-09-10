package builder_pattern;

public class Main {
    public static void main(String[] args) {
        // Build Gaming PC
        ComputerBuilder gamingBuilder = new GamingComputer();
        ComputerDirector director = new ComputerDirector(gamingBuilder);
        Computer gamingPC = director.constructComputer();
        System.out.println("Gaming PC: " + gamingPC);
    }
}
