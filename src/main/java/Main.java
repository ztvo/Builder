import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int selection;
        boolean exit;
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
                    ComputerBuilder builderGame = new GameComputerBuilder();
                    ComputerDirector directorGame = new ComputerDirector(builderGame);
                    Computer computerGame = directorGame.assemblingComputer();
                    System.out.println(computerGame);
                    break;
                case 2:
                    ComputerBuilder builderOffice = new OfficeComputerBuilder();
                    ComputerDirector directorOffice = new ComputerDirector(builderOffice);
                    Computer computerOffice = directorOffice.assemblingComputer();
                    System.out.println(computerOffice);
                    break;
                case 3:
                    ComputerBuilder builderMultiMedia = new MultiMediaComputerBuilder();
                    ComputerDirector directorMultiMedia = new ComputerDirector(builderMultiMedia);
                    Computer computerMultiMedia = directorMultiMedia.assemblingComputer();
                    System.out.println(computerMultiMedia);
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