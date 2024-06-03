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
		
		Region r = em.find(Region.class,1);
		if(r!= null) {
			System.out.println(r.getNom());
		}
		transaction.commit();
		
//		transaction.begin();
//		
//		Region region = new Region();
//		region.setId(2);
//		region.setNom("Pyrenee");
//		em.persist(region);
//		
//		transaction.commit();
		
		transaction.begin();
		
		TypedQuery<Region> query1 = em.createQuery("SELECT region FROM REGION region",Region.class);
		
		List<Region> regions = query1.getResultList();
		System.out.println(regions);
		
		transaction.commit();
		
	}

}
