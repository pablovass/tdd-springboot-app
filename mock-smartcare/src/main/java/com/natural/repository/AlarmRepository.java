package com.natural.repository;

import com.natural.pojo.Alarm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlarmRepository extends MongoRepository<Alarm,String > {
    @Query("{SiteName:'?0'}")
    Alarm findItemByName(String siteName);

    Alarm findBySiteName(String siteName); // lo mismo

}