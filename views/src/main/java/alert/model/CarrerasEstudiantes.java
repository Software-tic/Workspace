package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CarrerasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carreras_estudiantes", schema = "zyos")
public class CarrerasEstudiantes implements java.io.Serializable {

	// Fields

	private CarrerasEstudiantesId id;

	// Constructors

	/** default constructor */
	public CarrerasEstudiantes() {
	}

	/** full constructor */
	public CarrerasEstudiantes(CarrerasEstudiantesId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEstudiante", column = @Column(name = "id_estudiante", nullable = false)),
			@AttributeOverride(name = "codAlumno", column = @Column(name = "cod_alumno")),
			@AttributeOverride(name = "idCarrera", column = @Column(name = "id_carrera")) })
	public CarrerasEstudiantesId getId() {
		return this.id;
	}

	public void setId(CarrerasEstudiantesId id) {
		this.id = id;
	}

}