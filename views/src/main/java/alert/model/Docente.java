package alert.model;

import javax.persistence.Entity;

/**
 * Docente entity. @author MyEclipse Persistence Tools
 */
@Entity public class Docente extends AbstractDocente implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Docente() {
	}

	/** minimal constructor */
	public Docente(Long id) {
		super(id);
	}

	/** full constructor */
	public Docente(Long id, String apellidos, String celular, String codigo,
			String correo, String correoAlternativo, String direccion,
			String documento, String nombres, String telefono) {
		super(id, apellidos, celular, codigo, correo, correoAlternativo,
				direccion, documento, nombres, telefono);
	}

}
