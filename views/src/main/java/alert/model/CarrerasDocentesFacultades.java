package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CarrerasDocentesFacultades entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carreras_docentes_facultades", schema = "zyos")
public class CarrerasDocentesFacultades implements java.io.Serializable {

	// Fields

	private CarrerasDocentesFacultadesId id;

	// Constructors

	/** default constructor */
	public CarrerasDocentesFacultades() {
	}

	/** full constructor */
	public CarrerasDocentesFacultades(CarrerasDocentesFacultadesId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idDocente", column = @Column(name = "id_docente", nullable = false)),
			@AttributeOverride(name = "idCarrera", column = @Column(name = "id_carrera")),
			@AttributeOverride(name = "idFacultad", column = @Column(name = "id_facultad")) })
	public CarrerasDocentesFacultadesId getId() {
		return this.id;
	}

	public void setId(CarrerasDocentesFacultadesId id) {
		this.id = id;
	}

}