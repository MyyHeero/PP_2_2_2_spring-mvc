package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {



    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", 2002, "red"));
        cars.add(new Car("BMW", 2001, "red"));
        cars.add(new Car("Toyota", 2000, "red"));
        cars.add(new Car("Audi", 2000, "red"));
        cars.add(new Car("Mercedes", 2001, "red"));
    }


    @Override
    public List<Car> getCars(Integer count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
    public List<Car> getAllCars() {
        return cars;
    }
}
