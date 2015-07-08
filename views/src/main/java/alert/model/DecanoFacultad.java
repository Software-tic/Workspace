package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DecanoFacultad entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "decano_facultad", schema = "zyos")
public class DecanoFacultad implements java.io.Serializable {

	// Fields

	private Long idDecano;
	private Long idFacultad;
	private String mail;
	private String nomDecano;

	// Constructors

	/** default constructor */
	public DecanoFacultad() {
	}

	/** minimal constructor */
	public DecanoFacultad(Long idDecano) {
		this.idDecano = idDecano;
	}

	/** full constructor */
	public DecanoFacultad(Long idDecano, Long idFacultad, String mail,
			String nomDecano) {
		this.idDecano = idDecano;
		this.idFacultad = idFacultad;
		this.mail = mail;
		this.nomDecano = nomDecano;
	}

	// Property accessors
	@Id
	@Column(name = "id_decano", unique = true, nullable = false)
	public Long getIdDecano() {
		return this.idDecano;
	}

	public void setIdDecano(Long idDecano) {
		this.idDecano = idDecano;
	}

	@Column(name = "id_facultad")
	public Long getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

	@Column(name = "mail")
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "nom_decano")
	public String getNomDecano() {
		return this.nomDecano;
	}

	public void setNomDecano(String nomDecano) {
		this.nomDecano = nomDecano;
	}

}