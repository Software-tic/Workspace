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
 * Carreras entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see alert.model.Carreras
 * @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(CarrerasDAO.class);
	// property constants
	public static final String FACULTAD = "facultad";
	public static final String NOMBRE = "nombre";

	public void save(Carreras transientInstance) {
		log.debug("saving Carreras instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Carreras persistentInstance) {
		log.debug("deleting Carreras instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Carreras findById(java.lang.String id) {
		log.debug("getting Carreras instance with id: " + id);
		try {
			Carreras instance = (Carreras) getSession().get(
					"alert.model.Carreras", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Carreras instance) {
		log.debug("finding Carreras instance by example");
		try {
			List results = getSession().createCriteria("alert.model.Carreras")
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
		log.debug("finding Carreras instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Carreras as model where model."
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
		log.debug("finding all Carreras instances");
		try {
			String queryString = "from Carreras";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Carreras merge(Carreras detachedInstance) {
		log.debug("merging Carreras instance");
		try {
			Carreras result = (Carreras) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Carreras instance) {
		log.debug("attaching dirty Carreras instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Carreras instance) {
		log.debug("attaching clean Carreras instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}