package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Abc;

@Repository
public interface AbcRepository extends JpaRepository<Abc, Integer> {

}
