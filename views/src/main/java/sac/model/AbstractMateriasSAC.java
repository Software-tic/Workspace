package sac.model;

/**
 * AbstractMaterias entity provides the base persistence definition of the
 * Materias entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMateriasSAC implements java.io.Serializable {

	// Fields

	private String id;
	private String fechaFin;
	private String fechaInicio;
	private Long intHoraria;
	private String nombre;
	private Integer semestre;

	// Constructors

	/** default constructor */
	public AbstractMateriasSAC() {
	}

	/** minimal constructor */
	public AbstractMateriasSAC(String id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractMateriasSAC(String id, String fechaFin, String fechaInicio,
			Long intHoraria, String nombre, Integer semestre) {
		this.id = id;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.intHoraria = intHoraria;
		this.nombre = nombre;
		this.semestre = semestre;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Long getIntHoraria() {
		return this.intHoraria;
	}

	public void setIntHoraria(Long intHoraria) {
		this.intHoraria = intHoraria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

}