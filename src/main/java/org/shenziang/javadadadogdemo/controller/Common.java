package org.shenziang.javadadadogdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Common {
    @GetMapping("/callOneFunc")
    public String calOneFunc() {
        randomIntSort(1000000);
        randomIntSort(500000);
        return "hello";
    }


    @GetMapping("/callTwoFunc")
    public String calTwoFunc() {
        randomIntSort(1000000);
        randomDoubleSort(500000);
        return "hello";
    }

    private void randomIntSort(int len) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt());
        }
        list.sort(Integer::compareTo);
    }

    private void randomDoubleSort(int len) {
        List<Double> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            list.add(random.nextDouble());
        }
        list.sort(Double::compareTo);
    }
}
