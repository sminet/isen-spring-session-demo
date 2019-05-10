package fr.yncrea.cir3.annuaire.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import fr.yncrea.cir3.annuaire.dto.SessionDto;

@Configuration
public class SessionConfig {
	@Bean
	@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public SessionDto session() {
		return new SessionDto();
	}
}

