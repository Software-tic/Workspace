package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Materias entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "materias", schema = "zyos")
public class Materias implements java.io.Serializable {

	// Fields

	private MateriasId id;

	// Constructors

	/** default constructor */
	public Materias() {
	}

	/** full constructor */
	public Materias(MateriasId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false, length = 5)),
			@AttributeOverride(name = "fechaFin", column = @Column(name = "fecha_fin", length = 10)),
			@AttributeOverride(name = "fechaInicio", column = @Column(name = "fecha_inicio", length = 10)),
			@AttributeOverride(name = "intHoraria", column = @Column(name = "int_horaria")),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre")),
			@AttributeOverride(name = "semestre", column = @Column(name = "semestre")) })
	public MateriasId getId() {
		return this.id;
	}

	public void setId(MateriasId id) {
		this.id = id;
	}

}