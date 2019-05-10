package fr.yncrea.cir3.annuaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.yncrea.cir3.annuaire.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
}
