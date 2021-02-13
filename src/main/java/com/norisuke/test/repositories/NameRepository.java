package com.norisuke.test.repositories;

import com.norisuke.test.entities.NameEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<NameEntity, Integer> {
    
}
