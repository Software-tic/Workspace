package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FacultadesId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class FacultadesId implements java.io.Serializable {

	// Fields

	private Long identificador;
	private String facultad;

	// Constructors

	/** default constructor */
	public FacultadesId() {
	}

	/** minimal constructor */
	public FacultadesId(Long identificador) {
		this.identificador = identificador;
	}

	/** full constructor */
	public FacultadesId(Long identificador, String facultad) {
		this.identificador = identificador;
		this.facultad = facultad;
	}

	// Property accessors

	@Column(name = "identificador", nullable = false)
	public Long getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	@Column(name = "facultad")
	public String getFacultad() {
		return this.facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FacultadesId))
			return false;
		FacultadesId castOther = (FacultadesId) other;

		return ((this.getIdentificador() == castOther.getIdentificador()) || (this
				.getIdentificador() != null
				&& castOther.getIdentificador() != null && this
				.getIdentificador().equals(castOther.getIdentificador())))
				&& ((this.getFacultad() == castOther.getFacultad()) || (this
						.getFacultad() != null
						&& castOther.getFacultad() != null && this
						.getFacultad().equals(castOther.getFacultad())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdentificador() == null ? 0 : this.getIdentificador()
						.hashCode());
		result = 37 * result
				+ (getFacultad() == null ? 0 : this.getFacultad().hashCode());
		return result;
	}

}