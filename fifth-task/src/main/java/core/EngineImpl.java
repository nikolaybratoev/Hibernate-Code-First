package core;

import interfaces.Engine;

import javax.persistence.EntityManager;

public class EngineImpl implements Engine {
    private final EntityManager manager;

    public EngineImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {

    }
}
