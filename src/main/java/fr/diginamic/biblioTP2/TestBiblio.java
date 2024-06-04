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

		System.out.println("------------- TP3");
		System.out.println("Requete pour extraire un emprunt en fonction de son id : ");
		Emprunt emp = em.find(Emprunt.class, 1);
		if (emp != null) {
			System.out.println(emp.toString());
		}
		System.out.println(" ");
		System.out.println("Récupérer tous les livres associés ");
		System.out.println(" ");
		
		TypedQuery<Emprunt> rechLivre = em.createQuery(
				"SELECT e FROM Emprunt e WHERE e.id =1", Emprunt.class);
		List<Emprunt> listeLivreEmprunts = rechLivre.getResultList();

		for (Emprunt LivreEmprunt : listeLivreEmprunts) {
			System.out.println(LivreEmprunt.toString());
			System.out.println(LivreEmprunt.getLivres());
			
		}
		
		
		TypedQuery<Emprunt> query2 = em.createQuery(
				"SELECT e FROM Emprunt e INNER JOIN Client c ON c.id = e.client.id WHERE c.id=1", Emprunt.class);

		List<Emprunt> listEmprunts = query2.getResultList();
		System.out.println("Requete pour extraire tous les emprunts d'un client donné");
		for (Emprunt EmpruntExist : listEmprunts) {
			System.out.println(EmpruntExist.toString());
			
		}

		em.close();

	}

}
