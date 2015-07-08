package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Grupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "grupo", schema = "zyos")
public class Grupo implements java.io.Serializable {

	// Fields

	private Long idGrupo;
	private Long aula;
	private String nombreGrupo;

	// Constructors

	/** default constructor */
	public Grupo() {
	}

	/** minimal constructor */
	public Grupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	/** full constructor */
	public Grupo(Long idGrupo, Long aula, String nombreGrupo) {
		this.idGrupo = idGrupo;
		this.aula = aula;
		this.nombreGrupo = nombreGrupo;
	}

	// Property accessors
	@Id
	@Column(name = "id_grupo", unique = true, nullable = false)
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "aula")
	public Long getAula() {
		return this.aula;
	}

	public void setAula(Long aula) {
		this.aula = aula;
	}

	@Column(name = "nombre_grupo", length = 5)
	public String getNombreGrupo() {
		return this.nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

}