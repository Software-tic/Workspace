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
 * MateriasGrupo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sac.model.MateriasGrupoSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class MateriasGrupoSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(MateriasGrupoSACDAO.class);
	// property constants
	public static final String ID_GRUPO = "idGrupo";

	public List findByExample(MateriasGrupoSAC instance) {
		log.debug("finding MateriasGrupoSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.MateriasGrupoSAC")
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
		log.debug("finding MateriasGrupoSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MateriasGrupoSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdGrupo(Object idGrupo) {
		return findByProperty(ID_GRUPO, idGrupo);
	}

	public List findAll() {
		log.debug("finding all MateriasGrupoSAC instances");
		try {
			String queryString = "from MateriasGrupoSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MateriasGrupoSAC merge(MateriasGrupoSAC detachedInstance) {
		log.debug("merging MateriasGrupoSAC instance");
		try {
			MateriasGrupoSAC result = (MateriasGrupoSAC) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MateriasGrupoSAC instance) {
		log.debug("attaching dirty MateriasGrupoSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MateriasGrupoSAC instance) {
		log.debug("attaching clean MateriasGrupoSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}