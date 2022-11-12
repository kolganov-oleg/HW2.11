package sky.pro.hw2_11.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.hw2_11.services.ShoppingCartServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    public final ShoppingCartServiceImpl shoppingCartInterface;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartServiceImpl) {
        this.shoppingCartInterface = shoppingCartServiceImpl;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam List<Integer> ids) {
        shoppingCartInterface.add(ids);
        return "Items successfully added to cart!";
    }

    @GetMapping("/get")
    public List<Integer> getCart() {
        return shoppingCartInterface.get();
    }
}