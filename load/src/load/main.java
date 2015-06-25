/**
 * 
 */
package load;

import java.util.List;

import org.hibernate.Transaction;

import alert.model.Carreras;
import alert.model.CarrerasDAO;
import alert.model.CarrerasDocentesFacultades;
import alert.model.CarrerasDocentesFacultadesDAO;
import alert.model.CarrerasEstudiantes;
import alert.model.CarrerasEstudiantesDAO;
import alert.model.DecanoFacultad;
import alert.model.DecanoFacultadDAO;
import alert.model.Docente;
import alert.model.DocenteDAO;
import alert.model.DocenteMateriaGrupo;
import alert.model.DocenteMateriaGrupoDAO;
import alert.model.DocentesMaterias;
import alert.model.DocentesMateriasDAO;
import alert.model.Estudiante;
import alert.model.EstudianteDAO;
import alert.model.EstudiantesMateriasGrupo;
import alert.model.EstudiantesMateriasGrupoDAO;
import alert.model.EstudiantesMateriasHorarios;
import alert.model.EstudiantesMateriasHorariosDAO;
import alert.model.Facultades;
import alert.model.FacultadesDAO;
import alert.model.Grupo;
import alert.model.GrupoDAO;
import alert.model.Horarios;
import alert.model.HorariosDAO;
import alert.model.Materias;
import alert.model.MateriasDAO;
import alert.model.MateriasEstudiantes;
import alert.model.MateriasEstudiantesDAO;
import alert.model.MateriasGrupo;
import alert.model.MateriasGrupoDAO;
import sac.model.CarrerasDocentesFacultadesSAC;
import sac.model.CarrerasDocentesFacultadesSACDAO;
import sac.model.CarrerasEstudiantesSAC;
import sac.model.CarrerasEstudiantesSACDAO;
import sac.model.CarrerasSAC;
import sac.model.CarrerasSACDAO;
import sac.model.DecanoFacultadSAC;
import sac.model.DecanoFacultadSACDAO;
import sac.model.DocenteMateriaGrupoSAC;
import sac.model.DocenteMateriaGrupoSACDAO;
import sac.model.DocenteSAC;
import sac.model.DocenteSACDAO;
import sac.model.DocentesMateriasSAC;
import sac.model.DocentesMateriasSACDAO;
import sac.model.EstudianteSAC;
import sac.model.EstudianteSACDAO;
import sac.model.EstudiantesMateriasGrupoSAC;
import sac.model.EstudiantesMateriasGrupoSACDAO;
import sac.model.EstudiantesMateriasHorariosSAC;
import sac.model.EstudiantesMateriasHorariosSACDAO;
import sac.model.FacultadesSAC;
import sac.model.FacultadesSACDAO;
import sac.model.GrupoSAC;
import sac.model.GrupoSACDAO;
import sac.model.HorariosSAC;
import sac.model.HorariosSACDAO;
import sac.model.MateriasEstudiantesSAC;
import sac.model.MateriasEstudiantesSACDAO;
import sac.model.MateriasGrupoSAC;
import sac.model.MateriasGrupoSACDAO;
import sac.model.MateriasSAC;
import sac.model.MateriasSACDAO;

/**
 * @author TIC
 *
 */
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		main m= new main();
		System.out.println("Carreras");
		m.migrateCarrerasFromSAC();
		System.out.println("Carreras_Docente_Facultad");
		m.migrateCarrerasDocFacFromSAC();
		System.out.println("Carreras_Estudiantes");
		m.migrateCarrerasEstFromSAC();
		System.out.println("Decano_facultad");
		m.migrateDecanoFacFromSAC();
		System.out.println("Docentes");
		m.migrateDocenteFromSAC();
		System.out.println("Docentes_Materias_Grupos");
		m.migrateDocenteMatGruFromSAC();
		System.out.println("Docentes_Materias");
		m.migrateDocenteMatFromSAC();
		System.out.println("Estudiantes");
		m.migrateEstudianteFromSAC();
		System.out.println("Estudiantes_Materias_Grupo");
		m.migrateEstudiantesMatGruFromSAC();
		System.out.println("Estudiantes_Materias_Horarios");
		m.migrateEstudiantesMatHorFromSAC();
		System.out.println("Facultades");
		m.migrateFacultadesFromSAC();
		System.out.println("Grupos");
		m.migrateGrupoFromSAC();
		System.out.println("Horarios");
		m.migrateHorarioFromSAC();
		System.out.println("Materias_Estudiantes");
		m.migrateMateriasEstFromSAC();
		System.out.println("Materias_Grupo");
		m.migrateMateriasGruFromSAC();
		System.out.println("Materias");
		m.migrateMateriasFromSAC();
		System.out.println("-----------------FIN--------------------");
	}
	
	public void migrateNotasFromSAC() {
		/*CarrerasSACDAO dao = new CarrerasSACDAO();
		try {
			List<CarrerasSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				CarrerasDAO dao2 = new CarrerasDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (CarrerasSAC SAC : l) {
					Carreras c=new Carreras(SAC.getId(), SAC.getFacultad(), SAC.getNombre());
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}*/
	}
	
	public void migrateCarrerasFromSAC() {
		CarrerasSACDAO dao = new CarrerasSACDAO();
		try {
			List<CarrerasSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				CarrerasDAO dao2 = new CarrerasDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (CarrerasSAC SAC : l) {
					Carreras c=new Carreras(SAC.getId(), SAC.getFacultad(), SAC.getNombre());
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateCarrerasDocFacFromSAC() {
		CarrerasDocentesFacultadesSACDAO dao = new CarrerasDocentesFacultadesSACDAO() ;
		try {
			List<CarrerasDocentesFacultadesSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				CarrerasDocentesFacultadesDAO dao2 = new CarrerasDocentesFacultadesDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (CarrerasDocentesFacultadesSAC SAC : l) {
					CarrerasDocentesFacultades c=new CarrerasDocentesFacultades(SAC.getIdDocente(), SAC.getIdCarrera(), SAC.getIdFacultad());
					if(dao2.findById(c.getIdDocente())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateCarrerasEstFromSAC() {
		CarrerasEstudiantesSACDAO dao = new CarrerasEstudiantesSACDAO() ;
		try {
			List<CarrerasEstudiantesSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				CarrerasEstudiantesDAO dao2 = new CarrerasEstudiantesDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (CarrerasEstudiantesSAC SAC : l) {
					CarrerasEstudiantes c=new CarrerasEstudiantes(SAC.getIdEstudiante(), SAC.getCodAlumno(), SAC.getIdCarrera());
					if(dao2.findById(c.getIdEstudiante())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateDecanoFacFromSAC() {
		DecanoFacultadSACDAO dao = new DecanoFacultadSACDAO();
		try {
			List<DecanoFacultadSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				DecanoFacultadDAO dao2 = new DecanoFacultadDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (DecanoFacultadSAC SAC : l) {
					DecanoFacultad c=new DecanoFacultad(SAC.getIdDecano(), SAC.getIdFacultad(), SAC.getMail(), SAC.getNomDecano());
					if(dao2.findById(c.getIdDecano())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateDocenteFromSAC() {
		DocenteSACDAO dao = new DocenteSACDAO();
		try {
			List<DocenteSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				DocenteDAO dao2 = new DocenteDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (DocenteSAC SAC : l) {
					Docente c=new Docente(SAC.getId(), SAC.getApellidos(), SAC.getCelular(), SAC.getCodigo(), SAC.getCorreoAlternativo(),
							"", SAC.getDireccion(), SAC.getDocumento(), SAC.getNombres(), SAC.getTelefono());
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateDocenteMatGruFromSAC() {
		DocenteMateriaGrupoSACDAO dao = new DocenteMateriaGrupoSACDAO();
		try {
			List<DocenteMateriaGrupoSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				DocenteMateriaGrupoDAO dao2 = new DocenteMateriaGrupoDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (DocenteMateriaGrupoSAC SAC : l) {
					DocenteMateriaGrupo c=new DocenteMateriaGrupo(SAC.getIdDocente(), SAC.getIdGrupo(), SAC.getIdMateria());
					if(dao2.findById(c.getIdDocente())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateDocenteMatFromSAC() {
		DocentesMateriasSACDAO dao = new DocentesMateriasSACDAO();
		try {
			List<DocentesMateriasSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				DocentesMateriasDAO dao2 = new DocentesMateriasDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (DocentesMateriasSAC SAC : l) {
					DocentesMaterias c=new DocentesMaterias(SAC.getIdDocente(), SAC.getIdMateria());
					if(dao2.findById(c.getIdDocente())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateEstudianteFromSAC() {
		EstudianteSACDAO dao = new EstudianteSACDAO();
		try {
			List<EstudianteSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				EstudianteDAO dao2 = new EstudianteDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (EstudianteSAC SAC : l) {
					Estudiante c=new Estudiante(SAC.getId(), SAC.getApellidos(), SAC.getCelular(), SAC.getCorreoAlternativo(), 
							SAC.getDireccion(), SAC.getDocumento(), SAC.getNombres(), SAC.getTelefono());
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateEstudiantesMatGruFromSAC() {
		EstudiantesMateriasGrupoSACDAO dao = new EstudiantesMateriasGrupoSACDAO();
		try {
			List<EstudiantesMateriasGrupoSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				EstudiantesMateriasGrupoDAO dao2 = new EstudiantesMateriasGrupoDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (EstudiantesMateriasGrupoSAC SAC : l) {
					EstudiantesMateriasGrupo c=new EstudiantesMateriasGrupo(SAC.getIdMateria(), SAC.getIdEstudiante(), SAC.getIdGrupo());
					if(dao2.findById(c.getIdMateria())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateEstudiantesMatHorFromSAC() {
		EstudiantesMateriasHorariosSACDAO dao = new EstudiantesMateriasHorariosSACDAO();
		try {
			List<EstudiantesMateriasHorariosSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				EstudiantesMateriasHorariosDAO dao2 = new EstudiantesMateriasHorariosDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (EstudiantesMateriasHorariosSAC SAC : l) {
					EstudiantesMateriasHorarios c=new EstudiantesMateriasHorarios(SAC.getIdMateria(), SAC.getHoraFin(), 
							SAC.getHoraInicio(), SAC.getIdDiaSemana(), SAC.getIdEstudiante());
					if(dao2.findById(c.getIdMateria())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateFacultadesFromSAC() {
		FacultadesSACDAO dao = new FacultadesSACDAO();
		try {
			List<FacultadesSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				FacultadesDAO dao2 = new FacultadesDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (FacultadesSAC SAC : l) {
					Facultades c=new Facultades(SAC.getIdentificador(), SAC.getFacultad());
					if(dao2.findById(c.getIdentificador())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateGrupoFromSAC() {
		GrupoSACDAO dao = new GrupoSACDAO();
		try {
			List<GrupoSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				GrupoDAO dao2 = new GrupoDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (GrupoSAC SAC : l) {
					Grupo c=new Grupo(SAC.getIdGrupo(), SAC.getAula(), SAC.getNombreGrupo());
					if(dao2.findById(c.getIdGrupo())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateHorarioFromSAC() {
		HorariosSACDAO dao = new HorariosSACDAO();
		try {
			List<HorariosSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				HorariosDAO dao2 = new HorariosDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (HorariosSAC SAC : l) {
					Horarios c=new Horarios(SAC.getMateria(), SAC.getDiaDeClase(), SAC.getGrupo());
					if(dao2.findById(c.getMateria())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateMateriasEstFromSAC() {
		MateriasEstudiantesSACDAO dao = new MateriasEstudiantesSACDAO();
		try {
			List<MateriasEstudiantesSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				MateriasEstudiantesDAO dao2 = new MateriasEstudiantesDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (MateriasEstudiantesSAC SAC : l) {
					MateriasEstudiantes c=new MateriasEstudiantes(SAC.getIdMateria(), SAC.getIdEstudiante());
					if(dao2.findById(c.getIdMateria())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateMateriasGruFromSAC() {
		MateriasGrupoSACDAO dao = new MateriasGrupoSACDAO();
		try {
			List<MateriasGrupoSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				MateriasGrupoDAO dao2 = new MateriasGrupoDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (MateriasGrupoSAC SAC : l) {
					MateriasGrupo c=new MateriasGrupo(SAC.getIdMateria(), SAC.getIdGrupo());
					if(dao2.findById(c.getIdMateria())==null){
						dao2.save(c);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateMateriasFromSAC() {
		MateriasSACDAO dao = new MateriasSACDAO();
		try {
			List<MateriasSAC> sl = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (sl != null && !sl.isEmpty()) {
				MateriasDAO dao2 = new MateriasDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				for (MateriasSAC mSAC : sl) {
					Materias m=new Materias(mSAC.getId(), mSAC.getFechaFin(),mSAC.getFechaInicio(), mSAC.getIntHoraria(), mSAC.getNombre(), mSAC.getSemestre());
					if(dao2.findById(m.getId())==null){
						dao2.save(m);
					}
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
}
