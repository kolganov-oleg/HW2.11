package sky.pro.hw2_11.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public interface ShoppingCartServiceImpl {
    void add(List<Integer> IDList);

    List<Integer> get();
}