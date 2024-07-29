public class MultiMediaComputerBuilder implements IComputerBuilder {
    private String CPU;
    private String RAM;
    private String graphicsCard;
    private String powerSupply;

    public MultiMediaComputerBuilder() {
        super();
    }

    @Override
    public IComputerBuilder addCPU() {
        System.out.println("Assembling CPU to the multi media model");
        this.CPU = "Intel Core i3-10100F BOX";
        return this;
    }

    @Override
    public IComputerBuilder addRAM() {
        System.out.println("Assembling RAM to the multi media model");
        this.RAM = "356 ГБ";
        return this;
    }

    @Override
    public IComputerBuilder addGraphicsCard() {
        System.out.println("Assembling graphic card to the multi media model");
        this.graphicsCard = "PowerColor Radeon RX 580";
        return this;
    }

    @Override
    public IComputerBuilder addPowerSupply() {
        System.out.println("Assembling power supply to the multi media model");
        this.powerSupply = "500 Вт";
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(CPU, RAM, graphicsCard, powerSupply);
    }
}
