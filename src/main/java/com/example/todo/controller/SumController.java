package com.example.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.service.SumCalculator;
import com.example.todo.controller.dto.SumRequest;

@RestController
public class SumController {

    private final SumCalculator sumCalculator;

    public SumController(SumCalculator sumCalculator) {
        this.sumCalculator = sumCalculator;
    }

    // Example: GET /sum?a=2&b=3  -> returns 5
    @GetMapping("/sum")
    public int getSum(@RequestParam int a, @RequestParam int b) {
        return sumCalculator.sum(a, b);
    }

    // POST /sum  with JSON body: { "a": 2, "b": 3 }
    @PostMapping("/sum")
    public int postSum(@RequestBody SumRequest body) {
        return sumCalculator.sum(body.getA(), body.getB());
    }
}

