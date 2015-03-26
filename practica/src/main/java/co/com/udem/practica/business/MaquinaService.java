package co.com.udem.practica.business;

import java.util.List;

import co.com.udem.practica.domain.Maquina;

public interface MaquinaService {
	
	public boolean metodoCreate();
	public Maquina metodoRead(Long id);
	public boolean metodoUpdate();
	public boolean metodoDelete();
	public List<Maquina> metodoList();

}
