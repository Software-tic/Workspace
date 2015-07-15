package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Estudiante entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "estudiante", schema = "zyos")
public class Estudiante implements java.io.Serializable {

	// Fields

	private EstudianteId id;

	// Constructors

	/** default constructor */
	public Estudiante() {
	}

	/** full constructor */
	public Estudiante(EstudianteId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "apellidos", column = @Column(name = "apellidos", length = 61)),
			@AttributeOverride(name = "celular", column = @Column(name = "celular", length = 20)),
			@AttributeOverride(name = "correoAlternativo", column = @Column(name = "correo_alternativo", length = 100)),
			@AttributeOverride(name = "direccion", column = @Column(name = "direccion", length = 60)),
			@AttributeOverride(name = "documento", column = @Column(name = "documento", length = 12)),
			@AttributeOverride(name = "nombres", column = @Column(name = "nombres", length = 101)),
			@AttributeOverride(name = "telefono", column = @Column(name = "telefono", length = 30)) })
	public EstudianteId getId() {
		return this.id;
	}

	public void setId(EstudianteId id) {
		this.id = id;
	}

}