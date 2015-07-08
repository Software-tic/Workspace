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
 * DocenteMateriaGrupo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see alert.model.DocenteMateriaGrupo
 * @author MyEclipse Persistence Tools
 */
public class DocenteMateriaGrupoDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(DocenteMateriaGrupoDAO.class);
	// property constants
	public static final String ID_GRUPO = "idGrupo";
	public static final String ID_MATERIA = "idMateria";

	public void save(DocenteMateriaGrupo transientInstance) {
		log.debug("saving DocenteMateriaGrupo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DocenteMateriaGrupo persistentInstance) {
		log.debug("deleting DocenteMateriaGrupo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DocenteMateriaGrupo findById(java.lang.Long id) {
		log.debug("getting DocenteMateriaGrupo instance with id: " + id);
		try {
			DocenteMateriaGrupo instance = (DocenteMateriaGrupo) getSession()
					.get("alert.model.DocenteMateriaGrupo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<DocenteMateriaGrupo> findByExample(DocenteMateriaGrupo instance) {
		log.debug("finding DocenteMateriaGrupo instance by example");
		try {
			List<DocenteMateriaGrupo> results = (List<DocenteMateriaGrupo>) getSession()
					.createCriteria("alert.model.DocenteMateriaGrupo")
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
		log.debug("finding DocenteMateriaGrupo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DocenteMateriaGrupo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<DocenteMateriaGrupo> findByIdGrupo(Object idGrupo) {
		return findByProperty(ID_GRUPO, idGrupo);
	}

	public List<DocenteMateriaGrupo> findByIdMateria(Object idMateria) {
		return findByProperty(ID_MATERIA, idMateria);
	}

	public List findAll() {
		log.debug("finding all DocenteMateriaGrupo instances");
		try {
			String queryString = "from DocenteMateriaGrupo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DocenteMateriaGrupo merge(DocenteMateriaGrupo detachedInstance) {
		log.debug("merging DocenteMateriaGrupo instance");
		try {
			DocenteMateriaGrupo result = (DocenteMateriaGrupo) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DocenteMateriaGrupo instance) {
		log.debug("attaching dirty DocenteMateriaGrupo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DocenteMateriaGrupo instance) {
		log.debug("attaching clean DocenteMateriaGrupo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}