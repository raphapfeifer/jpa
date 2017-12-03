package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(7);
		conta.setTitular("Danilo");
		conta.setAgencia("123");
		conta.setBanco("Banco do Brasil");
		conta.setNumero("456");
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		conta = em.find(Conta.class,7);
		
		
		em.remove(conta);
		
		conta.setBanco("Bradesco");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

}
