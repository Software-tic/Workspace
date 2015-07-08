package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estudiante entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "estudiante", schema = "zyos")
public class Estudiante implements java.io.Serializable {

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
	public Estudiante() {
	}

	/** minimal constructor */
	public Estudiante(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Estudiante(Long id, String apellidos, String celular,
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
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "apellidos", length = 61)
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "celular", length = 20)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "correo_alternativo", length = 100)
	public String getCorreoAlternativo() {
		return this.correoAlternativo;
	}

	public void setCorreoAlternativo(String correoAlternativo) {
		this.correoAlternativo = correoAlternativo;
	}

	@Column(name = "direccion", length = 60)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "documento", length = 12)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Column(name = "nombres", length = 101)
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "telefono", length = 30)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}