package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarrerasDocentesFacultades entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carreras_docentes_facultades", schema = "zyos")
public class CarrerasDocentesFacultades implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idCarrera;
	private Long idFacultad;

	// Constructors

	/** default constructor */
	public CarrerasDocentesFacultades() {
	}

	/** minimal constructor */
	public CarrerasDocentesFacultades(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public CarrerasDocentesFacultades(Long idDocente, String idCarrera,
			Long idFacultad) {
		this.idDocente = idDocente;
		this.idCarrera = idCarrera;
		this.idFacultad = idFacultad;
	}

	// Property accessors
	@Id
	@Column(name = "id_docente", unique = true, nullable = false)
	public Long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	@Column(name = "id_carrera")
	public String getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	@Column(name = "id_facultad")
	public Long getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

}