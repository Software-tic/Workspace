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
 * DecanoFacultad entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sac.model.DecanoFacultadSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class DecanoFacultadSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(DecanoFacultadSACDAO.class);
	// property constants
	public static final String ID_FACULTAD = "idFacultad";
	public static final String MAIL = "mail";
	public static final String NOM_DECANO = "nomDecano";

	public List findByExample(DecanoFacultadSAC instance) {
		log.debug("finding DecanoFacultadSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.DecanoFacultadSAC")
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
		log.debug("finding DecanoFacultadSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DecanoFacultadSAC as model where model."
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
			String queryString = "from DecanoFacultadSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DecanoFacultadSAC merge(DecanoFacultadSAC detachedInstance) {
		log.debug("merging DecanoFacultadSAC instance");
		try {
			DecanoFacultadSAC result = (DecanoFacultadSAC) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DecanoFacultadSAC instance) {
		log.debug("attaching dirty DecanoFacultadSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DecanoFacultadSAC instance) {
		log.debug("attaching clean DecanoFacultadSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}