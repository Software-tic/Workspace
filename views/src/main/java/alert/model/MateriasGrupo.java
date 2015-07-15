package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "materias_grupo", schema = "zyos")
public class MateriasGrupo implements java.io.Serializable {

	// Fields

	private MateriasGrupoId id;

	// Constructors

	/** default constructor */
	public MateriasGrupo() {
	}

	/** full constructor */
	public MateriasGrupo(MateriasGrupoId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", nullable = false, length = 5)),
			@AttributeOverride(name = "idGrupo", column = @Column(name = "id_grupo")) })
	public MateriasGrupoId getId() {
		return this.id;
	}

	public void setId(MateriasGrupoId id) {
		this.id = id;
	}

}