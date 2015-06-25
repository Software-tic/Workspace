package alert.model;

import java.util.List;

import javax.persistence.Entity;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.BaseHibernateDAOAlert;

/**
 * A data access object (DAO) providing persistence and search support for
 * EstudiantesMateriasHorarios entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see alert.model.EstudiantesMateriasHorarios
 * @author MyEclipse Persistence Tools
 */
@Entity public class EstudiantesMateriasHorariosDAO extends BaseHibernateDAOAlert {
	private static final Logger log = LoggerFactory
			.getLogger(EstudiantesMateriasHorariosDAO.class);
	// property constants
	public static final String HORA_FIN = "horaFin";
	public static final String HORA_INICIO = "horaInicio";
	public static final String ID_DIA_SEMANA = "idDiaSemana";
	public static final String ID_ESTUDIANTE = "idEstudiante";

	public void save(EstudiantesMateriasHorarios transientInstance) {
		log.debug("saving EstudiantesMateriasHorarios instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EstudiantesMateriasHorarios persistentInstance) {
		log.debug("deleting EstudiantesMateriasHorarios instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EstudiantesMateriasHorarios findById(java.lang.String id) {
		log.debug("getting EstudiantesMateriasHorarios instance with id: " + id);
		try {
			EstudiantesMateriasHorarios instance = (EstudiantesMateriasHorarios) getSession()
					.get("alert.model.EstudiantesMateriasHorarios", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EstudiantesMateriasHorarios instance) {
		log.debug("finding EstudiantesMateriasHorarios instance by example");
		try {
			List results = getSession()
					.createCriteria("alert.model.EstudiantesMateriasHorarios")
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
		log.debug("finding EstudiantesMateriasHorarios instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from EstudiantesMateriasHorarios as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHoraFin(Object horaFin) {
		return findByProperty(HORA_FIN, horaFin);
	}

	public List findByHoraInicio(Object horaInicio) {
		return findByProperty(HORA_INICIO, horaInicio);
	}

	public List findByIdDiaSemana(Object idDiaSemana) {
		return findByProperty(ID_DIA_SEMANA, idDiaSemana);
	}

	public List findByIdEstudiante(Object idEstudiante) {
		return findByProperty(ID_ESTUDIANTE, idEstudiante);
	}

	public List findAll() {
		log.debug("finding all EstudiantesMateriasHorarios instances");
		try {
			String queryString = "from EstudiantesMateriasHorarios";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EstudiantesMateriasHorarios merge(
			EstudiantesMateriasHorarios detachedInstance) {
		log.debug("merging EstudiantesMateriasHorarios instance");
		try {
			EstudiantesMateriasHorarios result = (EstudiantesMateriasHorarios) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EstudiantesMateriasHorarios instance) {
		log.debug("attaching dirty EstudiantesMateriasHorarios instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EstudiantesMateriasHorarios instance) {
		log.debug("attaching clean EstudiantesMateriasHorarios instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}