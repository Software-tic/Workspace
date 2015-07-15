package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DocenteMateriaGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "docente_materia_grupo", schema = "zyos")
public class DocenteMateriaGrupo implements java.io.Serializable {

	// Fields

	private DocenteMateriaGrupoId id;

	// Constructors

	/** default constructor */
	public DocenteMateriaGrupo() {
	}

	/** full constructor */
	public DocenteMateriaGrupo(DocenteMateriaGrupoId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idDocente", column = @Column(name = "id_docente", nullable = false)),
			@AttributeOverride(name = "idGrupo", column = @Column(name = "id_grupo")),
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", length = 5)) })
	public DocenteMateriaGrupoId getId() {
		return this.id;
	}

	public void setId(DocenteMateriaGrupoId id) {
		this.id = id;
	}

}