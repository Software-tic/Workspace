package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Docente entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "docente", schema = "zyos")
public class Docente implements java.io.Serializable {

	// Fields

	private DocenteId id;

	// Constructors

	/** default constructor */
	public Docente() {
	}

	/** full constructor */
	public Docente(DocenteId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "apellidos", column = @Column(name = "apellidos", length = 61)),
			@AttributeOverride(name = "celular", column = @Column(name = "celular", length = 20)),
			@AttributeOverride(name = "codigo", column = @Column(name = "codigo", length = 20)),
			@AttributeOverride(name = "correo", column = @Column(name = "correo", length = 150)),
			@AttributeOverride(name = "correoAlternativo", column = @Column(name = "correo_alternativo", length = 100)),
			@AttributeOverride(name = "direccion", column = @Column(name = "direccion", length = 50)),
			@AttributeOverride(name = "documento", column = @Column(name = "documento", length = 12)),
			@AttributeOverride(name = "nombres", column = @Column(name = "nombres", length = 101)),
			@AttributeOverride(name = "telefono", column = @Column(name = "telefono", length = 30)) })
	public DocenteId getId() {
		return this.id;
	}

	public void setId(DocenteId id) {
		this.id = id;
	}

}