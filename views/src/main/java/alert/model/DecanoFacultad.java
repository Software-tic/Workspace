package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DecanoFacultad entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "decano_facultad", schema = "zyos")
public class DecanoFacultad implements java.io.Serializable {

	// Fields

	private DecanoFacultadId id;

	// Constructors

	/** default constructor */
	public DecanoFacultad() {
	}

	/** full constructor */
	public DecanoFacultad(DecanoFacultadId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idDecano", column = @Column(name = "id_decano", nullable = false)),
			@AttributeOverride(name = "idFacultad", column = @Column(name = "id_facultad")),
			@AttributeOverride(name = "mail", column = @Column(name = "mail")),
			@AttributeOverride(name = "nomDecano", column = @Column(name = "nom_decano")) })
	public DecanoFacultadId getId() {
		return this.id;
	}

	public void setId(DecanoFacultadId id) {
		this.id = id;
	}

}