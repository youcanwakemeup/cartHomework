package pro.sky.cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SessionScope
@Component
public class Cart {
    private final Set<Integer> cart = new HashSet<>();

    public Set<Integer> getCart() {
        return cart;
    }
    public void addItems(Integer...ids) {
        cart.addAll(Arrays.asList(ids));
    }
}
