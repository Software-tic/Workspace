package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Carreras entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carreras", schema = "zyos")
public class Carreras implements java.io.Serializable {

	// Fields

	private CarrerasId id;

	// Constructors

	/** default constructor */
	public Carreras() {
	}

	/** full constructor */
	public Carreras(CarrerasId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "facultad", column = @Column(name = "facultad")),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre")) })
	public CarrerasId getId() {
		return this.id;
	}

	public void setId(CarrerasId id) {
		this.id = id;
	}

}