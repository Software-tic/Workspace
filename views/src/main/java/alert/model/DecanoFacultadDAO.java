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
 * DecanoFacultad entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see alert.model.DecanoFacultad
 * @author MyEclipse Persistence Tools
 */
@Entity public class DecanoFacultadDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(DecanoFacultadDAO.class);
	// property constants
	public static final String ID_FACULTAD = "idFacultad";
	public static final String MAIL = "mail";
	public static final String NOM_DECANO = "nomDecano";

	public void save(DecanoFacultad transientInstance) {
		log.debug("saving DecanoFacultad instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DecanoFacultad persistentInstance) {
		log.debug("deleting DecanoFacultad instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DecanoFacultad findById(java.lang.Long id) {
		log.debug("getting DecanoFacultad instance with id: " + id);
		try {
			DecanoFacultad instance = (DecanoFacultad) getSession().get(
					"alert.model.DecanoFacultad", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DecanoFacultad instance) {
		log.debug("finding DecanoFacultad instance by example");
		try {
			List results = getSession()
					.createCriteria("alert.model.DecanoFacultad")
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
		log.debug("finding DecanoFacultad instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DecanoFacultad as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdFacultad(Object idFacultad) {
		return findByProperty(ID_FACULTAD, idFacultad);
	}

	public List findByMail(Object mail) {
		return findByProperty(MAIL, mail);
	}

	public List findByNomDecano(Object nomDecano) {
		return findByProperty(NOM_DECANO, nomDecano);
	}

	public List findAll() {
		log.debug("finding all DecanoFacultad instances");
		try {
			String queryString = "from DecanoFacultad";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DecanoFacultad merge(DecanoFacultad detachedInstance) {
		log.debug("merging DecanoFacultad instance");
		try {
			DecanoFacultad result = (DecanoFacultad) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DecanoFacultad instance) {
		log.debug("attaching dirty DecanoFacultad instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DecanoFacultad instance) {
		log.debug("attaching clean DecanoFacultad instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}