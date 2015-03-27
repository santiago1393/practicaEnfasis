package co.com.udem.practica.business;

import java.util.List;

import co.com.udem.practica.domain.Maquina;

public interface MaquinaService {
	
	public String metodoCreate( Maquina maquina);
	public Maquina metodoRead(Long id);
	public String metodoUpdate(Maquina maquina);
	public String metodoDelete(Long id);
	public List<Maquina> metodoList();

}
