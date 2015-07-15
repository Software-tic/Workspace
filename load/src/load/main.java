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
import alert.model.CarrerasDocentesFacultadesId;
import alert.model.CarrerasEstudiantes;
import alert.model.CarrerasEstudiantesDAO;
import alert.model.CarrerasEstudiantesId;
import alert.model.CarrerasId;
import alert.model.DecanoFacultad;
import alert.model.DecanoFacultadDAO;
import alert.model.DecanoFacultadId;
import alert.model.Docente;
import alert.model.DocenteDAO;
import alert.model.DocenteId;
import alert.model.DocenteMateriaGrupo;
import alert.model.DocenteMateriaGrupoDAO;
import alert.model.DocenteMateriaGrupoId;
import alert.model.DocentesMaterias;
import alert.model.DocentesMateriasDAO;
import alert.model.DocentesMateriasId;
import alert.model.Estudiante;
import alert.model.EstudianteDAO;
import alert.model.EstudianteId;
import alert.model.EstudiantesMateriasGrupo;
import alert.model.EstudiantesMateriasGrupoDAO;
import alert.model.EstudiantesMateriasGrupoId;
import alert.model.EstudiantesMateriasHorarios;
import alert.model.EstudiantesMateriasHorariosDAO;
import alert.model.EstudiantesMateriasHorariosId;
import alert.model.Facultades;
import alert.model.FacultadesDAO;
import alert.model.FacultadesId;
import alert.model.Grupo;
import alert.model.GrupoDAO;
import alert.model.GrupoId;
import alert.model.Horarios;
import alert.model.HorariosDAO;
import alert.model.HorariosId;
import alert.model.Materias;
import alert.model.MateriasDAO;
import alert.model.MateriasEstudiantes;
import alert.model.MateriasEstudiantesDAO;
import alert.model.MateriasEstudiantesId;
import alert.model.MateriasGrupo;
import alert.model.MateriasGrupoDAO;
import alert.model.MateriasGrupoId;
import alert.model.MateriasId;
import alert.model.NotasPeriodo;
import alert.model.NotasPeriodoDAO;
import alert.model.NotasPeriodoId;
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
import sac.model.NotasPeriodoSAC;
import sac.model.NotasPeriodoSACDAO;

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
		//m.ResetViews();
		//m.migrateViewsFromSAC();
		System.out.println("Reset Vistas...");
		System.out.println("Carreras");
		m.resetCarrerasView();
		System.out.println("Carreras_Docente_Facultad");
		m.resetCarrerasDocFacView();
		System.out.println("Carreras_Estudiantes");
		m.resetCarrerasEstView();
		System.out.println("Decano_facultad");
		m.resetDecanoFacView();
		System.out.println("Docentes");
		m.resetDocenteView();
		System.out.println("Docentes_Materias_Grupos");
		m.resetDocenteMatGruView();
		System.out.println("Docentes_Materias");
		m.resetDocenteMatView();
		System.out.println("Estudiantes");
		m.resetEstudianteView();
		System.out.println("Estudiantes_Materias_Grupo");
		m.resetEstudiantesMatGruView();
		System.out.println("Estudiantes_Materias_Horarios");
		m.resetEstudiantesMatHorView();
		System.out.println("Facultades");
		m.resetFacultadesView();
		System.out.println("Grupos");
		m.resetGrupoView();
		System.out.println("Horarios");
		m.resetHorarioView();
		System.out.println("Materias_Estudiantes");
		m.resetMateriasEstView();
		System.out.println("Materias_Grupo");
		m.resetMateriasGruView();
		System.out.println("Materias");
		m.resetMateriasView();
		System.out.println("Notas_Periodo");
		m.resetNotasView();
		System.out.println("OK");
		
		
		System.out.println("Migrando Vistas...");
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
		System.out.println("Notas_Periodo");
		m.migrateNotasFromSAC();
		System.out.println("-----------------FIN--------------------");
	}
	
	/*public void migrateViewsFromSAC() {
		System.out.println("Migrando Vistas...");
		System.out.println("Carreras");
		migrateCarrerasFromSAC();
		System.out.println("Carreras_Docente_Facultad");
		this.migrateCarrerasDocFacFromSAC();
		System.out.println("Carreras_Estudiantes");
		this.migrateCarrerasEstFromSAC();
		System.out.println("Decano_facultad");
		this.migrateDecanoFacFromSAC();
		System.out.println("Docentes");
		this.migrateDocenteFromSAC();
		System.out.println("Docentes_Materias_Grupos");
		this.migrateDocenteMatGruFromSAC();
		System.out.println("Docentes_Materias");
		this.migrateDocenteMatFromSAC();
		System.out.println("Estudiantes");
		this.migrateEstudianteFromSAC();
		System.out.println("Estudiantes_Materias_Grupo");
		this.migrateEstudiantesMatGruFromSAC();
		System.out.println("Estudiantes_Materias_Horarios");
		this.migrateEstudiantesMatHorFromSAC();
		System.out.println("Facultades");
		this.migrateFacultadesFromSAC();
		System.out.println("Grupos");
		this.migrateGrupoFromSAC();
		System.out.println("Horarios");
		this.migrateHorarioFromSAC();
		System.out.println("Materias_Estudiantes");
		this.migrateMateriasEstFromSAC();
		System.out.println("Materias_Grupo");
		this.migrateMateriasGruFromSAC();
		System.out.println("Materias");
		this.migrateMateriasFromSAC();
		System.out.println("Notas_Periodo");
		this.migrateNotasFromSAC();
		System.out.println("-----------------FIN--------------------");
	}
	
	public void ResetViews() {
		System.out.println("Reset Vistas...");
		resetCarrerasView();
		resetCarrerasDocFacView();
		resetCarrerasEstView();
		resetDecanoFacView();
		resetDocenteView();
		resetDocenteMatGruView();
		resetDocenteMatView();
		resetEstudianteView();
		resetEstudiantesMatGruView();
		resetEstudiantesMatHorView();
		resetFacultadesView();
		resetGrupoView();
		resetHorarioView();
		resetMateriasEstView();
		resetMateriasGruView();
		resetMateriasView();
		resetNotasView();
		System.out.println("OK");
	}*/
	
	public void migrateCarrerasFromSAC() {
		CarrerasSACDAO dao = new CarrerasSACDAO();
		try {
			List<CarrerasSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				CarrerasDAO dao2 = new CarrerasDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				int i=0;
				for (CarrerasSAC SAC : l) {
					Carreras c=new Carreras(new CarrerasId(SAC.getId(), SAC.getFacultad(), SAC.getNombre()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetCarrerasView() {
		try {
			CarrerasDAO dao = new CarrerasDAO();
			List<Carreras> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (Carreras SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (CarrerasDocentesFacultadesSAC SAC : l) {
					CarrerasDocentesFacultades c=new CarrerasDocentesFacultades(new CarrerasDocentesFacultadesId(SAC.getIdDocente(), SAC.getIdCarrera(), SAC.getIdFacultad()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetCarrerasDocFacView() {
		try {
			CarrerasDocentesFacultadesDAO dao = new CarrerasDocentesFacultadesDAO();
			List<CarrerasDocentesFacultades> l= dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (CarrerasDocentesFacultades SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (CarrerasEstudiantesSAC SAC : l) {
					CarrerasEstudiantes c=new CarrerasEstudiantes(new CarrerasEstudiantesId(SAC.getIdEstudiante(), SAC.getCodAlumno(), SAC.getIdCarrera()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetCarrerasEstView() {
		try {
			CarrerasEstudiantesDAO dao = new CarrerasEstudiantesDAO();
			List<CarrerasEstudiantes> l=dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (CarrerasEstudiantes SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (DecanoFacultadSAC SAC : l) {
					DecanoFacultad c=new DecanoFacultad(new DecanoFacultadId(SAC.getIdDecano(), SAC.getIdFacultad(), SAC.getMail(), SAC.getNomDecano()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetDecanoFacView() {
		try {
			DecanoFacultadDAO dao = new DecanoFacultadDAO();
			List<DecanoFacultad> l= dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (DecanoFacultad SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (DocenteSAC SAC : l) {
					Docente c=new Docente(new DocenteId(SAC.getId(), SAC.getApellidos(), SAC.getCelular(), SAC.getCodigo(),"", 
							SAC.getCorreoAlternativo(), SAC.getDireccion(), SAC.getDocumento(), SAC.getNombres(), SAC.getTelefono()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetDocenteView() {
		try {
			DocenteDAO dao = new DocenteDAO();
			List<Docente> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				System.out.println("Entro a docente "+l.size());
				Transaction tx = dao.getSession().beginTransaction();
				for (Docente SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (DocenteMateriaGrupoSAC SAC : l) {
					DocenteMateriaGrupo c=new DocenteMateriaGrupo(new DocenteMateriaGrupoId(SAC.getIdDocente(), SAC.getIdGrupo(), SAC.getIdMateria()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetDocenteMatGruView() {
		try {
			DocenteMateriaGrupoDAO dao = new DocenteMateriaGrupoDAO();
			List<DocenteMateriaGrupo> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (DocenteMateriaGrupo SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (DocentesMateriasSAC SAC : l) {
					DocentesMaterias c=new DocentesMaterias(new DocentesMateriasId(SAC.getIdDocente(), SAC.getIdMateria()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetDocenteMatView() {
		try {
			DocentesMateriasDAO dao = new DocentesMateriasDAO();
			List<DocentesMaterias> l=dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (DocentesMaterias SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (EstudianteSAC SAC : l) {
					Estudiante c=new Estudiante(new EstudianteId(SAC.getId(), SAC.getApellidos(), SAC.getCelular(), SAC.getCorreoAlternativo(), 
							SAC.getDireccion(), SAC.getDocumento(), SAC.getNombres(), SAC.getTelefono()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetEstudianteView() {
		try {
			EstudianteDAO dao = new EstudianteDAO();
			List<Estudiante> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (Estudiante SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (EstudiantesMateriasGrupoSAC SAC : l) {
					EstudiantesMateriasGrupo c=new EstudiantesMateriasGrupo(new EstudiantesMateriasGrupoId(SAC.getIdMateria(), SAC.getIdEstudiante(), SAC.getIdGrupo()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetEstudiantesMatGruView() {
		try {
			EstudiantesMateriasGrupoDAO dao = new EstudiantesMateriasGrupoDAO();
			List<EstudiantesMateriasGrupo> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (EstudiantesMateriasGrupo SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (EstudiantesMateriasHorariosSAC SAC : l) {
					EstudiantesMateriasHorarios c=new EstudiantesMateriasHorarios(new EstudiantesMateriasHorariosId(SAC.getIdMateria(), SAC.getHoraFin(), 
							SAC.getHoraInicio(), SAC.getIdDiaSemana(), SAC.getIdEstudiante()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetEstudiantesMatHorView() {
		try {
			EstudiantesMateriasHorariosDAO dao = new EstudiantesMateriasHorariosDAO();
			List<EstudiantesMateriasHorarios> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (EstudiantesMateriasHorarios SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (FacultadesSAC SAC : l) {
					Facultades c=new Facultades(new FacultadesId(SAC.getIdentificador(), SAC.getFacultad()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetFacultadesView() {
		try {
			FacultadesDAO dao = new FacultadesDAO();
			List<Facultades> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (Facultades SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (GrupoSAC SAC : l) {
					Grupo c=new Grupo(new GrupoId( SAC.getIdGrupo(), SAC.getAula(), SAC.getNombreGrupo()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetGrupoView() {
		try {
			GrupoDAO dao = new GrupoDAO();
			List<Grupo> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (Grupo SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (HorariosSAC SAC : l) {
					Horarios c=new Horarios(new HorariosId(SAC.getMateria(), SAC.getDiaDeClase(), SAC.getGrupo()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetHorarioView() {
		try {
			HorariosDAO dao = new HorariosDAO();
			List<Horarios> l=dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (Horarios SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (MateriasEstudiantesSAC SAC : l) {
					MateriasEstudiantes c=new MateriasEstudiantes(new MateriasEstudiantesId(SAC.getIdMateria(), SAC.getIdEstudiante()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetMateriasEstView() {
		try {
			MateriasEstudiantesDAO dao = new MateriasEstudiantesDAO();
			List<MateriasEstudiantes> l=dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (MateriasEstudiantes SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (MateriasGrupoSAC SAC : l) {
					MateriasGrupo c=new MateriasGrupo(new MateriasGrupoId( SAC.getIdMateria(), SAC.getIdGrupo()));
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetMateriasGruView() {
		try {
			MateriasGrupoDAO dao = new MateriasGrupoDAO();
			List<MateriasGrupo> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (MateriasGrupo SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
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
				int i=0;
				for (MateriasSAC mSAC : sl) {
					Materias m=new Materias(new MateriasId(mSAC.getId(), mSAC.getFechaFin(),mSAC.getFechaInicio(), mSAC.getIntHoraria(), mSAC.getNombre(), mSAC.getSemestre()));
					if(dao2.findById(m.getId())==null){
						dao2.save(m);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetMateriasView() {
		try {
			MateriasDAO dao = new MateriasDAO();
			List<Materias> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (Materias SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void migrateNotasFromSAC() {
		NotasPeriodoSACDAO dao = new NotasPeriodoSACDAO();
		try {
			List<NotasPeriodoSAC> l = dao.findAll();
			dao.getSession().close();
			dao = null;
			
			if (l != null && !l.isEmpty()) {
				NotasPeriodoDAO dao2 = new NotasPeriodoDAO();
				Transaction tx = dao2.getSession().beginTransaction();
				int i=0;
				for (NotasPeriodoSAC SAC : l) {
					NotasPeriodo c=new NotasPeriodo (new NotasPeriodoId (SAC.getIdEstudiante(), Long.valueOf(SAC.getIdMateria()), SAC.getPeriodo(),
							SAC.getPrimerCorte(), SAC.getSegundoCorte(), SAC.getTercerCorte(), SAC.getnFinal()));
					
					if(dao2.findById(c.getId())==null){
						dao2.save(c);
					}
					i++;
				}
				tx.commit();
				dao2.getSession().close();
				dao2 = null;
				System.out.println("- "+i);
			}
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
	
	public void resetNotasView() {
		try {
			NotasPeriodoDAO dao = new NotasPeriodoDAO();
			List<NotasPeriodo> l = dao.findAll();
			if (l != null && !l.isEmpty()) {
				Transaction tx = dao.getSession().beginTransaction();
				for (NotasPeriodo SAC : l) {
					dao.delete(SAC);
				}
				tx.commit();
			}
			dao.getSession().close();
			dao = null;
		} catch (Exception e) {
			System.err.println("aqui:"+e);
		}
	}
}
