package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DocenteMateriaGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "docente_materia_grupo", schema = "zyos")
public class DocenteMateriaGrupo implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private Long idGrupo;
	private String idMateria;

	// Constructors

	/** default constructor */
	public DocenteMateriaGrupo() {
	}

	/** minimal constructor */
	public DocenteMateriaGrupo(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public DocenteMateriaGrupo(Long idDocente, Long idGrupo, String idMateria) {
		this.idDocente = idDocente;
		this.idGrupo = idGrupo;
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

	@Column(name = "id_grupo")
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "id_materia", length = 5)
	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

}