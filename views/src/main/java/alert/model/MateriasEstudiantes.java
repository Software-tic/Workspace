package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MateriasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "materias_estudiantes", schema = "zyos")
public class MateriasEstudiantes implements java.io.Serializable {

	// Fields

	private MateriasEstudiantesId id;

	// Constructors

	/** default constructor */
	public MateriasEstudiantes() {
	}

	/** full constructor */
	public MateriasEstudiantes(MateriasEstudiantesId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", nullable = false, length = 5)),
			@AttributeOverride(name = "idEstudiante", column = @Column(name = "id_estudiante")) })
	public MateriasEstudiantesId getId() {
		return this.id;
	}

	public void setId(MateriasEstudiantesId id) {
		this.id = id;
	}

}