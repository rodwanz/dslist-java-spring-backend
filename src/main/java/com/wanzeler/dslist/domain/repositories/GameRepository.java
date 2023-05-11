package com.wanzeler.dslist.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanzeler.dslist.domain.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
