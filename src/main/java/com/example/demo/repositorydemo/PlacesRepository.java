package com.example.demo.repositorydemo;

import com.example.demo.entitydemo.Places;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacesRepository extends CrudRepository<Places,Long> {
}
