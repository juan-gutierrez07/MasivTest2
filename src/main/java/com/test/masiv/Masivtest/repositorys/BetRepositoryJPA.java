package com.test.masiv.Masivtest.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.masiv.Masivtest.models.Bet;

@Repository
public interface BetRepositoryJPA extends JpaRepository<Bet, Long>{

}
