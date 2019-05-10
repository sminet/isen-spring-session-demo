package fr.yncrea.cir3.annuaire.dto;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDto implements Serializable {
	private static final long serialVersionUID = 1L;

	ArrayList<CartProductDto> products = new ArrayList<>();
}
