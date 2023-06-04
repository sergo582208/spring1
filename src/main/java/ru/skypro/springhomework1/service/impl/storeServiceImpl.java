package ru.skypro.springhomework1.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.springhomework1.service.storeService;

import java.util.List;
import java.util.Set;

@Service

public class storeServiceImpl extends ru.skypro.springhomework1.service.impl.basket {
    private final basket basket;

    public storeServiceImpl(basket basket) {
        this.basket = basket;
    }

    @Override
    public Set<Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    @Override
    public Set<Integer> get() {
        return basket.get();

    }
}