package fr.diginamic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="REGION")
public class Region {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // pour auto_increment
	private int id;
	@Column(name="NOM")
	private String nom;

	/** Constructor
	 * @param id
	 * @param nom
	 */
	public Region(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	/** Constructor
	 * @param id
	 * @param nom
	 */
	public Region() {
	}

	@Override
	public String toString() {
		return "Region [getId()=" + getId() + ", getNom()=" + getNom() + "]";
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
	
	

}
