import java.util.ArrayList;

public class Race {

    public String getRaceWinnerCarName(ArrayList<Car> cars) {
        if (cars.isEmpty()) {
            return null;
        }
        Car actualWinnerCar = null;
        int maxKilometers = 0;
        int actualKilometers;

        for (Car car : cars) {
            actualKilometers = car.speed * 24;
            if (actualKilometers > maxKilometers) {
                maxKilometers = actualKilometers;
                actualWinnerCar = car;
            }
        }

        return actualWinnerCar != null ? actualWinnerCar.name : null;
    }
}
