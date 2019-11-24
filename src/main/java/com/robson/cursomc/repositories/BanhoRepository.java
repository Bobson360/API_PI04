package com.robson.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robson.cursomc.domain.Banho;

@Repository
public interface BanhoRepository extends JpaRepository<Banho, Integer> {

}
