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
 * Facultades entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see 	SAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class FacultadesSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(FacultadesSACDAO.class);
	// property constants
	public static final String FACULTAD = "facultad";

	public void save(FacultadesSAC transientInstance) {
		log.debug("saving Facultades instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FacultadesSAC persistentInstance) {
		log.debug("deleting FacultadesSAC instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FacultadesSAC findById(java.lang.Long id) {
		log.debug("getting FacultadesSAC instance with id: " + id);
		try {
			FacultadesSAC instance = (FacultadesSAC) getSession().get(
					"sac.model.FacultadesSAC", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FacultadesSAC instance) {
		log.debug("finding FacultadesSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.FacultadesSAC")
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
		log.debug("finding FacultadesSAC instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FacultadesSAC as model where model."
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

	public List findAll() {
		log.debug("finding all FacultadesSAC instances");
		try {
			String queryString = "from FacultadesSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FacultadesSAC merge(FacultadesSAC detachedInstance) {
		log.debug("merging FacultadesSAC instance");
		try {
			FacultadesSAC result = (FacultadesSAC) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FacultadesSAC instance) {
		log.debug("attaching dirty FacultadesSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FacultadesSAC instance) {
		log.debug("attaching clean FacultadesSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}