package co.com.udem.practica.DAO.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import co.com.udem.practica.DAO.MaquinaDAO;
import co.com.udem.practica.domain.Maquina;

@Repository
public class MaquinaDAOImpl implements MaquinaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	


	public boolean metodoCreate( Maquina maquina) {
		Session session = sessionFactory.getCurrentSession();		
		session.save(maquina);
		session.flush();
		return true;
	}

	public Maquina metodoRead(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Maquina maquina = (Maquina) session.get(Maquina.class, id);
		if(maquina != null)
		{
			return maquina;
		}
		else
		{
			return null;
		}
	}

	public boolean metodoUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean metodoDelete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Maquina maquina = (Maquina) session.get(Maquina.class, id);
		if(maquina != null)
		{
			session.delete(maquina);
			session.flush();		
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	public List<Maquina> metodoList() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Maquina");
		
		@SuppressWarnings("unchecked")
		List<Maquina> listMaquinas = (List<Maquina>) query.list();		
		System.out.println(listMaquinas.get(0).getNombre());		
		return listMaquinas;
	
	}

}
