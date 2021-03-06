package br.ufc.russas.n2s.core.teste.model;

import org.junit.Test;

import model.Modulo;

public class ModuloTest {

	Modulo modulo = new Modulo();

	@Test(expected = IllegalArgumentException.class)
	public void tituloInvalido() {
		modulo.setTitulo("");
	}

	@Test(expected = IllegalArgumentException.class)
	public void urlInvalido() {
		modulo.setUrl("");
	}

	@Test(expected = IllegalArgumentException.class)
	public void imagemInvalido() {
		modulo.setImagem(null);
	}

	@Test
	public void ModuloValido() {
		modulo.setTitulo("Titulo");
		modulo.setUrl("url");
		modulo.setImagem("imagem");
	}

}
