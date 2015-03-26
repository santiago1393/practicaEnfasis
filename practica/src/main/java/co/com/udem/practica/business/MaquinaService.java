package co.com.udem.practica.business;

import java.util.List;

import co.com.udem.practica.domain.Maquina;

public interface MaquinaService {
	
	public boolean metodoCreate( Maquina maquina);
	public Maquina metodoRead(Long id);
	public boolean metodoUpdate(Long id);
	public boolean metodoDelete(Long id);
	public List<Maquina> metodoList();

}
