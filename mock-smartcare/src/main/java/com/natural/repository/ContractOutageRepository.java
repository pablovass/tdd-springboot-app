package com.natural.repository;

import com.natural.pojo.ContractOutage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContractOutageRepository extends MongoRepository<ContractOutage, String> {
}
