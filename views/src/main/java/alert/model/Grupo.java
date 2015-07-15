package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Grupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "grupo", schema = "zyos")
public class Grupo implements java.io.Serializable {

	// Fields

	private GrupoId id;

	// Constructors

	/** default constructor */
	public Grupo() {
	}

	/** full constructor */
	public Grupo(GrupoId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idGrupo", column = @Column(name = "id_grupo", nullable = false)),
			@AttributeOverride(name = "aula", column = @Column(name = "aula")),
			@AttributeOverride(name = "nombreGrupo", column = @Column(name = "nombre_grupo", length = 5)) })
	public GrupoId getId() {
		return this.id;
	}

	public void setId(GrupoId id) {
		this.id = id;
	}

}