package sac.model;

/**
 * AbstractMateriasGrupo entity provides the base persistence definition of the
 * MateriasGrupo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMateriasGrupoSAC implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idGrupo;

	// Constructors

	/** default constructor */
	public AbstractMateriasGrupoSAC() {
	}

	/** minimal constructor */
	public AbstractMateriasGrupoSAC(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public AbstractMateriasGrupoSAC(String idMateria, Long idGrupo) {
		this.idMateria = idMateria;
		this.idGrupo = idGrupo;
	}

	// Property accessors

	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

}