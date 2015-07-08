package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DocentesMaterias entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "docentes_materias", schema = "zyos")
public class DocentesMaterias implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idMateria;

	// Constructors

	/** default constructor */
	public DocentesMaterias() {
	}

	/** minimal constructor */
	public DocentesMaterias(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public DocentesMaterias(Long idDocente, String idMateria) {
		this.idDocente = idDocente;
		this.idMateria = idMateria;
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

	@Column(name = "id_materia", length = 5)
	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

}