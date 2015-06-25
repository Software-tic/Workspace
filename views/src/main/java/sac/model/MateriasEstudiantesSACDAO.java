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
 * MateriasEstudiantes entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sac.model.MateriasEstudiantesSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class MateriasEstudiantesSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(MateriasEstudiantesSACDAO.class);
	// property constants
	public static final String ID_ESTUDIANTE = "idEstudiante";

	public void save(MateriasEstudiantesSAC transientInstance) {
		log.debug("saving MateriasEstudiantesSAC instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MateriasEstudiantesSAC persistentInstance) {
		log.debug("deleting MateriasEstudiantesSAC instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MateriasEstudiantesSAC findById(java.lang.String id) {
		log.debug("getting MateriasEstudiantesSAC instance with id: " + id);
		try {
			MateriasEstudiantesSAC instance = (MateriasEstudiantesSAC) getSession()
					.get("sac.model.MateriasEstudiantesSAC", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MateriasEstudiantesSAC instance) {
		log.debug("finding MateriasEstudiantesSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.MateriasEstudiantesSAC")
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
		log.debug("finding MateriasEstudiantesSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MateriasEstudiantesSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIdEstudiante(Object idEstudiante) {
		return findByProperty(ID_ESTUDIANTE, idEstudiante);
	}

	public List findAll() {
		log.debug("finding all MateriasEstudiantesSAC instances");
		try {
			String queryString = "from MateriasEstudiantesSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MateriasEstudiantesSAC merge(MateriasEstudiantesSAC detachedInstance) {
		log.debug("merging MateriasEstudiantesSAC instance");
		try {
			MateriasEstudiantesSAC result = (MateriasEstudiantesSAC) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MateriasEstudiantesSAC instance) {
		log.debug("attaching dirty MateriasEstudiantesSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MateriasEstudiantesSAC instance) {
		log.debug("attaching clean MateriasEstudiantesSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}