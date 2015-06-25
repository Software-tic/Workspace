package sac.model;

import javax.persistence.Entity;

/**
 * Docente entity. @author MyEclipse Persistence Tools
 */
@Entity public class DocenteSAC extends AbstractDocenteSAC implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DocenteSAC() {
	}

	/** minimal constructor */
	public DocenteSAC(Long id) {
		super(id);
	}

	/** full constructor */
	public DocenteSAC(Long id, String apellidos, String celular, String codigo,
			String correo, String correoAlternativo, String direccion,
			String documento, String nombres, String telefono) {
		super(id, apellidos, celular, codigo, correoAlternativo,
				direccion, documento, nombres, telefono);
	}

}
