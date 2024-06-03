package fr.diginamic.biblioTP2;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class TestBiblio {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("biblio");
		EntityManager em = entityManagerFactory.createEntityManager();


		Livre liv = em.find(Livre.class, 1);
		if (liv != null) {
			System.out.println(liv.toString());
		}

		TypedQuery<Livre> query1 = em.createQuery("SELECT l FROM Livre l", Livre.class);

		List<Livre> listLivres = query1.getResultList();

		for (Livre livreExist : listLivres)

			System.out.println(livreExist);

		em.close();

	}

}
