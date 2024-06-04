package fr.diginamic.biblioTP2;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	@Column(name = "titre")
	private String titre;

	@Column(name = "auteur")
	private String auteur;
	
	@ManyToMany
	@JoinTable(name="COMPO", joinColumns= @JoinColumn(name="ID_LIV",referencedColumnName="ID"),inverseJoinColumns= @JoinColumn(name="ID_EMP",referencedColumnName="ID"))
	private Set<Emprunt> emprunts;
	/**
	 * Constructor
	 * 
	 */
	public Livre() {

	}

	@Override
	public String toString() {
		return "Livre [id = " + getId() + ", Titre = " + getTitre() + ", Auteur = " + getAuteur() + "]";
	}

	/**
	 * Getter for id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter for id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter for titre
	 * 
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Getter for auteur
	 * 
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

}
