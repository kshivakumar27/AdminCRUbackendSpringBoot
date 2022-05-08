package io.shiv.backend;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	Optional<User> findById(Long id);

	void deleteById(Long id);


	
    
}