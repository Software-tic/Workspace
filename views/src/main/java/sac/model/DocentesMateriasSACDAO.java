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
 * DocentesMaterias entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sac.model.DocentesMateriasSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class DocentesMateriasSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(DocentesMateriasSACDAO.class);
	// property constants
	public static final String ID_MATERIA = "idMateria";

	public List findByExample(DocentesMateriasSAC instance) {
		log.debug("finding DocentesMateriasSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.DocentesMateriasSAC")
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
		log.debug("finding DocentesMateriasSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DocentesMateriasSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdMateria(Object idMateria) {
		return findByProperty(ID_MATERIA, idMateria);
	}

	public List findAll() {
		log.debug("finding all DocentesMateriasSAC instances");
		try {
			String queryString = "from DocentesMateriasSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DocentesMateriasSAC merge(DocentesMateriasSAC detachedInstance) {
		log.debug("merging DocentesMateriasSAC instance");
		try {
			DocentesMateriasSAC result = (DocentesMateriasSAC) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DocentesMateriasSAC instance) {
		log.debug("attaching dirty DocentesMateriasSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DocentesMateriasSAC instance) {
		log.debug("attaching clean DocentesMateriasSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}