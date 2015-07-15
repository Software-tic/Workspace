package alert.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NotasPeriodo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "notas_periodo", schema = "zyos")
public class NotasPeriodo implements java.io.Serializable {

	// Fields

	private NotasPeriodoId id;

	// Constructors

	/** default constructor */
	public NotasPeriodo() {
	}

	/** full constructor */
	public NotasPeriodo(NotasPeriodoId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEstudiante", column = @Column(name = "id_estudiante", nullable = false)),
			@AttributeOverride(name = "idMateria", column = @Column(name = "id_materia", nullable = false)),
			@AttributeOverride(name = "perCorte", column = @Column(name = "per_corte", length = 5)),
			@AttributeOverride(name = "sdoCorte", column = @Column(name = "sdo_corte", length = 5)),
			@AttributeOverride(name = "terCorte", column = @Column(name = "ter_corte", length = 5)),
			@AttributeOverride(name = "NFinal", column = @Column(name = "n_final", length = 5)),
			@AttributeOverride(name = "periodo", column = @Column(name = "periodo", nullable = false, length = 10)) })
	public NotasPeriodoId getId() {
		return this.id;
	}

	public void setId(NotasPeriodoId id) {
		this.id = id;
	}

}