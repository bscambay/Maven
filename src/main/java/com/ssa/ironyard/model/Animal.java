package com.ssa.ironyard.model;

import org.springframework.stereotype.Component;

@Component
public class Animal {
     String name;
     String continent;
     String fact;
     String link;

    public Animal() {
    }
    
    public Animal(String name, String continent, String fact) {
        
        this.name = name;
        this.continent = continent;
        this.fact = fact;
        this.link = "/zoo/animals/" + name;
    }
public String getLink() {
    return link;
}
    public String getContinent() {
        return continent;
    }

    public String getFact() {
        return fact;
    }

    public String getName() {
        return name;
    }

}
