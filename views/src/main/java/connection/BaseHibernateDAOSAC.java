package connection;

import javax.persistence.Entity;
import org.hibernate.Session;

/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
@Entity public class BaseHibernateDAOSAC implements IBaseHibernateDAOSAC {
	
	public Session getSession() {
		return HibernateSessionFactorySAC.getSession();
	}
	
}