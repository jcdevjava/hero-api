package dev.jcpalma.hero.api;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import com.mongodb.reactivestreams.client.MongoDatabase;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



/**
 * Configures JAX-RS for the application.
 * @author Juneau
 */
@ApplicationPath("api")
public class RestApplication extends Application {
    public static MongoClient mongo;
    
    static {
        mongo = MongoClients.create();
    }
    
    public RestApplication() {
        MongoDatabase admin = mongo.getDatabase("local");
    }
}
