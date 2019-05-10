package fr.yncrea.cir3.annuaire.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SessionDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CartDto cart = new CartDto();
}

