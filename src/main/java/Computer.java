public class Computer {
    private String CPU;
    private String RAM;
    private String graphicsCard;
    private String powerSupply;

    public Computer() {
        super();
    }

    public Computer(String CPU, String RAM, String graficsCard, String powerSupply) {
        this();
        this.CPU = CPU;
        this.RAM = RAM;
        this.graphicsCard = graficsCard;
        this.powerSupply = powerSupply;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graficsCard) {
        this.graphicsCard = graficsCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Computer [CPU=").append(CPU).append(", RAM=").append(RAM).append(", graphic card=")
                .append(graphicsCard).append(", graphic card=").append(powerSupply).append("]");
        return builder.toString();
    }
}
