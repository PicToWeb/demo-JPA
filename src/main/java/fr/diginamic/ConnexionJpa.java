package fr.diginamic;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ConnexionJpa {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		
		transaction.begin();

		Region r = em.find(Region.class, 1);
		if (r != null) {
			System.out.println(r.getNom());
		}
			

		Region region = new Region();
		region.setNom("Pyrenee2");
		em.persist(region);
		
		// permet de valider toutes les requete de type MAJ(insert,update,delete)
		transaction.commit();
		
		
		

		// CreateQuery ne fonctionne pas avec SQL mais du JPQL -> requete oriente objet "from NomDeLaClasse
		TypedQuery<Region> query1 = em.createQuery("SELECT r FROM Region r", Region.class);

		List<Region> listRegions = query1.getResultList();
		
		for(Region regionVue:listRegions)
		
		System.out.println(regionVue);

		em.close();
	}

}
