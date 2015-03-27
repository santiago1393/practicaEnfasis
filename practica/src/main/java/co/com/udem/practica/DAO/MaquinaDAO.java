package co.com.udem.practica.DAO;

import java.util.List;

import co.com.udem.practica.DTO.EstadoRespuesta;
import co.com.udem.practica.domain.Maquina;


public interface MaquinaDAO {
	
	public EstadoRespuesta metodoCreate( Maquina maquina);
	public Maquina metodoRead(Long id);
	public EstadoRespuesta metodoUpdate(Maquina maquina);
	public EstadoRespuesta metodoDelete(Long id);
	public List<Maquina> metodoList();

}
