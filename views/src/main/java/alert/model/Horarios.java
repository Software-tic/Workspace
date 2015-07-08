package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Horarios entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "horarios", schema = "zyos")
public class Horarios implements java.io.Serializable {

	// Fields

	private String materia;
	private String diaDeClase;
	private Long grupo;

	// Constructors

	/** default constructor */
	public Horarios() {
	}

	/** minimal constructor */
	public Horarios(String materia) {
		this.materia = materia;
	}

	/** full constructor */
	public Horarios(String materia, String diaDeClase, Long grupo) {
		this.materia = materia;
		this.diaDeClase = diaDeClase;
		this.grupo = grupo;
	}

	// Property accessors
	@Id
	@Column(name = "materia", unique = true, nullable = false, length = 5)
	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Column(name = "dia_de_clase", length = 9)
	public String getDiaDeClase() {
		return this.diaDeClase;
	}

	public void setDiaDeClase(String diaDeClase) {
		this.diaDeClase = diaDeClase;
	}

	@Column(name = "grupo")
	public Long getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Long grupo) {
		this.grupo = grupo;
	}

}