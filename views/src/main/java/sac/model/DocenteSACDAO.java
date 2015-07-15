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
 * Docente entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sac.model.DocenteSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class DocenteSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory.getLogger(DocenteSACDAO.class);
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

	public List findByExample(DocenteSAC instance) {
		log.debug("finding Docente instance by example");
		try {
			List results = getSession().createCriteria("sac.model.Docente")
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
		log.debug("finding Docente instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DocenteSAC as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByApellidos(Object apellidos) {
		return findByProperty(APELLIDOS, apellidos);
	}

	public List findByCelular(Object celular) {
		return findByProperty(CELULAR, celular);
	}

	public List findByCodigo(Object codigo) {
		return findByProperty(CODIGO, codigo);
	}

	public List findByCorreo(Object correo) {
		return findByProperty(CORREO, correo);
	}

	public List findByCorreoAlternativo(Object correoAlternativo) {
		return findByProperty(CORREO_ALTERNATIVO, correoAlternativo);
	}

	public List findByDireccion(Object direccion) {
		return findByProperty(DIRECCION, direccion);
	}

	public List findByDocumento(Object documento) {
		return findByProperty(DOCUMENTO, documento);
	}

	public List findByNombres(Object nombres) {
		return findByProperty(NOMBRES, nombres);
	}

	public List findByTelefono(Object telefono) {
		return findByProperty(TELEFONO, telefono);
	}

	public List findAll() {
		log.debug("finding all Docente instances");
		try {
			String queryString = "from DocenteSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DocenteSAC merge(DocenteSAC detachedInstance) {
		log.debug("merging DocenteSAC instance");
		try {
			DocenteSAC result = (DocenteSAC) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DocenteSAC instance) {
		log.debug("attaching dirty DocenteSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DocenteSAC instance) {
		log.debug("attaching clean DocenteSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}