package pro.sky.cart.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
//@Scope("session")
public class CartServiceImpl implements CartService {
    private final ObjectMapper objectMapper;
    private final Set<Integer> cart = new HashSet<>();
    public CartServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    @Override
    public Set<Integer> get() {
        return cart;
    }
    @Override
    public String add(Integer... ids) {
        cart.addAll(Arrays.asList(ids));
        return "Добавлено в корзину";
    }
}
