package com.menescal.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menescal.library.model.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
