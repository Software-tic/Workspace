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
 * MateriasEstudiantes entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see alert.model.MateriasEstudiantes
 * @author MyEclipse Persistence Tools
 */
public class MateriasEstudiantesDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(MateriasEstudiantesDAO.class);

	// property constants

	public void save(MateriasEstudiantes transientInstance) {
		log.debug("saving MateriasEstudiantes instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MateriasEstudiantes persistentInstance) {
		log.debug("deleting MateriasEstudiantes instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MateriasEstudiantes findById(alert.model.MateriasEstudiantesId id) {
		log.debug("getting MateriasEstudiantes instance with id: " + id);
		try {
			MateriasEstudiantes instance = (MateriasEstudiantes) getSession()
					.get("alert.model.MateriasEstudiantes", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<MateriasEstudiantes> findByExample(MateriasEstudiantes instance) {
		log.debug("finding MateriasEstudiantes instance by example");
		try {
			List<MateriasEstudiantes> results = (List<MateriasEstudiantes>) getSession()
					.createCriteria("alert.model.MateriasEstudiantes")
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
		log.debug("finding MateriasEstudiantes instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MateriasEstudiantes as model where model."
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
		log.debug("finding all MateriasEstudiantes instances");
		try {
			String queryString = "from MateriasEstudiantes";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MateriasEstudiantes merge(MateriasEstudiantes detachedInstance) {
		log.debug("merging MateriasEstudiantes instance");
		try {
			MateriasEstudiantes result = (MateriasEstudiantes) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MateriasEstudiantes instance) {
		log.debug("attaching dirty MateriasEstudiantes instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MateriasEstudiantes instance) {
		log.debug("attaching clean MateriasEstudiantes instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}