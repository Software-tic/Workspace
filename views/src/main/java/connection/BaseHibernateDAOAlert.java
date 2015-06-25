package connection;

import javax.persistence.Entity;
import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
@Entity public class BaseHibernateDAOAlert implements IBaseHibernateDAOAlert {
	
	public Session getSession() {
		return HibernateSessionFactoryAlert.getSession();
	}
	
}