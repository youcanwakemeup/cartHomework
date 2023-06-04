package pro.sky.cart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cart.services.CartService;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/get")
    public Set<Integer> getCart() {
        return cartService.get();
    }
    @GetMapping("/add")
    public String addCart(@RequestParam("id") Integer... ids) {
        return cartService.add(ids);
    }
}
