package alert.model;

import javax.persistence.Entity;

/**
 * Estudiante entity. @author MyEclipse Persistence Tools
 */
@Entity public class Estudiante extends AbstractEstudiante implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Estudiante() {
	}

	/** minimal constructor */
	public Estudiante(Long id) {
		super(id);
	}

	/** full constructor */
	public Estudiante(Long id, String apellidos, String celular,
			String correoAlternativo, String direccion, String documento,
			String nombres, String telefono) {
		super(id, apellidos, celular, correoAlternativo, direccion, documento,
				nombres, telefono);
	}

}
