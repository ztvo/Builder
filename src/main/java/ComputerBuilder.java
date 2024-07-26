public interface ComputerBuilder {

    // добавление процессора
    public ComputerBuilder addCPU();

    // добавление оперативной памяти
    public ComputerBuilder addRAM();

    // добавление видеокарты
    public ComputerBuilder addGraphicsCard();

    // добавление блока питания

    public ComputerBuilder addPowerSupply();

    // Выпуск компьютера

    public Computer build();
}
