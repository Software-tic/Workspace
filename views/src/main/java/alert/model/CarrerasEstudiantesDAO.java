package alert.model;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOAlert;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarrerasEstudiantes entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see alert.model.CarrerasEstudiantes
 * @author MyEclipse Persistence Tools
 */
public class CarrerasEstudiantesDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(CarrerasEstudiantesDAO.class);
	// property constants
	public static final String COD_ALUMNO = "codAlumno";
	public static final String ID_CARRERA = "idCarrera";

	public void save(CarrerasEstudiantes transientInstance) {
		log.debug("saving CarrerasEstudiantes instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarrerasEstudiantes persistentInstance) {
		log.debug("deleting CarrerasEstudiantes instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarrerasEstudiantes findById(java.lang.Long id) {
		log.debug("getting CarrerasEstudiantes instance with id: " + id);
		try {
			CarrerasEstudiantes instance = (CarrerasEstudiantes) getSession()
					.get("alert.model.CarrerasEstudiantes", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<CarrerasEstudiantes> findByExample(CarrerasEstudiantes instance) {
		log.debug("finding CarrerasEstudiantes instance by example");
		try {
			List<CarrerasEstudiantes> results = (List<CarrerasEstudiantes>) getSession()
					.createCriteria("alert.model.CarrerasEstudiantes")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CarrerasEstudiantes instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CarrerasEstudiantes as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<CarrerasEstudiantes> findByCodAlumno(Object codAlumno) {
		return findByProperty(COD_ALUMNO, codAlumno);
	}

	public List<CarrerasEstudiantes> findByIdCarrera(Object idCarrera) {
		return findByProperty(ID_CARRERA, idCarrera);
	}

	public List findAll() {
		log.debug("finding all CarrerasEstudiantes instances");
		try {
			String queryString = "from CarrerasEstudiantes";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarrerasEstudiantes merge(CarrerasEstudiantes detachedInstance) {
		log.debug("merging CarrerasEstudiantes instance");
		try {
			CarrerasEstudiantes result = (CarrerasEstudiantes) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarrerasEstudiantes instance) {
		log.debug("attaching dirty CarrerasEstudiantes instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarrerasEstudiantes instance) {
		log.debug("attaching clean CarrerasEstudiantes instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}