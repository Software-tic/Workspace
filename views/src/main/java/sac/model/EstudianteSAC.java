package sac.model;

import javax.persistence.Entity;

/**
 * Estudiante entity. @author MyEclipse Persistence Tools
 */
@Entity public class EstudianteSAC extends AbstractEstudianteSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EstudianteSAC() {
	}

	/** minimal constructor */
	public EstudianteSAC(Long id) {
		super(id);
	}

	/** full constructor */
	public EstudianteSAC(Long id, String apellidos, String celular,
			String correoAlternativo, String direccion, String documento,
			String nombres, String telefono) {
		super(id, apellidos, celular, correoAlternativo, direccion, documento,
				nombres, telefono);
	}

}
