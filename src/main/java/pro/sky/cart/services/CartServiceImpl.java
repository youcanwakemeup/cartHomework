package pro.sky.cart.services;
import pro.sky.cart.Cart;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.cart.Cart;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service

public class CartServiceImpl implements CartService {
    public final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public Set<Integer> get() {
        return cart.getCart();
    }
    @Override
    public String add(Integer... ids) {
        cart.addItems(ids);
        return "Добавлено в корзину";
    }
}
