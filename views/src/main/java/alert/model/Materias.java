package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Materias entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "materias", schema = "zyos")
public class Materias implements java.io.Serializable {

	// Fields

	private String id;
	private String fechaFin;
	private String fechaInicio;
	private Long intHoraria;
	private String nombre;
	private Integer semestre;

	// Constructors

	/** default constructor */
	public Materias() {
	}

	/** minimal constructor */
	public Materias(String id) {
		this.id = id;
	}

	/** full constructor */
	public Materias(String id, String fechaFin, String fechaInicio,
			Long intHoraria, String nombre, Integer semestre) {
		this.id = id;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.intHoraria = intHoraria;
		this.nombre = nombre;
		this.semestre = semestre;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 5)
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

}