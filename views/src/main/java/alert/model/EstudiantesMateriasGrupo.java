package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EstudiantesMateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "estudiantes_materias_grupo", schema = "zyos")
public class EstudiantesMateriasGrupo implements java.io.Serializable {

	// Fields

	private EstudiantesMateriasGrupoId id;

	// Constructors

	/** default constructor */
	public EstudiantesMateriasGrupo() {
	}

	/** full constructor */
	public EstudiantesMateriasGrupo(EstudiantesMateriasGrupoId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", nullable = false, length = 5)),
			@AttributeOverride(name = "idEstudiante", column = @Column(name = "id_estudiante")),
			@AttributeOverride(name = "idGrupo", column = @Column(name = "id_grupo")) })
	public EstudiantesMateriasGrupoId getId() {
		return this.id;
	}

	public void setId(EstudiantesMateriasGrupoId id) {
		this.id = id;
	}

}