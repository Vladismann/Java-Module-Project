import java.util.ArrayList;

public class Race {

    public String getRaceWinnerCarName(ArrayList<Car> cars) {
        Car actualWinnerCar = new Car();
        int maxKilometers = 0;
        int actualKilometers;

        for (Car car : cars) {
            actualKilometers = car.speed * 24;
            if (actualKilometers > maxKilometers) {
                maxKilometers = actualKilometers;
                actualWinnerCar = car;
            }
        }

        return actualWinnerCar.name;
    }
}
