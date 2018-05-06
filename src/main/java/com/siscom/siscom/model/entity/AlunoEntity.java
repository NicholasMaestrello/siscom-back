package com.siscom.siscom.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Aluno")
public class AlunoEntity implements Serializable {

	private static final long serialVersionUID = -6446725008453812421L;

	@Id
	@Column(name="AluId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="AluNome")
	private String nome;
	
	@Column(name="AluEnd")
	private String endereco;
	
	@Column(name="AluCPF")
	private String cpf;
	
	@Column(name="AluBairro")
	private String bairro;
	
	@Column(name="AluCel")
	private String cel;
	
	@Column(name="AluTel")
	private String tel;
	
	@Column(name="AluPaga")
	private String paga;
	
	@Column(name="AluDataEnt")
	private String dataEnt;
	
	@Column(name="AluDataVenc")
	private String dataVenc;
	
	@OneToMany(mappedBy="aluno", cascade=CascadeType.ALL, targetEntity= MatriculaEntity.class, fetch = FetchType.EAGER)
	private List<MatriculaEntity> matriculas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPaga() {
		return paga;
	}

	public void setPaga(String paga) {
		this.paga = paga;
	}

	public String getDataEnt() {
		return dataEnt;
	}

	public void setDataEnt(String dataEnt) {
		this.dataEnt = dataEnt;
	}

	public String getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(String dataVenc) {
		this.dataVenc = dataVenc;
	}
}
