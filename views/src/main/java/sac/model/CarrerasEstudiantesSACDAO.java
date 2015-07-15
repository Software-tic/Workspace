package sac.model;

import java.util.List;

import javax.persistence.Entity;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOSAC;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarrerasEstudiantes entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sac.model.CarrerasEstudiantesSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasEstudiantesSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(CarrerasEstudiantesSACDAO.class);
	// property constants
	public static final String COD_ALUMNO = "codAlumno";
	public static final String ID_CARRERA = "idCarrera";

	public List findByExample(CarrerasEstudiantesSAC instance) {
		log.debug("finding CarrerasEstudiantesSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.CarrerasEstudiantesSAC")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CarrerasEstudiantesSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CarrerasEstudiantesSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCodAlumno(Object codAlumno) {
		return findByProperty(COD_ALUMNO, codAlumno);
	}

	public List findByIdCarrera(Object idCarrera) {
		return findByProperty(ID_CARRERA, idCarrera);
	}

	public List findAll() {
		log.debug("finding all CarrerasEstudiantesSAC instances");
		try {
			String queryString = "from CarrerasEstudiantesSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarrerasEstudiantesSAC merge(CarrerasEstudiantesSAC detachedInstance) {
		log.debug("merging CarrerasEstudiantesSAC instance");
		try {
			CarrerasEstudiantesSAC result = (CarrerasEstudiantesSAC) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarrerasEstudiantesSAC instance) {
		log.debug("attaching dirty CarrerasEstudiantesSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarrerasEstudiantesSAC instance) {
		log.debug("attaching clean CarrerasEstudiantesSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}