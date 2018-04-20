package model;

import org.junit.Test;

public class PessoaTest {

	
	@Test(expected=IllegalArgumentException.class)
	public void cpfInvalido(){
		Pessoa p = new Pessoa();
		p.setCpf("123.456.789-110");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nomeInvalido(){
		Pessoa p = new Pessoa();
		p.setNome("");
	}
	@Test(expected=IllegalArgumentException.class)
	public void emailInvalido(){
		Pessoa p = new Pessoa();
		p.setEmail("emailerrado");
	}
	@Test(expected=RuntimeException.class)
	public void dataInvalido(){
		Pessoa p = new Pessoa();
		p.setDataNascimento("01011999");
	}
	

	@Test
	public void valido(){
		Pessoa p = new Pessoa();
		p.setNome("Deyvison");
		p.setCpf("12345678910");
		p.setEmail("marilia.mendes@ufc.br");
		String[] data = "01/12/2000".split("/");
		System.out.println(data.length);
		p.setDataNascimento("01/12/2000");
		System.out.println("teste"+p.getDataNascimento());
		
	}
	
}
