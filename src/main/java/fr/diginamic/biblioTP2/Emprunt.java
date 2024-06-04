package fr.diginamic.biblioTP2;

import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	@Column(name = "date_debut")
	private Timestamp date_debut;

	@Column(name = "delai")
	private int delai;

	@Column(name = "date_fin")
	private Timestamp date_fin;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	

	@ManyToMany(mappedBy="emprunts")
	private Set<Livre> livres;

	/** Constructor
	 * 
	 */
	public Emprunt() {
		
	}

	
	@Override
	public String toString() {
		return "Emprunt [Date_debut = " + getDate_debut() + ", Delai = " + getDelai()
				+ ", date fin = " + getDate_fin() + ", Client = " + getClient() + "]";
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

	/** Getter for date_debut
	 * @return the date_debut
	 */
	public Timestamp getDate_debut() {
		return date_debut;
	}

	/** Setter for date_debut
	 * @param date_debut the date_debut to set
	 */
	public void setDate_debut(Timestamp date_debut) {
		this.date_debut = date_debut;
	}

	/** Getter for delai
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/** Setter for delai
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/** Getter for date_fin
	 * @return the date_fin
	 */
	public Timestamp getDate_fin() {
		return date_fin;
	}

	/** Setter for date_fin
	 * @param date_fin the date_fin to set
	 */
	public void setDate_fin(Timestamp date_fin) {
		this.date_fin = date_fin;
	}

	/** Getter for client
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter for client
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	/** Getter for livres
	 * @return the livres
	 */
	public Set<Livre> getLivres() {
		return livres;
	}
	

}
