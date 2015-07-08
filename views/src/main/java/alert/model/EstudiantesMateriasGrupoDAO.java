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
 * EstudiantesMateriasGrupo entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see alert.model.EstudiantesMateriasGrupo
 * @author MyEclipse Persistence Tools
 */
public class EstudiantesMateriasGrupoDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(EstudiantesMateriasGrupoDAO.class);
	// property constants
	public static final String ID_ESTUDIANTE = "idEstudiante";
	public static final String ID_GRUPO = "idGrupo";

	public void save(EstudiantesMateriasGrupo transientInstance) {
		log.debug("saving EstudiantesMateriasGrupo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EstudiantesMateriasGrupo persistentInstance) {
		log.debug("deleting EstudiantesMateriasGrupo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EstudiantesMateriasGrupo findById(java.lang.String id) {
		log.debug("getting EstudiantesMateriasGrupo instance with id: " + id);
		try {
			EstudiantesMateriasGrupo instance = (EstudiantesMateriasGrupo) getSession()
					.get("alert.model.EstudiantesMateriasGrupo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<EstudiantesMateriasGrupo> findByExample(
			EstudiantesMateriasGrupo instance) {
		log.debug("finding EstudiantesMateriasGrupo instance by example");
		try {
			List<EstudiantesMateriasGrupo> results = (List<EstudiantesMateriasGrupo>) getSession()
					.createCriteria("alert.model.EstudiantesMateriasGrupo")
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
		log.debug("finding EstudiantesMateriasGrupo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from EstudiantesMateriasGrupo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<EstudiantesMateriasGrupo> findByIdEstudiante(Object idEstudiante) {
		return findByProperty(ID_ESTUDIANTE, idEstudiante);
	}

	public List<EstudiantesMateriasGrupo> findByIdGrupo(Object idGrupo) {
		return findByProperty(ID_GRUPO, idGrupo);
	}

	public List findAll() {
		log.debug("finding all EstudiantesMateriasGrupo instances");
		try {
			String queryString = "from EstudiantesMateriasGrupo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EstudiantesMateriasGrupo merge(
			EstudiantesMateriasGrupo detachedInstance) {
		log.debug("merging EstudiantesMateriasGrupo instance");
		try {
			EstudiantesMateriasGrupo result = (EstudiantesMateriasGrupo) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EstudiantesMateriasGrupo instance) {
		log.debug("attaching dirty EstudiantesMateriasGrupo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EstudiantesMateriasGrupo instance) {
		log.debug("attaching clean EstudiantesMateriasGrupo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}