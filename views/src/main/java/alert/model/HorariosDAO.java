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
 * Horarios entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see alert.model.Horarios
 * @author MyEclipse Persistence Tools
 */
public class HorariosDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(HorariosDAO.class);
	// property constants
	public static final String DIA_DE_CLASE = "diaDeClase";
	public static final String GRUPO = "grupo";

	public void save(Horarios transientInstance) {
		log.debug("saving Horarios instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Horarios persistentInstance) {
		log.debug("deleting Horarios instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Horarios findById(java.lang.String id) {
		log.debug("getting Horarios instance with id: " + id);
		try {
			Horarios instance = (Horarios) getSession().get(
					"alert.model.Horarios", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Horarios> findByExample(Horarios instance) {
		log.debug("finding Horarios instance by example");
		try {
			List<Horarios> results = (List<Horarios>) getSession()
					.createCriteria("alert.model.Horarios")
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
		log.debug("finding Horarios instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Horarios as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Horarios> findByDiaDeClase(Object diaDeClase) {
		return findByProperty(DIA_DE_CLASE, diaDeClase);
	}

	public List<Horarios> findByGrupo(Object grupo) {
		return findByProperty(GRUPO, grupo);
	}

	public List findAll() {
		log.debug("finding all Horarios instances");
		try {
			String queryString = "from Horarios";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Horarios merge(Horarios detachedInstance) {
		log.debug("merging Horarios instance");
		try {
			Horarios result = (Horarios) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Horarios instance) {
		log.debug("attaching dirty Horarios instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Horarios instance) {
		log.debug("attaching clean Horarios instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}