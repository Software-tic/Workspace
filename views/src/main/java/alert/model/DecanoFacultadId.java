package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DecanoFacultadId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DecanoFacultadId implements java.io.Serializable {

	// Fields

	private Long idDecano;
	private Long idFacultad;
	private String mail;
	private String nomDecano;

	// Constructors

	/** default constructor */
	public DecanoFacultadId() {
	}

	/** minimal constructor */
	public DecanoFacultadId(Long idDecano) {
		this.idDecano = idDecano;
	}

	/** full constructor */
	public DecanoFacultadId(Long idDecano, Long idFacultad, String mail,
			String nomDecano) {
		this.idDecano = idDecano;
		this.idFacultad = idFacultad;
		this.mail = mail;
		this.nomDecano = nomDecano;
	}

	// Property accessors

	@Column(name = "id_decano", nullable = false)
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DecanoFacultadId))
			return false;
		DecanoFacultadId castOther = (DecanoFacultadId) other;

		return ((this.getIdDecano() == castOther.getIdDecano()) || (this
				.getIdDecano() != null && castOther.getIdDecano() != null && this
				.getIdDecano().equals(castOther.getIdDecano())))
				&& ((this.getIdFacultad() == castOther.getIdFacultad()) || (this
						.getIdFacultad() != null
						&& castOther.getIdFacultad() != null && this
						.getIdFacultad().equals(castOther.getIdFacultad())))
				&& ((this.getMail() == castOther.getMail()) || (this.getMail() != null
						&& castOther.getMail() != null && this.getMail()
						.equals(castOther.getMail())))
				&& ((this.getNomDecano() == castOther.getNomDecano()) || (this
						.getNomDecano() != null
						&& castOther.getNomDecano() != null && this
						.getNomDecano().equals(castOther.getNomDecano())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdDecano() == null ? 0 : this.getIdDecano().hashCode());
		result = 37
				* result
				+ (getIdFacultad() == null ? 0 : this.getIdFacultad()
						.hashCode());
		result = 37 * result
				+ (getMail() == null ? 0 : this.getMail().hashCode());
		result = 37 * result
				+ (getNomDecano() == null ? 0 : this.getNomDecano().hashCode());
		return result;
	}

}