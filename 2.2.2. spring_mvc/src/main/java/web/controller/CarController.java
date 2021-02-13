package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String index(@RequestParam("count") Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Brand1", "Model1", 1));
        cars.add(new Car("Brand2", "Model2", 2));
        cars.add(new Car("Brand3", "Model3", 3));
        cars.add(new Car("Brand4", "Model4", 4));
        cars.add(new Car("Brand5", "Model5", 5));
        if ((count >= 5) || (count == null) || (count < 0)) {
            count = 5;
        }
        List<Car> list = cars.stream().limit(count).collect(Collectors.toList());
        model.addAttribute("cars", list);
        return "index1";
    }
}
