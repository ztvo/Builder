public class GameComputerBuilder implements ComputerBuilder{
    private String CPU;
    private String RAM;
    private String graphicsCard;
    private String powerSupply;

    public GameComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder addCPU() {
        System.out.println("Assembling CPU to the game model");
        this.CPU = "Intel Xeon Golden";
        return this;
    }

    @Override
    public ComputerBuilder addRAM() {
        System.out.println("Assembling RAM to the game model");
        this.RAM = "356 ГБ";
        return this;
    }

    @Override
    public ComputerBuilder addGraphicsCard() {
        System.out.println("Assembling graphic card to the game model");
        this.graphicsCard = "PowerColor Radeon RX 580";
        return this;
    }

    @Override
    public ComputerBuilder addPowerSupply() {
        System.out.println("Assembling power supply to the game model");
        this.powerSupply = "750 Вт";
        return this;
    }

    @Override
    public Computer build() {
        Computer computer = new Computer(CPU, RAM, graphicsCard, powerSupply);
        return computer;
    }
}
