package com.ssa.ironyard.web;

import org.springframework.stereotype.Service;

import com.ssa.ironyard.web.Vegetable.Color;

@Service
public class FoodService {

    public Vegetable delivery()
    {
        return new Vegetable(Color.GREEN, "Watermelons");
}
}
