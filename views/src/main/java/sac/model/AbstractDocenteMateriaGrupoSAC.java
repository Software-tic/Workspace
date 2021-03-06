package sac.model;

/**
 * AbstractDocenteMateriaGrupo entity provides the base persistence definition
 * of the DocenteMateriaGrupo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDocenteMateriaGrupoSAC implements
		java.io.Serializable {

	// Fields

	private Long idDocente;
	private Long idGrupo;
	private String idMateria;

	// Constructors

	/** default constructor */
	public AbstractDocenteMateriaGrupoSAC() {
	}

	/** minimal constructor */
	public AbstractDocenteMateriaGrupoSAC(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public AbstractDocenteMateriaGrupoSAC(Long idDocente, Long idGrupo,
			String idMateria) {
		this.idDocente = idDocente;
		this.idGrupo = idGrupo;
		this.idMateria = idMateria;
	}

	// Property accessors

	public Long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

}