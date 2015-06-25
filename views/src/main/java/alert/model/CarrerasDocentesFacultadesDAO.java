package alert.model;

import java.util.List;

import javax.persistence.Entity;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOAlert;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarrerasDocentesFacultades entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see alert.model.CarrerasDocentesFacultades
 * @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasDocentesFacultadesDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(CarrerasDocentesFacultadesDAO.class);
	// property constants
	public static final String ID_CARRERA = "idCarrera";
	public static final String ID_FACULTAD = "idFacultad";

	public void save(CarrerasDocentesFacultades transientInstance) {
		log.debug("saving CarrerasDocentesFacultades instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarrerasDocentesFacultades persistentInstance) {
		log.debug("deleting CarrerasDocentesFacultades instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarrerasDocentesFacultades findById(java.lang.Long id) {
		log.debug("getting CarrerasDocentesFacultades instance with id: " + id);
		try {
			CarrerasDocentesFacultades instance = (CarrerasDocentesFacultades) getSession()
					.get("alert.model.CarrerasDocentesFacultades", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CarrerasDocentesFacultades instance) {
		log.debug("finding CarrerasDocentesFacultades instance by example");
		try {
			List results = getSession()
					.createCriteria("alert.model.CarrerasDocentesFacultades")
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
		log.debug("finding CarrerasDocentesFacultades instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CarrerasDocentesFacultades as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdCarrera(Object idCarrera) {
		return findByProperty(ID_CARRERA, idCarrera);
	}

	public List findByIdFacultad(Object idFacultad) {
		return findByProperty(ID_FACULTAD, idFacultad);
	}

	public List findAll() {
		log.debug("finding all CarrerasDocentesFacultades instances");
		try {
			String queryString = "from CarrerasDocentesFacultades";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarrerasDocentesFacultades merge(
			CarrerasDocentesFacultades detachedInstance) {
		log.debug("merging CarrerasDocentesFacultades instance");
		try {
			CarrerasDocentesFacultades result = (CarrerasDocentesFacultades) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarrerasDocentesFacultades instance) {
		log.debug("attaching dirty CarrerasDocentesFacultades instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarrerasDocentesFacultades instance) {
		log.debug("attaching clean CarrerasDocentesFacultades instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}