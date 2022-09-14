package com.pablovass.dao;

import com.pablovass.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User save(User user) {
        return mongoTemplate.save(user);
    }

    @Override
    public boolean update(User user) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(user.getId()));

        Update update = new Update();
        update.set("name", user.getName());
        update.set("age", user.getAge());
        update.set("gender", user.getGender());
        update.set("country", user.getCountry());

        return mongoTemplate.updateFirst(query, update, User.class).wasAcknowledged();
    }

    @Override
    public boolean remove(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        return mongoTemplate.remove(query, User.class).wasAcknowledged();
    }

    @Override
    public List<User> search() {
        return mongoTemplate.findAll(User.class);
    }
}