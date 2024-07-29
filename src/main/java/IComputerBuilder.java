public interface IComputerBuilder {

    // добавление процессора
    IComputerBuilder addCPU();

    // добавление оперативной памяти
    IComputerBuilder addRAM();

    // добавление видеокарты
    IComputerBuilder addGraphicsCard();

    // добавление блока питания
     IComputerBuilder addPowerSupply();

    // Выпуск компьютера
    Computer build();
}
