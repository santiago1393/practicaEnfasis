package co.com.udem.practica.DAO.impl;

import java.util.List;

import org.codehaus.jackson.map.util.JSONPObject;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;







import co.com.udem.practica.DAO.MaquinaDAO;
import co.com.udem.practica.DTO.EstadoRespuesta;
import co.com.udem.practica.domain.Maquina;

@Repository
public class MaquinaDAOImpl implements MaquinaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	


	public void metodoCreate( Maquina maquina) {		
		Session session = sessionFactory.getCurrentSession();		
		session.save(maquina);
		session.flush();			
	}

	public Maquina metodoRead(Long id) {
		Maquina maquina = null;
		Session session = sessionFactory.getCurrentSession();
		maquina = (Maquina) session.get(Maquina.class, id);		
		return maquina;
	}

	public void metodoUpdate(Maquina maquina) {
		Session session = sessionFactory.getCurrentSession();
		session.update(maquina);
		session.flush();			
	}

	public void metodoDelete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Maquina maquina = (Maquina) session.get(Maquina.class, id);
		session.delete(maquina);
		session.flush();		
	}

	@SuppressWarnings("unchecked")
	public List<Maquina> metodoList() {
		List<Maquina> listMaquinas = null;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Maquina");
		listMaquinas = (List<Maquina>) query.list();		
		return listMaquinas;
	}

}
