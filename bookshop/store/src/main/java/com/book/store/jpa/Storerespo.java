package com.book.store.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.store.entity.Entitiystore;

@Repository
public interface Storerespo extends JpaRepository<Entitiystore,Integer> {

}
