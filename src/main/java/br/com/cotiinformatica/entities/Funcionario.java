package br.com.cotiinformatica.entities;

import br.com.cotiinformatica.enums.SituacaoFuncionario;

public class Funcionario {
	
	private Integer idFuncionario;
	private String nome;
	private String cpf;
	private String matricula;
	private double salario;
	private SituacaoFuncionario situacao;
	
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public Funcionario(Integer idFuncionario, String nome, String cpf, String matricula, double salario,
			SituacaoFuncionario situacao) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.situacao = situacao;
	}


	public Integer getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public SituacaoFuncionario getSituacao() {
		return situacao;
	}


	public void setSituacao(SituacaoFuncionario situacao) {
		this.situacao = situacao;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Funcionario [idFuncionario=" + idFuncionario + ",nome=" + nome + ",cpf=" + cpf + ", matricula=" + matricula + ", salario=" + salario + ", situacao=" + situacao + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Funcionario) {
			Funcionario funcionario = (Funcionario) obj;
			return this.idFuncionario.equals(funcionario.getIdFuncionario());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.idFuncionario.hashCode();
	}
}
