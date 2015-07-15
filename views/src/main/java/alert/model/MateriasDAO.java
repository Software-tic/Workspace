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
 * Materias entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see alert.model.Materias
 * @author MyEclipse Persistence Tools
 */
public class MateriasDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(MateriasDAO.class);

	// property constants

	public void save(Materias transientInstance) {
		log.debug("saving Materias instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Materias persistentInstance) {
		log.debug("deleting Materias instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Materias findById(alert.model.MateriasId id) {
		log.debug("getting Materias instance with id: " + id);
		try {
			Materias instance = (Materias) getSession().get(
					"alert.model.Materias", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Materias> findByExample(Materias instance) {
		log.debug("finding Materias instance by example");
		try {
			List<Materias> results = (List<Materias>) getSession()
					.createCriteria("alert.model.Materias")
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
		log.debug("finding Materias instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Materias as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Materias instances");
		try {
			String queryString = "from Materias";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Materias merge(Materias detachedInstance) {
		log.debug("merging Materias instance");
		try {
			Materias result = (Materias) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Materias instance) {
		log.debug("attaching dirty Materias instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Materias instance) {
		log.debug("attaching clean Materias instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}