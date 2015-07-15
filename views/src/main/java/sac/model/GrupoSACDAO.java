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
 * A data access object (DAO) providing persistence and search support for Grupo
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see sac.model.GrupoSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class GrupoSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory.getLogger(GrupoSACDAO.class);
	// property constants
	public static final String AULA = "aula";
	public static final String NOMBRE_GRUPO = "nombreGrupo";

	public List findByExample(GrupoSAC instance) {
		log.debug("finding GrupoSAC instance by example");
		try {
			List results = getSession().createCriteria("sac.model.GrupoSAC")
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
		log.debug("finding GrupoSAC instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrupoSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAula(Object aula) {
		return findByProperty(AULA, aula);
	}

	public List findByNombreGrupo(Object nombreGrupo) {
		return findByProperty(NOMBRE_GRUPO, nombreGrupo);
	}

	public List findAll() {
		log.debug("finding all GrupoSAC instances");
		try {
			String queryString = "from GrupoSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrupoSAC merge(GrupoSAC detachedInstance) {
		log.debug("merging GrupoSAC instance");
		try {
			GrupoSAC result = (GrupoSAC) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrupoSAC instance) {
		log.debug("attaching dirty GrupoSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrupoSAC instance) {
		log.debug("attaching clean GrupoSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}