package sac.model;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOSAC;

/**
 * A data access object (DAO) providing persistence and search support for
 * Materias entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sac.model.MateriasSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class MateriasSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(MateriasSACDAO.class);
	// property constants
	public static final String FECHA_FIN = "fechaFin";
	public static final String FECHA_INICIO = "fechaInicio";
	public static final String INT_HORARIA = "intHoraria";
	public static final String NOMBRE = "nombre";
	public static final String SEMESTRE = "semestre";

	public void save(MateriasSAC transientInstance) {
		log.debug("saving MateriasSAC instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MateriasSAC persistentInstance) {
		log.debug("deleting MateriasSAC instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MateriasSAC findById(java.lang.String id) {
		log.debug("getting MateriasSAC instance with id: " + id);
		try {
			MateriasSAC instance = (MateriasSAC) getSession().get(
					"sac.model.MateriasSAC", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MateriasSAC instance) {
		log.debug("finding MateriasSAC instance by example");
		try {
			List results = getSession().createCriteria("sac.model.MateriasSAC")
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
		log.debug("finding MateriasSAC instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MateriasSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFechaFin(Object fechaFin) {
		return findByProperty(FECHA_FIN, fechaFin);
	}

	public List findByFechaInicio(Object fechaInicio) {
		return findByProperty(FECHA_INICIO, fechaInicio);
	}

	public List findByIntHoraria(Object intHoraria) {
		return findByProperty(INT_HORARIA, intHoraria);
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findBySemestre(Object semestre) {
		return findByProperty(SEMESTRE, semestre);
	}

	public List findAll() {
		log.debug("finding all MateriasSAC instances");
		try {
			String queryString = "from MateriasSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MateriasSAC merge(MateriasSAC detachedInstance) {
		log.debug("merging MateriasSAC instance");
		try {
			MateriasSAC result = (MateriasSAC) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MateriasSAC instance) {
		log.debug("attaching dirty MateriasSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MateriasSAC instance) {
		log.debug("attaching clean MateriasSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}