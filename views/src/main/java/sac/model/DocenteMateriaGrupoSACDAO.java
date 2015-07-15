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
 * DocenteMateriaGrupo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sac.model.DocenteMateriaGrupoSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class DocenteMateriaGrupoSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(DocenteMateriaGrupoSACDAO.class);
	// property constants
	public static final String ID_GRUPO = "idGrupo";
	public static final String ID_MATERIA = "idMateria";

	public List findByExample(DocenteMateriaGrupoSAC instance) {
		log.debug("finding DocenteMateriaGrupoSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.DocenteMateriaGrupoSAC")
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
		log.debug("finding DocenteMateriaGrupoSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DocenteMateriaGrupoSAC as model where model."
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

	public List findByIdMateria(Object idMateria) {
		return findByProperty(ID_MATERIA, idMateria);
	}

	public List findAll() {
		log.debug("finding all DocenteMateriaGrupoSAC instances");
		try {
			String queryString = "from DocenteMateriaGrupoSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DocenteMateriaGrupoSAC merge(DocenteMateriaGrupoSAC detachedInstance) {
		log.debug("merging DocenteMateriaGrupoSAC instance");
		try {
			DocenteMateriaGrupoSAC result = (DocenteMateriaGrupoSAC) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DocenteMateriaGrupoSAC instance) {
		log.debug("attaching dirty DocenteMateriaGrupoSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DocenteMateriaGrupoSAC instance) {
		log.debug("attaching clean DocenteMateriaGrupoSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}