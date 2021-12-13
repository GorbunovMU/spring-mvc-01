package com.luxoft.springmvc01;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomCheck implements HealthIndicator {
    @Override
    public Health health() {
        return new Random().nextBoolean()
                ? Health.up().build()
                : Health.down().build();
    }
}
