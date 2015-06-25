package alert.model;

/**
 * AbstractEstudiantesMateriasHorarios entity provides the base persistence
 * definition of the EstudiantesMateriasHorarios entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractEstudiantesMateriasHorarios implements
		java.io.Serializable {

	// Fields

	private String idMateria;
	private String horaFin;
	private String horaInicio;
	private Long idDiaSemana;
	private Long idEstudiante;

	// Constructors

	/** default constructor */
	public AbstractEstudiantesMateriasHorarios() {
	}

	/** minimal constructor */
	public AbstractEstudiantesMateriasHorarios(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public AbstractEstudiantesMateriasHorarios(String idMateria,
			String horaFin, String horaInicio, Long idDiaSemana,
			Long idEstudiante) {
		this.idMateria = idMateria;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
		this.idDiaSemana = idDiaSemana;
		this.idEstudiante = idEstudiante;
	}

	// Property accessors

	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Long getIdDiaSemana() {
		return this.idDiaSemana;
	}

	public void setIdDiaSemana(Long idDiaSemana) {
		this.idDiaSemana = idDiaSemana;
	}

	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

}