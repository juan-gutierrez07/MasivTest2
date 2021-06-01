package com.test.masiv.Masivtest.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.masiv.Masivtest.models.User;
@Repository
public interface UserRepositoryJPA extends JpaRepository<User, Long> {
	public abstract User findByid(Long id);
}
