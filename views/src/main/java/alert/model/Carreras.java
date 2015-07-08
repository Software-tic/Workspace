package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Carreras entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carreras", schema = "zyos")
public class Carreras implements java.io.Serializable {

	// Fields

	private String id;
	private Long facultad;
	private String nombre;

	// Constructors

	/** default constructor */
	public Carreras() {
	}

	/** minimal constructor */
	public Carreras(String id) {
		this.id = id;
	}

	/** full constructor */
	public Carreras(String id, Long facultad, String nombre) {
		this.id = id;
		this.facultad = facultad;
		this.nombre = nombre;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "facultad")
	public Long getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Long facultad) {
		this.facultad = facultad;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}