package co.com.udem.practica.business.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.com.udem.practica.DAO.MaquinaDAO;
import co.com.udem.practica.business.MaquinaService;
import co.com.udem.practica.domain.Maquina;


@Service
public class MaquinaServiceImpl implements MaquinaService {

	private MaquinaDAO maquinaDAO;
	
	
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

	@Transactional
	public List<Maquina> metodoList() {
	List<Maquina> maquinas = maquinaDAO.metodoList();
		
		for (Maquina maquina : maquinas) {
			maquina.setNombre(maquina.getNombre() + "2");
		}
		
		return maquinas;
	}

}
