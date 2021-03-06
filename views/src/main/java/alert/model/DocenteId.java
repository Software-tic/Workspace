package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DocenteId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DocenteId implements java.io.Serializable {

	// Fields

	private Long id;
	private String apellidos;
	private String celular;
	private String codigo;
	private String correo;
	private String correoAlternativo;
	private String direccion;
	private String documento;
	private String nombres;
	private String telefono;

	// Constructors

	/** default constructor */
	public DocenteId() {
	}

	/** minimal constructor */
	public DocenteId(Long id) {
		this.id = id;
	}

	/** full constructor */
	public DocenteId(Long id, String apellidos, String celular, String codigo,
			String correo, String correoAlternativo, String direccion,
			String documento, String nombres, String telefono) {
		this.id = id;
		this.apellidos = apellidos;
		this.celular = celular;
		this.codigo = codigo;
		this.correo = correo;
		this.correoAlternativo = correoAlternativo;
		this.direccion = direccion;
		this.documento = documento;
		this.nombres = nombres;
		this.telefono = telefono;
	}

	// Property accessors

	@Column(name = "id", nullable = false)
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

	@Column(name = "codigo", length = 20)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "correo", length = 150)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "correo_alternativo", length = 100)
	public String getCorreoAlternativo() {
		return this.correoAlternativo;
	}

	public void setCorreoAlternativo(String correoAlternativo) {
		this.correoAlternativo = correoAlternativo;
	}

	@Column(name = "direccion", length = 50)
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DocenteId))
			return false;
		DocenteId castOther = (DocenteId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getApellidos() == castOther.getApellidos()) || (this
						.getApellidos() != null
						&& castOther.getApellidos() != null && this
						.getApellidos().equals(castOther.getApellidos())))
				&& ((this.getCelular() == castOther.getCelular()) || (this
						.getCelular() != null && castOther.getCelular() != null && this
						.getCelular().equals(castOther.getCelular())))
				&& ((this.getCodigo() == castOther.getCodigo()) || (this
						.getCodigo() != null && castOther.getCodigo() != null && this
						.getCodigo().equals(castOther.getCodigo())))
				&& ((this.getCorreo() == castOther.getCorreo()) || (this
						.getCorreo() != null && castOther.getCorreo() != null && this
						.getCorreo().equals(castOther.getCorreo())))
				&& ((this.getCorreoAlternativo() == castOther
						.getCorreoAlternativo()) || (this
						.getCorreoAlternativo() != null
						&& castOther.getCorreoAlternativo() != null && this
						.getCorreoAlternativo().equals(
								castOther.getCorreoAlternativo())))
				&& ((this.getDireccion() == castOther.getDireccion()) || (this
						.getDireccion() != null
						&& castOther.getDireccion() != null && this
						.getDireccion().equals(castOther.getDireccion())))
				&& ((this.getDocumento() == castOther.getDocumento()) || (this
						.getDocumento() != null
						&& castOther.getDocumento() != null && this
						.getDocumento().equals(castOther.getDocumento())))
				&& ((this.getNombres() == castOther.getNombres()) || (this
						.getNombres() != null && castOther.getNombres() != null && this
						.getNombres().equals(castOther.getNombres())))
				&& ((this.getTelefono() == castOther.getTelefono()) || (this
						.getTelefono() != null
						&& castOther.getTelefono() != null && this
						.getTelefono().equals(castOther.getTelefono())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getApellidos() == null ? 0 : this.getApellidos().hashCode());
		result = 37 * result
				+ (getCelular() == null ? 0 : this.getCelular().hashCode());
		result = 37 * result
				+ (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		result = 37 * result
				+ (getCorreo() == null ? 0 : this.getCorreo().hashCode());
		result = 37
				* result
				+ (getCorreoAlternativo() == null ? 0 : this
						.getCorreoAlternativo().hashCode());
		result = 37 * result
				+ (getDireccion() == null ? 0 : this.getDireccion().hashCode());
		result = 37 * result
				+ (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		result = 37 * result
				+ (getNombres() == null ? 0 : this.getNombres().hashCode());
		result = 37 * result
				+ (getTelefono() == null ? 0 : this.getTelefono().hashCode());
		return result;
	}

}