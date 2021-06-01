package com.test.masiv.Masivtest.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.test.masiv.Masivtest.models.Roulette;

@Repository
public interface RouletteRepositoryJPA extends JpaRepository<Roulette, Long> {

	public abstract Roulette findByid(Long id);
}
