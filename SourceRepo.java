package com.jatin.demo.dao;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.jatin.demo.model.Source;
  
public interface SourceRepo extends MongoRepository<Source,Integer>{
  
}