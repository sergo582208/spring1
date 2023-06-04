package ru.skypro.springhomework1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.springhomework1.service.StoreService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private StoreService storeService;

    protected void StoreController(StoreService StoreService) {
        this.storeService = storeService;
        storeService = StoreService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> ids) {
        return storeService.add(ids);
    }

    @GetMapping("/get")
    public Set<Integer> get() {

        return storeService.get();
    }
}
