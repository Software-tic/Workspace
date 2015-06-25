package sac.model;

/**
 * AbstractDecanoFacultad entity provides the base persistence definition of the
 * DecanoFacultad entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDecanoFacultadSAC implements java.io.Serializable {

	// Fields

	private Long idDecano;
	private Long idFacultad;
	private String mail;
	private String nomDecano;

	// Constructors

	/** default constructor */
	public AbstractDecanoFacultadSAC() {
	}

	/** minimal constructor */
	public AbstractDecanoFacultadSAC(Long idDecano) {
		this.idDecano = idDecano;
	}

	/** full constructor */
	public AbstractDecanoFacultadSAC(Long idDecano, Long idFacultad, String mail,
			String nomDecano) {
		this.idDecano = idDecano;
		this.idFacultad = idFacultad;
		this.mail = mail;
		this.nomDecano = nomDecano;
	}

	// Property accessors

	public Long getIdDecano() {
		return this.idDecano;
	}

	public void setIdDecano(Long idDecano) {
		this.idDecano = idDecano;
	}

	public Long getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNomDecano() {
		return this.nomDecano;
	}

	public void setNomDecano(String nomDecano) {
		this.nomDecano = nomDecano;
	}

}