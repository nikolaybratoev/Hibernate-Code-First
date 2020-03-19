package core;

import interfaces.Engine;

import javax.persistence.EntityManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EngineImpl implements Engine {

    private BufferedReader reader;
    private EntityManager manager;

    public EngineImpl(EntityManager manager) {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.manager = manager;
    }

    @Override
    public void run() {

    }
}
