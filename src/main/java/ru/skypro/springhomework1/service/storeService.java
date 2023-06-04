package ru.skypro.springhomework1.service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;


public interface storeService {

    Set<Integer> add( List<Integer> ids);
    Set<Integer> get();
}

