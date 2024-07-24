import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        ArrayList<Car> cars = new ArrayList<>();
        int maxCarCount = 3;

        for (int i = 1; i <= maxCarCount; i++) {
            System.out.printf("Введите название машины №%d:%n", i);
            String carName = scanner.next();

            int actualSpeed;
            while (true) {
                System.out.printf("Укажите число для скорости машины №%d от 0 до 250:%n", i);
                if (scanner.hasNextInt()) {
                    actualSpeed = scanner.nextInt();
                    if (actualSpeed >= 0 && actualSpeed <= 250) {
                        break;
                    }
                } else {
                    System.out.println("Некорректный ввод.");
                    scanner.next();

                }
            }
            cars.add(new Car(carName, actualSpeed));
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + race.getRaceWinnerCarName(cars));
    }
}
