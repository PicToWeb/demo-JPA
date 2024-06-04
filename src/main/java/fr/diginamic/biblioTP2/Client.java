package fr.diginamic.biblioTP2;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunts;

	/** Constructor
	 * 
	 */
	public Client() {
		
	}

	
	@Override
	public String toString() {
		return "Client [id = " + getId() + ", nom = " + getNom() + ", prenom = " + getPrenom() + "]";
	}


	/** Getter for id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter for id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter for prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter for prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
