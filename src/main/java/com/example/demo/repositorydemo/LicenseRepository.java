package com.example.demo.repositorydemo;

import com.example.demo.entitydemo.License;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LicenseRepository extends CrudRepository<License, Long> {


}
