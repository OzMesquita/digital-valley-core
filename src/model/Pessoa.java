package model;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import util.Constantes;
import util.ValidadorCPF;

import model.Usuario;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String imagem;
	private Usuario usuario;
	private LocalDate dataNascimento;

	public Pessoa(String nome, String cpf, String email, Usuario usuario, LocalDate dataNascimento) {
		this();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.usuario = usuario;
		this.dataNascimento = dataNascimento;
	}

	public Pessoa() {
		this.setUsuario(new Usuario());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			throw new IllegalArgumentException("Erro: O valor do id deve ser maior do que 0. Valor informardo: " + id);
		}
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.matches("^[aA-zZ]+(( [aA-zZ]+)+)?$")) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException(
					"Erro: O Nome não poder ser nulo e deve possuir pelo menos 1 caracteres. Valor informado:: " + nome);
		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (ValidadorCPF.isCPF(cpf)) {
			this.cpf = cpf;
		} else {
			throw new IllegalArgumentException(
					"Erro: CPF informado não é válido. Valor informado:: "+ cpf);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.matches("^[aA-zZ][aA-zZ0-9_.\'-]*@[aA-zZ]+.[aA-zZ]*(.br)?$")) {
			this.email = email;
		} else {
			throw new IllegalArgumentException("Erro: parâmetro e-mail inválido. Valor informado: " + email);
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		LocalDate localDate = LocalDate.now();
		if(dataNascimento.isAfter(localDate))
			throw new RuntimeException(
					"Erro: A data de nascimento está no futuro. Valor informado: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		
		LocalDate manyYearAgo = LocalDate.of(1900, 1, 1);
		if(dataNascimento.isBefore(manyYearAgo))
			throw new RuntimeException(
					"Erro: O sistema não reconhece datas anteriores ao ano de 1900. Valor informado: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"))); 
		
		this.dataNascimento = dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		String[] data = dataNascimento.split("/");
		String[] dataSql = dataNascimento.split("-");
		try {
			if (data.length == 3) {
				this.setDataNascimento(
						LocalDate.of(Integer.valueOf(data[2]), Integer.valueOf(data[1]), Integer.valueOf(data[0])));
			}else if(dataSql.length == 3){
				this.setDataNascimento(
						LocalDate.of(Integer.valueOf(dataSql[0]), Integer.valueOf(dataSql[1]), Integer.valueOf(dataSql[2])));
			}else{
			
				throw new RuntimeException(
						"Erro: A data de nascimento não está no formato correto. Valor informado: " + dataNascimento);
			}
		}catch (DateTimeException e) { 
			throw new DateTimeException(
						"Erro: A data de nascimento não existe. Valor informado: " + dataNascimento);
		
		}
	}
}
