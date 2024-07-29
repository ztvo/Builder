public class OfficeComputerBuilder implements IComputerBuilder {
    private String CPU;
    private String RAM;
    private String graficsCard;
    private String powerSupply;

    public OfficeComputerBuilder() {
        super();
    }

    @Override
    public IComputerBuilder addCPU() {
        System.out.println("Assembling CPU to the office model");
        this.CPU = "AMD Ryzen 5500";
        return this;
    }

    @Override
    public IComputerBuilder addRAM() {
        System.out.println("Assembling RAM to the office model");
        this.RAM = "128 ГБ";
        return this;
    }

    @Override
    public IComputerBuilder addGraphicsCard() {
        System.out.println("Assembling graphic card to the office model");
        this.graficsCard = "GIGABYTE NVIDIA GeForce GT 103";
        return this;
    }

    @Override
    public IComputerBuilder addPowerSupply() {
        System.out.println("Assembling power supply to the office model");
        this.powerSupply = "450 Вт";
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(CPU, RAM, graficsCard, powerSupply);
    }
}
