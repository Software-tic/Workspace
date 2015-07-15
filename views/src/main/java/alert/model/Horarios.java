package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Horarios entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "horarios", schema = "zyos")
public class Horarios implements java.io.Serializable {

	// Fields

	private HorariosId id;

	// Constructors

	/** default constructor */
	public Horarios() {
	}

	/** full constructor */
	public Horarios(HorariosId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "materia", column = @Column(name = "materia", nullable = false, length = 5)),
			@AttributeOverride(name = "diaDeClase", column = @Column(name = "dia_de_clase", length = 9)),
			@AttributeOverride(name = "grupo", column = @Column(name = "grupo")) })
	public HorariosId getId() {
		return this.id;
	}

	public void setId(HorariosId id) {
		this.id = id;
	}

}