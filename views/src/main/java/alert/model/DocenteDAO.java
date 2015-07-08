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
 * Docente entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see alert.model.Docente
 * @author MyEclipse Persistence Tools
 */
public class DocenteDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory.getLogger(DocenteDAO.class);
	// property constants
	public static final String APELLIDOS = "apellidos";
	public static final String CELULAR = "celular";
	public static final String CODIGO = "codigo";
	public static final String CORREO = "correo";
	public static final String CORREO_ALTERNATIVO = "correoAlternativo";
	public static final String DIRECCION = "direccion";
	public static final String DOCUMENTO = "documento";
	public static final String NOMBRES = "nombres";
	public static final String TELEFONO = "telefono";

	public void save(Docente transientInstance) {
		log.debug("saving Docente instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Docente persistentInstance) {
		log.debug("deleting Docente instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Docente findById(java.lang.Long id) {
		log.debug("getting Docente instance with id: " + id);
		try {
			Docente instance = (Docente) getSession().get(
					"alert.model.Docente", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Docente> findByExample(Docente instance) {
		log.debug("finding Docente instance by example");
		try {
			List<Docente> results = (List<Docente>) getSession()
					.createCriteria("alert.model.Docente")
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
		log.debug("finding Docente instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Docente as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Docente> findByApellidos(Object apellidos) {
		return findByProperty(APELLIDOS, apellidos);
	}

	public List<Docente> findByCelular(Object celular) {
		return findByProperty(CELULAR, celular);
	}

	public List<Docente> findByCodigo(Object codigo) {
		return findByProperty(CODIGO, codigo);
	}

	public List<Docente> findByCorreo(Object correo) {
		return findByProperty(CORREO, correo);
	}

	public List<Docente> findByCorreoAlternativo(Object correoAlternativo) {
		return findByProperty(CORREO_ALTERNATIVO, correoAlternativo);
	}

	public List<Docente> findByDireccion(Object direccion) {
		return findByProperty(DIRECCION, direccion);
	}

	public List<Docente> findByDocumento(Object documento) {
		return findByProperty(DOCUMENTO, documento);
	}

	public List<Docente> findByNombres(Object nombres) {
		return findByProperty(NOMBRES, nombres);
	}

	public List<Docente> findByTelefono(Object telefono) {
		return findByProperty(TELEFONO, telefono);
	}

	public List findAll() {
		log.debug("finding all Docente instances");
		try {
			String queryString = "from Docente";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Docente merge(Docente detachedInstance) {
		log.debug("merging Docente instance");
		try {
			Docente result = (Docente) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Docente instance) {
		log.debug("attaching dirty Docente instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Docente instance) {
		log.debug("attaching clean Docente instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}