package co.com.udem.practica.DAO.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import co.com.udem.practica.DAO.MaquinaDAO;
import co.com.udem.practica.domain.Maquina;

@Repository
public class MaquinaDAOImpl implements MaquinaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	


	public boolean metodoCreate() {
		// TODO Auto-generated method stub
		return false;
	}

	public Maquina metodoRead(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean metodoUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean metodoDelete() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Maquina> metodoList() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Moviee");
		
		@SuppressWarnings("unchecked")
		List<Maquina> listMovies = (List<Maquina>) query.list();
		
		System.out.println(listMovies.get(0).getNombre());
		
		
		return listMovies;
	
	}

}
