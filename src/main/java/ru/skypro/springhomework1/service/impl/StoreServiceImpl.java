package ru.skypro.springhomework1.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service

public class StoreServiceImpl implements ru.skypro.springhomework1.service.StoreServiceImpl {
    private final basket basket;

    public StoreServiceImpl(basket basket) {
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