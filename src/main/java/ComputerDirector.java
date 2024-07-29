public class ComputerDirector {

    final private IComputerBuilder builder;

    public ComputerDirector(IComputerBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Computer Director can't work without Computer Builder!");
        }
    }

    public Computer assemblingComputer() {
        return builder.addCPU().addRAM().addGraphicsCard().addPowerSupply().build();
    }
}
