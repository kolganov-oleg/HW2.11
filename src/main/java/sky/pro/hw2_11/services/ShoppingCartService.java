package sky.pro.hw2_11.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@SessionScope

public class ShoppingCartService implements ShoppingCartServiceImpl {

    private List<Integer> itemList;

    public ShoppingCartService(List<Integer> itemList) {
        this.itemList = itemList;
    }

    @Override
    public void add(List<Integer> idList) {
        itemList = idList.stream()
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> get() {
        return Collections.unmodifiableList(itemList);
    }
}