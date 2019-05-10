package fr.yncrea.cir3.annuaire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.yncrea.cir3.annuaire.repository.UserRepository;

@Service
public class DbUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository users;
	
	@Override
	public UserDetails loadUserByUsername(String login) {
		UserDetails user = users.findByUsername(login);
		if (user == null) {
			throw new UsernameNotFoundException(login);
		}
		
		return user;
	}
}
