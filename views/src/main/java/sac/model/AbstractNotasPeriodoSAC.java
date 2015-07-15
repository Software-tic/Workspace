package sac.model;

/**
 * AbstractCarreras entity provides the base persistence definition of the
 * NotasPeriodo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNotasPeriodoSAC implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idEstudiante;
	private String idMateria;
	private String primerCorte;
	private String segundoCorte;
	private String tercerCorte;
	private String nFinal;
	private String periodo;

	// Constructors

	/** default constructor */
	public AbstractNotasPeriodoSAC() {
	}
	
	/** full constructor */
	public AbstractNotasPeriodoSAC(Long idEstudiante, String idMateria,
			String primerCorte, String segundoCorte, String tercerCorte,
			String nFinal, String periodo) {
		this.idEstudiante = idEstudiante;
		this.idMateria= idMateria;
		this.primerCorte = primerCorte;
		this.segundoCorte = segundoCorte;
		this.tercerCorte = tercerCorte;
		this.nFinal = nFinal;
		this.periodo = periodo;
	}
	
	/** minimal constructor */
	public AbstractNotasPeriodoSAC(Long idEstudiante, String idMateria,
			String periodo) {
		this.idEstudiante = idEstudiante;
		this.idMateria= idMateria;
		this.periodo = periodo;
	}

	public Long getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getPrimerCorte() {
		return primerCorte;
	}

	public void setPrimerCorte(String primerCorte) {
		this.primerCorte = primerCorte;
	}

	public String getSegundoCorte() {
		return segundoCorte;
	}

	public void setSegundoCorte(String segundoCorte) {
		this.segundoCorte = segundoCorte;
	}

	public String getTercerCorte() {
		return tercerCorte;
	}

	public void setTercerCorte(String tercerCorte) {
		this.tercerCorte = tercerCorte;
	}

	public String getnFinal() {
		return nFinal;
	}

	public void setnFinal(String nFinal) {
		this.nFinal = nFinal;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

}