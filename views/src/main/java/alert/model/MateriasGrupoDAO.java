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
 * MateriasGrupo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see alert.model.MateriasGrupo
 * @author MyEclipse Persistence Tools
 */
public class MateriasGrupoDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(MateriasGrupoDAO.class);

	// property constants

	public void save(MateriasGrupo transientInstance) {
		log.debug("saving MateriasGrupo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MateriasGrupo persistentInstance) {
		log.debug("deleting MateriasGrupo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MateriasGrupo findById(alert.model.MateriasGrupoId id) {
		log.debug("getting MateriasGrupo instance with id: " + id);
		try {
			MateriasGrupo instance = (MateriasGrupo) getSession().get(
					"alert.model.MateriasGrupo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<MateriasGrupo> findByExample(MateriasGrupo instance) {
		log.debug("finding MateriasGrupo instance by example");
		try {
			List<MateriasGrupo> results = (List<MateriasGrupo>) getSession()
					.createCriteria("alert.model.MateriasGrupo")
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
		log.debug("finding MateriasGrupo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MateriasGrupo as model where model."
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
		log.debug("finding all MateriasGrupo instances");
		try {
			String queryString = "from MateriasGrupo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MateriasGrupo merge(MateriasGrupo detachedInstance) {
		log.debug("merging MateriasGrupo instance");
		try {
			MateriasGrupo result = (MateriasGrupo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MateriasGrupo instance) {
		log.debug("attaching dirty MateriasGrupo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MateriasGrupo instance) {
		log.debug("attaching clean MateriasGrupo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}