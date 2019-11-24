package com.robson.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robson.cursomc.domain.User;

@Repository
public interface CategoriaRepository extends JpaRepository<User, Integer> {

}
