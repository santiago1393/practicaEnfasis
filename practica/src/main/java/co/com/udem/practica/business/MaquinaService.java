package co.com.udem.practica.business;

import java.util.List;

import co.com.udem.practica.DTO.EstadoRespuesta;
import co.com.udem.practica.domain.Maquina;

public interface MaquinaService {
	
	public EstadoRespuesta metodoCreate( Maquina maquina);
	public EstadoRespuesta metodoRead(Long id);
	public EstadoRespuesta metodoUpdate(Maquina maquina);
	public EstadoRespuesta metodoDelete(Long id);
	public EstadoRespuesta metodoList();
	public EstadoRespuesta metodoListBusqueda(String busqueda);

}
