package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars;
        if (count != null) {
            cars = carService.getCars(count);
        } else {
            cars = carService.getAllCars();
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
