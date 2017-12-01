package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Raphael");
		conta.setAgencia("123");
		conta.setBanco("Bradesco");
		conta.setNumero("456");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
