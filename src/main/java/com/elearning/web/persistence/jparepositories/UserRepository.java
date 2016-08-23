package com.elearning.web.persistence.jparepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.web.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByEmail(String email);

}
