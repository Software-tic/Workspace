package alert.model;

/**
 * AbstractCarrerasEstudiantes entity provides the base persistence definition
 * of the CarrerasEstudiantes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCarrerasEstudiantes implements
		java.io.Serializable {

	// Fields

	private Long idEstudiante;
	private String codAlumno;
	private String idCarrera;

	// Constructors

	/** default constructor */
	public AbstractCarrerasEstudiantes() {
	}

	/** minimal constructor */
	public AbstractCarrerasEstudiantes(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/** full constructor */
	public AbstractCarrerasEstudiantes(Long idEstudiante, String codAlumno,
			String idCarrera) {
		this.idEstudiante = idEstudiante;
		this.codAlumno = codAlumno;
		this.idCarrera = idCarrera;
	}

	// Property accessors

	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getCodAlumno() {
		return this.codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public String getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

}