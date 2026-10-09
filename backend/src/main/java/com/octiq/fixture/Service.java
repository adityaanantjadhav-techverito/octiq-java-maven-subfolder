package com.octiq.fixture;

public class Service {
    public String status() {
        var state = "ok";
        return "backend: " + state;
    }
}
