package alert.model;



/**
 * NotasPeriodoId entity. @author MyEclipse Persistence Tools
 */

public class AbstractNotasPeriodo  implements java.io.Serializable {


    // Fields    

     private Long idEstudiante;
     private Long idMateria;
     private String PerCorte;
     private String SdoCorte;
     private String TerCorte;
     private String NFinal;
     private String periodo;


    // Constructors

    /** default constructor */
    public AbstractNotasPeriodo() {
    }

	/** minimal constructor */
    public AbstractNotasPeriodo(Long idEstudiante, Long idMateria, String periodo) {
        this.idEstudiante = idEstudiante;
        this.idMateria = idMateria;
        this.periodo = periodo;
    }
    
    /** full constructor */
    public AbstractNotasPeriodo(Long idEstudiante, Long idMateria, String PerCorte, String SdoCorte, String TerCorte, String NFinal, String periodo) {
        this.idEstudiante = idEstudiante;
        this.idMateria = idMateria;
        this.PerCorte = PerCorte;
        this.SdoCorte = SdoCorte;
        this.TerCorte = TerCorte;
        this.NFinal = NFinal;
        this.periodo = periodo;
    }

   
    // Property accessors

    public Long getIdEstudiante() {
        return this.idEstudiante;
    }
    
    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Long getIdMateria() {
        return this.idMateria;
    }
    
    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getPerCorte() {
        return this.PerCorte;
    }
    
    public void setPerCorte(String PerCorte) {
        this.PerCorte = PerCorte;
    }

    public String getSdoCorte() {
        return this.SdoCorte;
    }
    
    public void setSdoCorte(String SdoCorte) {
        this.SdoCorte = SdoCorte;
    }

    public String getTerCorte() {
        return this.TerCorte;
    }
    
    public void setTerCorte(String TerCorte) {
        this.TerCorte = TerCorte;
    }

    public String getNFinal() {
        return this.NFinal;
    }
    
    public void setNFinal(String NFinal) {
        this.NFinal = NFinal;
    }

    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractNotasPeriodo) ) return false;
		 AbstractNotasPeriodo castOther = ( AbstractNotasPeriodo ) other; 
         
		 return ( (this.getIdEstudiante()==castOther.getIdEstudiante()) || ( this.getIdEstudiante()!=null && castOther.getIdEstudiante()!=null && this.getIdEstudiante().equals(castOther.getIdEstudiante()) ) )
 && ( (this.getIdMateria()==castOther.getIdMateria()) || ( this.getIdMateria()!=null && castOther.getIdMateria()!=null && this.getIdMateria().equals(castOther.getIdMateria()) ) )
 && ( (this.getPerCorte()==castOther.getPerCorte()) || ( this.getPerCorte()!=null && castOther.getPerCorte()!=null && this.getPerCorte().equals(castOther.getPerCorte()) ) )
 && ( (this.getSdoCorte()==castOther.getSdoCorte()) || ( this.getSdoCorte()!=null && castOther.getSdoCorte()!=null && this.getSdoCorte().equals(castOther.getSdoCorte()) ) )
 && ( (this.getTerCorte()==castOther.getTerCorte()) || ( this.getTerCorte()!=null && castOther.getTerCorte()!=null && this.getTerCorte().equals(castOther.getTerCorte()) ) )
 && ( (this.getNFinal()==castOther.getNFinal()) || ( this.getNFinal()!=null && castOther.getNFinal()!=null && this.getNFinal().equals(castOther.getNFinal()) ) )
 && ( (this.getPeriodo()==castOther.getPeriodo()) || ( this.getPeriodo()!=null && castOther.getPeriodo()!=null && this.getPeriodo().equals(castOther.getPeriodo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEstudiante() == null ? 0 : this.getIdEstudiante().hashCode() );
         result = 37 * result + ( getIdMateria() == null ? 0 : this.getIdMateria().hashCode() );
         result = 37 * result + ( getPerCorte() == null ? 0 : this.getPerCorte().hashCode() );
         result = 37 * result + ( getSdoCorte() == null ? 0 : this.getSdoCorte().hashCode() );
         result = 37 * result + ( getTerCorte() == null ? 0 : this.getTerCorte().hashCode() );
         result = 37 * result + ( getNFinal() == null ? 0 : this.getNFinal().hashCode() );
         result = 37 * result + ( getPeriodo() == null ? 0 : this.getPeriodo().hashCode() );
         return result;
   }   





}