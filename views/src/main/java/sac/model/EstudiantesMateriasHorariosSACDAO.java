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
 * EstudiantesMateriasHorarios entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see sac.model.EstudiantesMateriasHorariosSAC
 * @author MyEclipse Persistence Tools
 */
@Entity public class EstudiantesMateriasHorariosSACDAO extends BaseHibernateDAOSAC {
	private static final Logger log = LoggerFactory
			.getLogger(EstudiantesMateriasHorariosSACDAO.class);
	// property constants
	public static final String HORA_FIN = "horaFin";
	public static final String HORA_INICIO = "horaInicio";
	public static final String ID_DIA_SEMANA = "idDiaSemana";
	public static final String ID_ESTUDIANTE = "idEstudiante";

	public void save(EstudiantesMateriasHorariosSAC transientInstance) {
		log.debug("saving EstudiantesMateriasHorariosSAC instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EstudiantesMateriasHorariosSAC persistentInstance) {
		log.debug("deleting EstudiantesMateriasHorariosSAC instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EstudiantesMateriasHorariosSAC findById(java.lang.String id) {
		log.debug("getting EstudiantesMateriasHorariosSAC instance with id: " + id);
		try {
			EstudiantesMateriasHorariosSAC instance = (EstudiantesMateriasHorariosSAC) getSession()
					.get("sac.model.EstudiantesMateriasHorariosSAC", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EstudiantesMateriasHorariosSAC instance) {
		log.debug("finding EstudiantesMateriasHorariosSAC instance by example");
		try {
			List results = getSession()
					.createCriteria("sac.model.EstudiantesMateriasHorariosSAC")
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
		log.debug("finding EstudiantesMateriasHorariosSAC instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from EstudiantesMateriasHorariosSAC as model where model."
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
		log.debug("finding all EstudiantesMateriasHorariosSAC instances");
		try {
			String queryString = "from EstudiantesMateriasHorariosSAC";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EstudiantesMateriasHorariosSAC merge(
			EstudiantesMateriasHorariosSAC detachedInstance) {
		log.debug("merging EstudiantesMateriasHorariosSAC instance");
		try {
			EstudiantesMateriasHorariosSAC result = (EstudiantesMateriasHorariosSAC) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EstudiantesMateriasHorariosSAC instance) {
		log.debug("attaching dirty EstudiantesMateriasHorariosSAC instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EstudiantesMateriasHorariosSAC instance) {
		log.debug("attaching clean EstudiantesMateriasHorariosSAC instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}