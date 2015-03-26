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
		boolean retorno = false;
		try {
			Session session = sessionFactory.getCurrentSession();		
			session.save(maquina);
			session.flush();
			retorno = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return retorno;
	}

	public Maquina metodoRead(Long id) {
		Maquina maquina = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			maquina = (Maquina) session.get(Maquina.class, id);
		} catch (Exception e) {
			e.getMessage();
		}
		return maquina;
	}

	public boolean metodoUpdate(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return false;
	}

	public boolean metodoDelete(Long id) {
		boolean retorno = false;
		try {
			Session session = sessionFactory.getCurrentSession();
			Maquina maquina = (Maquina) session.get(Maquina.class, id);
			session.delete(maquina);
			session.flush();
			retorno = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return retorno;
	}

	@SuppressWarnings("unchecked")
	public List<Maquina> metodoList() {
		List<Maquina> listMaquinas = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("FROM Maquina");
			
			
			listMaquinas = (List<Maquina>) query.list();		
			System.out.println(listMaquinas.get(0).getNombre());
		} catch (Exception e) {
			e.getMessage();
		}	
		return listMaquinas;
	}

}
