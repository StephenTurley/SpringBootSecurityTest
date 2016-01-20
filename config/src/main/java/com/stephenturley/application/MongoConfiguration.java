package com.stephenturley.application;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.Resource;
import java.util.function.Function;

@Configuration
@EnableMongoRepositories(basePackages = "com.stephenturley")
@Slf4j
public class MongoConfiguration extends AbstractMongoConfiguration {


    private Function<MongoClientURI, MongoClient> mongoClientFactory;

    @Override
    protected String getDatabaseName() {
        return "foo";
    }

    public MongoConfiguration() {
        mongoClientFactory = urlArg -> {
            try {
                return new MongoClient(urlArg);
            } catch (Exception ex) {
                log.error("Error trying to connect to mongo at: ", urlArg);
            }
            return null;
        };
    }


    @Override
    public Mongo mongo() throws Exception {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/yo");

        return mongoClientFactory.apply(uri);
    }
}