package fr.yncrea.cir3.annuaire.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class User implements UserDetails {
	private static final long serialVersionUID = 1L;

	@Id @Column
	@GeneratedValue(generator = "seqAccount")
	@SequenceGenerator(name = "seqAccount", sequenceName = "seq_account")
	private Long id;

	@Column(length = 100)
	private String username;
	
	@Column(length = 100)
	private String password;

	@ManyToMany(fetch=FetchType.EAGER)
	private Collection<Authority> authorities;

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
