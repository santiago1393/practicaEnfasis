package co.com.udem.practica.business.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udem.practica.DAO.MaquinaDAO;
import co.com.udem.practica.business.MaquinaService;
import co.com.udem.practica.domain.Maquina;


@Service
public class MaquinaServiceImpl implements MaquinaService {

	@Autowired
	private MaquinaDAO maquinaDAO;
	
	@Transactional
	public boolean metodoCreate( Maquina maquina) {
		return maquinaDAO.metodoCreate(maquina);
		
	}

	@Transactional
	public Maquina metodoRead(Long id) {
		Maquina maquina = maquinaDAO.metodoRead(id);
		return maquina;
	}

	@Transactional
	public boolean metodoUpdate(Maquina maquina) {		
		return maquinaDAO.metodoUpdate(maquina);
	}
	
	@Transactional
	public boolean metodoDelete(Long id) {
		return maquinaDAO.metodoDelete(id);
		
	}

	@Transactional
	public List<Maquina> metodoList() {
		List<Maquina> maquinas = maquinaDAO.metodoList();
		return maquinas;
	}

}
