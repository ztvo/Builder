public interface ComputerBuilder {

    // добавление процессора
    ComputerBuilder addCPU();

    // добавление оперативной памяти
    ComputerBuilder addRAM();

    // добавление видеокарты
    ComputerBuilder addGraphicsCard();

    // добавление блока питания
     ComputerBuilder addPowerSupply();

    // Выпуск компьютера
    Computer build();
}
