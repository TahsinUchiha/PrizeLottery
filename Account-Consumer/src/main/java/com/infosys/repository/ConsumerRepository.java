package com.infosys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Accounts;

	
@Repository
public interface ConsumerRepository extends MongoRepository<Accounts, Long> {
}
