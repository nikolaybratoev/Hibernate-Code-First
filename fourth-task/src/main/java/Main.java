import core.EngineImpl;
import interfaces.Engine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("hospital_db");

        EntityManager manager = factory.createEntityManager();

        Engine engine = new EngineImpl(manager);
        engine.run();
    }
}
