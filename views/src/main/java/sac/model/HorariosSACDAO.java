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
 * Horarios entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sac.model.HorariosSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class HorariosSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(HorariosSACDAO.class);
	// property constants
	public static final String DIA_DE_CLASE = "diaDeClase";
	public static final String GRUPO = "grupo";

	public List findByExample(HorariosSAC instance) {
		log.debug("finding HorariosSAC instance by example");
		try {
			List results = getSession().createCriteria("sac.model.HorariosSAC")
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
		log.debug("finding HorariosSAC instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HorariosSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDiaDeClase(Object diaDeClase) {
		return findByProperty(DIA_DE_CLASE, diaDeClase);
	}

	public List findByGrupo(Object grupo) {
		return findByProperty(GRUPO, grupo);
	}

	public List findAll() {
		log.debug("finding all HorariosSAC instances");
		try {
			String queryString = "from HorariosSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HorariosSAC merge(HorariosSAC detachedInstance) {
		log.debug("merging HorariosSAC instance");
		try {
			HorariosSAC result = (HorariosSAC) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HorariosSAC instance) {
		log.debug("attaching dirty HorariosSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HorariosSAC instance) {
		log.debug("attaching clean HorariosSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}