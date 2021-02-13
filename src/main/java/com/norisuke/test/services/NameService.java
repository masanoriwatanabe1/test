package com.norisuke.test.services;

import java.util.List;

import com.norisuke.test.entities.NameEntity;
import com.norisuke.test.repositories.NameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService {
    @Autowired
    private NameRepository repo;

    public List<NameEntity> getAll(){
        return repo.findAll();
    }
}
