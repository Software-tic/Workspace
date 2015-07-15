package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DocentesMaterias entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "docentes_materias", schema = "zyos")
public class DocentesMaterias implements java.io.Serializable {

	// Fields

	private DocentesMateriasId id;

	// Constructors

	/** default constructor */
	public DocentesMaterias() {
	}

	/** full constructor */
	public DocentesMaterias(DocentesMateriasId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idDocente", column = @Column(name = "id_docente", nullable = false)),
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", length = 5)) })
	public DocentesMateriasId getId() {
		return this.id;
	}

	public void setId(DocentesMateriasId id) {
		this.id = id;
	}

}