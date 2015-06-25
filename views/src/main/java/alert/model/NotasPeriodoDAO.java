package alert.model;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOAlert;

/**
 * A data access object (DAO) providing persistence and search support for
 * NotasPeriodo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see alert.model.NotasPeriodo
 * @author MyEclipse Persistence Tools
 */
public class NotasPeriodoDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(NotasPeriodoDAO.class);

	// property constants

	public void save(NotasPeriodo transientInstance) {
		log.debug("saving NotasPeriodo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(NotasPeriodo persistentInstance) {
		log.debug("deleting NotasPeriodo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NotasPeriodo findById(alert.model.AbstractNotasPeriodo id) {
		log.debug("getting NotasPeriodo instance with id: " + id);
		try {
			NotasPeriodo instance = (NotasPeriodo) getSession().get(
					"alert.model.NotasPeriodo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(NotasPeriodo instance) {
		log.debug("finding NotasPeriodo instance by example");
		try {
			List results = getSession()
					.createCriteria("alert.model.NotasPeriodo")
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
		log.debug("finding NotasPeriodo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from NotasPeriodo as model where model."
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
		log.debug("finding all NotasPeriodo instances");
		try {
			String queryString = "from NotasPeriodo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public NotasPeriodo merge(NotasPeriodo detachedInstance) {
		log.debug("merging NotasPeriodo instance");
		try {
			NotasPeriodo result = (NotasPeriodo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(NotasPeriodo instance) {
		log.debug("attaching dirty NotasPeriodo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NotasPeriodo instance) {
		log.debug("attaching clean NotasPeriodo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}