package pro.sky.cart.services;

import java.util.Set;

public interface CartService {
    Set<Integer> get();
    String add(Integer... ids);
}
