package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NotasPeriodoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class NotasPeriodoId implements java.io.Serializable {

	// Fields

	private Long idEstudiante;
	private Long idMateria;
	private String perCorte;
	private String sdoCorte;
	private String terCorte;
	private String NFinal;
	private String periodo;

	// Constructors

	/** default constructor */
	public NotasPeriodoId() {
	}

	/** minimal constructor */
	public NotasPeriodoId(Long idEstudiante, Long idMateria, String periodo) {
		this.idEstudiante = idEstudiante;
		this.idMateria = idMateria;
		this.periodo = periodo;
	}

	/** full constructor */
	public NotasPeriodoId(Long idEstudiante, Long idMateria, String perCorte,
			String sdoCorte, String terCorte, String NFinal, String periodo) {
		this.idEstudiante = idEstudiante;
		this.idMateria = idMateria;
		this.perCorte = perCorte;
		this.sdoCorte = sdoCorte;
		this.terCorte = terCorte;
		this.NFinal = NFinal;
		this.periodo = periodo;
	}

	// Property accessors

	@Column(name = "id_estudiante", nullable = false)
	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Column(name = "id_materia", nullable = false)
	public Long getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	@Column(name = "per_corte", length = 5)
	public String getPerCorte() {
		return this.perCorte;
	}

	public void setPerCorte(String perCorte) {
		this.perCorte = perCorte;
	}

	@Column(name = "sdo_corte", length = 5)
	public String getSdoCorte() {
		return this.sdoCorte;
	}

	public void setSdoCorte(String sdoCorte) {
		this.sdoCorte = sdoCorte;
	}

	@Column(name = "ter_corte", length = 5)
	public String getTerCorte() {
		return this.terCorte;
	}

	public void setTerCorte(String terCorte) {
		this.terCorte = terCorte;
	}

	@Column(name = "n_final", length = 5)
	public String getNFinal() {
		return this.NFinal;
	}

	public void setNFinal(String NFinal) {
		this.NFinal = NFinal;
	}

	@Column(name = "periodo", nullable = false, length = 10)
	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NotasPeriodoId))
			return false;
		NotasPeriodoId castOther = (NotasPeriodoId) other;

		return ((this.getIdEstudiante() == castOther.getIdEstudiante()) || (this
				.getIdEstudiante() != null
				&& castOther.getIdEstudiante() != null && this
				.getIdEstudiante().equals(castOther.getIdEstudiante())))
				&& ((this.getIdMateria() == castOther.getIdMateria()) || (this
						.getIdMateria() != null
						&& castOther.getIdMateria() != null && this
						.getIdMateria().equals(castOther.getIdMateria())))
				&& ((this.getPerCorte() == castOther.getPerCorte()) || (this
						.getPerCorte() != null
						&& castOther.getPerCorte() != null && this
						.getPerCorte().equals(castOther.getPerCorte())))
				&& ((this.getSdoCorte() == castOther.getSdoCorte()) || (this
						.getSdoCorte() != null
						&& castOther.getSdoCorte() != null && this
						.getSdoCorte().equals(castOther.getSdoCorte())))
				&& ((this.getTerCorte() == castOther.getTerCorte()) || (this
						.getTerCorte() != null
						&& castOther.getTerCorte() != null && this
						.getTerCorte().equals(castOther.getTerCorte())))
				&& ((this.getNFinal() == castOther.getNFinal()) || (this
						.getNFinal() != null && castOther.getNFinal() != null && this
						.getNFinal().equals(castOther.getNFinal())))
				&& ((this.getPeriodo() == castOther.getPeriodo()) || (this
						.getPeriodo() != null && castOther.getPeriodo() != null && this
						.getPeriodo().equals(castOther.getPeriodo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdEstudiante() == null ? 0 : this.getIdEstudiante()
						.hashCode());
		result = 37 * result
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		result = 37 * result
				+ (getPerCorte() == null ? 0 : this.getPerCorte().hashCode());
		result = 37 * result
				+ (getSdoCorte() == null ? 0 : this.getSdoCorte().hashCode());
		result = 37 * result
				+ (getTerCorte() == null ? 0 : this.getTerCorte().hashCode());
		result = 37 * result
				+ (getNFinal() == null ? 0 : this.getNFinal().hashCode());
		result = 37 * result
				+ (getPeriodo() == null ? 0 : this.getPeriodo().hashCode());
		return result;
	}

}