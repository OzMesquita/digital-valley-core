package br.ufc.russas.n2s.core.teste.model;

import org.junit.Assert;
import org.junit.Test;

import model.Professor;

public class ProfessorTest {

	Professor professor = new Professor();

	@Test
	public void testIsCoordenado() {
		professor.setCoordenador(true);
		Assert.assertTrue(professor.isCoordenador());
	}

}
