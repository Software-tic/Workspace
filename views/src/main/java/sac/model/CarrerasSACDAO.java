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
 * CarrerasSAC entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sac.model.CarrerasSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(CarrerasSACDAO.class);
	// property constants
	public static final String FACULTAD = "facultad";
	public static final String NOMBRE = "nombre";

	public void save(CarrerasSAC transientInstance) {
		log.debug("saving CarrerasSAC instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarrerasSAC persistentInstance) {
		log.debug("deleting CarrerasSAC instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarrerasSAC findById(java.lang.String id) {
		log.debug("getting CarrerasSAC instance with id: " + id);
		try {
			CarrerasSAC instance = (CarrerasSAC) getSession().get("sac.model.CarrerasSAC", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CarrerasSAC instance) {
		log.debug("finding CarrerasSAC instance by example");
		try {
			List results = getSession().createCriteria("sac.model.CarrerasSAC")
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
		log.debug("finding CarrerasSAC instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CarrerasSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFacultad(Object facultad) {
		return findByProperty(FACULTAD, facultad);
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findAll() {
		log.debug("finding all CarrerasSAC instances");
		try {
			String queryString = "from CarrerasSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarrerasSAC merge(CarrerasSAC detachedInstance) {
		log.debug("merging CarrerasSAC instance");
		try {
			CarrerasSAC result = (CarrerasSAC) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarrerasSAC instance) {
		log.debug("attaching dirty CarrerasSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarrerasSAC instance) {
		log.debug("attaching clean CarrerasSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}