package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CarrerasId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class CarrerasId implements java.io.Serializable {

	// Fields

	private String id;
	private Long facultad;
	private String nombre;

	// Constructors

	/** default constructor */
	public CarrerasId() {
	}

	/** minimal constructor */
	public CarrerasId(String id) {
		this.id = id;
	}

	/** full constructor */
	public CarrerasId(String id, Long facultad, String nombre) {
		this.id = id;
		this.facultad = facultad;
		this.nombre = nombre;
	}

	// Property accessors

	@Column(name = "id", nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "facultad")
	public Long getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Long facultad) {
		this.facultad = facultad;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CarrerasId))
			return false;
		CarrerasId castOther = (CarrerasId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFacultad() == castOther.getFacultad()) || (this
						.getFacultad() != null
						&& castOther.getFacultad() != null && this
						.getFacultad().equals(castOther.getFacultad())))
				&& ((this.getNombre() == castOther.getNombre()) || (this
						.getNombre() != null && castOther.getNombre() != null && this
						.getNombre().equals(castOther.getNombre())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getFacultad() == null ? 0 : this.getFacultad().hashCode());
		result = 37 * result
				+ (getNombre() == null ? 0 : this.getNombre().hashCode());
		return result;
	}

}