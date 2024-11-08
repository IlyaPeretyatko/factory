package org.nsu.oop.task4.details;

import java.util.UUID;

public class Accessory implements  Detail {
    private final UUID id;

    public Accessory() {
        this.id = UUID.randomUUID();
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public String getName() { return "Accessory"; }

}