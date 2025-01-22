package com.springproject.gamehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.gamehub.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
