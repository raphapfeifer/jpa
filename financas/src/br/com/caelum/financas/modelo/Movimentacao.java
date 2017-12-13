package br.com.caelum.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

@Entity
public class Movimentacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	
	private String descricao;

	@ManyToOne
	private Conta conta;
	
	@ManyToMany
	private List<Categoria> categoria;
	

	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public TipoMovimentacao getTipo() {
		return tipo;
	}


	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Categoria> getCategoria() {
		return categoria;
	}


	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
	
	
	

}
