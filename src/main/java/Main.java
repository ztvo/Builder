import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int selection;
        boolean exit;
        ComputerBuilder builder;
        ComputerDirector director;
        Computer computer;
        System.out.println("Выберите конфигурацию компьютера");
        System.out.println("-------------------------\n");
        System.out.println("1 - Игровой");
        System.out.println("2 - Офисный");
        System.out.println("3 - Мультмедиа");
        System.out.println("4 - Выход");
        exit = false;
        while (!exit) {
            Scanner input = new Scanner(System.in);
            selection = input.nextInt();

            switch (selection) {
                case 1:
                    builder = new GameComputerBuilder();
                    director = new ComputerDirector(builder);
                    computer = director.assemblingComputer();
                    System.out.println(computer);
                    break;
                case 2:
                    builder = new OfficeComputerBuilder();
                    director = new ComputerDirector(builder);
                    computer = director.assemblingComputer();
                    System.out.println(computer);
                    break;
                case 3:
                    builder = new MultiMediaComputerBuilder();
                    director = new ComputerDirector(builder);
                    computer = director.assemblingComputer();
                    System.out.println(computer);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Если хотите выйти из приложения - нажмите 4!");

            }
        }
    }
}