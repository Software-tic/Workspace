package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EstudiantesMateriasHorarios entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "estudiantes_materias_horarios", schema = "zyos")
public class EstudiantesMateriasHorarios implements java.io.Serializable {

	// Fields

	private EstudiantesMateriasHorariosId id;

	// Constructors

	/** default constructor */
	public EstudiantesMateriasHorarios() {
	}

	/** full constructor */
	public EstudiantesMateriasHorarios(EstudiantesMateriasHorariosId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", nullable = false)),
			@AttributeOverride(name = "horaFin", column = @Column(name = "hora_fin")),
			@AttributeOverride(name = "horaInicio", column = @Column(name = "hora_inicio")),
			@AttributeOverride(name = "idDiaSemana", column = @Column(name = "id_dia_semana")),
			@AttributeOverride(name = "idEstudiante", column = @Column(name = "id_estudiante")) })
	public EstudiantesMateriasHorariosId getId() {
		return this.id;
	}

	public void setId(EstudiantesMateriasHorariosId id) {
		this.id = id;
	}

}