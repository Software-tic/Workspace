package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Facultades entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "facultades", schema = "zyos")
public class Facultades implements java.io.Serializable {

	// Fields

	private FacultadesId id;

	// Constructors

	/** default constructor */
	public Facultades() {
	}

	/** full constructor */
	public Facultades(FacultadesId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "identificador", column = @Column(name = "identificador", nullable = false)),
			@AttributeOverride(name = "facultad", column = @Column(name = "facultad")) })
	public FacultadesId getId() {
		return this.id;
	}

	public void setId(FacultadesId id) {
		this.id = id;
	}

}