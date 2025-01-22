package com.springproject.gamehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.gamehub.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
