package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MateriasId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class MateriasId implements java.io.Serializable {

	// Fields

	private String id;
	private String fechaFin;
	private String fechaInicio;
	private Long intHoraria;
	private String nombre;
	private Integer semestre;

	// Constructors

	/** default constructor */
	public MateriasId() {
	}

	/** minimal constructor */
	public MateriasId(String id) {
		this.id = id;
	}

	/** full constructor */
	public MateriasId(String id, String fechaFin, String fechaInicio,
			Long intHoraria, String nombre, Integer semestre) {
		this.id = id;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.intHoraria = intHoraria;
		this.nombre = nombre;
		this.semestre = semestre;
	}

	// Property accessors

	@Column(name = "id", nullable = false, length = 5)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "fecha_fin", length = 10)
	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name = "fecha_inicio", length = 10)
	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name = "int_horaria")
	public Long getIntHoraria() {
		return this.intHoraria;
	}

	public void setIntHoraria(Long intHoraria) {
		this.intHoraria = intHoraria;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "semestre")
	public Integer getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MateriasId))
			return false;
		MateriasId castOther = (MateriasId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFechaFin() == castOther.getFechaFin()) || (this
						.getFechaFin() != null
						&& castOther.getFechaFin() != null && this
						.getFechaFin().equals(castOther.getFechaFin())))
				&& ((this.getFechaInicio() == castOther.getFechaInicio()) || (this
						.getFechaInicio() != null
						&& castOther.getFechaInicio() != null && this
						.getFechaInicio().equals(castOther.getFechaInicio())))
				&& ((this.getIntHoraria() == castOther.getIntHoraria()) || (this
						.getIntHoraria() != null
						&& castOther.getIntHoraria() != null && this
						.getIntHoraria().equals(castOther.getIntHoraria())))
				&& ((this.getNombre() == castOther.getNombre()) || (this
						.getNombre() != null && castOther.getNombre() != null && this
						.getNombre().equals(castOther.getNombre())))
				&& ((this.getSemestre() == castOther.getSemestre()) || (this
						.getSemestre() != null
						&& castOther.getSemestre() != null && this
						.getSemestre().equals(castOther.getSemestre())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getFechaFin() == null ? 0 : this.getFechaFin().hashCode());
		result = 37
				* result
				+ (getFechaInicio() == null ? 0 : this.getFechaInicio()
						.hashCode());
		result = 37
				* result
				+ (getIntHoraria() == null ? 0 : this.getIntHoraria()
						.hashCode());
		result = 37 * result
				+ (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result
				+ (getSemestre() == null ? 0 : this.getSemestre().hashCode());
		return result;
	}

}