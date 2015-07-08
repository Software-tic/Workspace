package alert.model;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOAlert;

/**
 * A data access object (DAO) providing persistence and search support for Grupo
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see alert.model.Grupo
 * @author MyEclipse Persistence Tools
 */
public class GrupoDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory.getLogger(GrupoDAO.class);
	// property constants
	public static final String AULA = "aula";
	public static final String NOMBRE_GRUPO = "nombreGrupo";

	public void save(Grupo transientInstance) {
		log.debug("saving Grupo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Grupo persistentInstance) {
		log.debug("deleting Grupo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Grupo findById(java.lang.Long id) {
		log.debug("getting Grupo instance with id: " + id);
		try {
			Grupo instance = (Grupo) getSession().get("alert.model.Grupo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Grupo> findByExample(Grupo instance) {
		log.debug("finding Grupo instance by example");
		try {
			List<Grupo> results = (List<Grupo>) getSession()
					.createCriteria("alert.model.Grupo").add(create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Grupo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Grupo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Grupo> findByAula(Object aula) {
		return findByProperty(AULA, aula);
	}

	public List<Grupo> findByNombreGrupo(Object nombreGrupo) {
		return findByProperty(NOMBRE_GRUPO, nombreGrupo);
	}

	public List findAll() {
		log.debug("finding all Grupo instances");
		try {
			String queryString = "from Grupo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Grupo merge(Grupo detachedInstance) {
		log.debug("merging Grupo instance");
		try {
			Grupo result = (Grupo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Grupo instance) {
		log.debug("attaching dirty Grupo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Grupo instance) {
		log.debug("attaching clean Grupo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}