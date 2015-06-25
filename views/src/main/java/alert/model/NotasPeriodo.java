package alert.model;

/**
 * NotasPeriodo entity. @author MyEclipse Persistence Tools
 */

public class NotasPeriodo extends AbstractNotasPeriodo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public NotasPeriodo() {
	}
	
	/** minimal constructor */
	public NotasPeriodo(Long idEstudinte, Long idMateria, String Periodo) {
		super(idEstudinte, idMateria, Periodo);
	}

	/** full constructor */
	public NotasPeriodo(Long idEstudinte, Long idMateria,String Periodo, String PerCorte, String SerCorte, String TerCorte,String finaln) {
		super(idEstudinte,idMateria,Periodo,PerCorte,SerCorte,TerCorte,finaln);
	}


}