package alert.model;

/**
 * AbstractGrupo entity provides the base persistence definition of the Grupo
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrupo implements java.io.Serializable {

	// Fields

	private Long idGrupo;
	private Long aula;
	private String nombreGrupo;

	// Constructors

	/** default constructor */
	public AbstractGrupo() {
	}

	/** minimal constructor */
	public AbstractGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	/** full constructor */
	public AbstractGrupo(Long idGrupo, Long aula, String nombreGrupo) {
		this.idGrupo = idGrupo;
		this.aula = aula;
		this.nombreGrupo = nombreGrupo;
	}

	// Property accessors

	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Long getAula() {
		return this.aula;
	}

	public void setAula(Long aula) {
		this.aula = aula;
	}

	public String getNombreGrupo() {
		return this.nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

}