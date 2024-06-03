package fr.diginamic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="REGION")
public class Region {
	
	@Id
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
