package sac.model;

/**
 * AbstractEstudiante entity provides the base persistence definition of the
 * Estudiante entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEstudianteSAC implements java.io.Serializable {

	// Fields

	private Long id;
	private String apellidos;
	private String celular;
	private String correoAlternativo;
	private String direccion;
	private String documento;
	private String nombres;
	private String telefono;

	// Constructors

	/** default constructor */
	public AbstractEstudianteSAC() {
	}

	/** minimal constructor */
	public AbstractEstudianteSAC(Long id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractEstudianteSAC(Long id, String apellidos, String celular,
			String correoAlternativo, String direccion, String documento,
			String nombres, String telefono) {
		this.id = id;
		this.apellidos = apellidos;
		this.celular = celular;
		this.correoAlternativo = correoAlternativo;
		this.direccion = direccion;
		this.documento = documento;
		this.nombres = nombres;
		this.telefono = telefono;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreoAlternativo() {
		return this.correoAlternativo;
	}

	public void setCorreoAlternativo(String correoAlternativo) {
		this.correoAlternativo = correoAlternativo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}