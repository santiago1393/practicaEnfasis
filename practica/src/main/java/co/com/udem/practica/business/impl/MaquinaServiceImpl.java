package co.com.udem.practica.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udem.practica.DAO.MaquinaDAO;
import co.com.udem.practica.DTO.EstadoRespuesta;
import co.com.udem.practica.DTO.MaquinaDTO;
import co.com.udem.practica.business.MaquinaService;
import co.com.udem.practica.domain.Maquina;


@Service
public class MaquinaServiceImpl implements MaquinaService {

	@Autowired
	private MaquinaDAO maquinaDAO;
	private EstadoRespuesta respuesta = new EstadoRespuesta();
	
	@Transactional
	public EstadoRespuesta metodoCreate( Maquina maquina) {		
		try {
			maquinaDAO.metodoCreate(maquina);	
			respuesta.setStatus("success");
			respuesta.setResponse(null);
		} catch (Exception e) {
			e.getMessage();
			respuesta.setStatus("error");
			respuesta.setResponse(null);
		}
		return respuesta;
	}

	@Transactional
	public EstadoRespuesta metodoRead(Long id) {
		try {
			Maquina maquina = maquinaDAO.metodoRead(id);
			MaquinaDTO maquinaDTO = new MaquinaDTO();
			maquinaDTO.setId(maquina.getId());
			maquinaDTO.setDescripcion(maquina.getDescripcion());
			maquinaDTO.setDescuento(maquina.getDescuento());
			maquinaDTO.setDisponibilidad(maquina.isDisponibilidad());
			maquinaDTO.setImagen(maquina.getImagen());
			maquinaDTO.setNombre(maquina.getNombre());
			maquinaDTO.setPrecio(maquina.getPrecio());
			maquinaDTO.setPrecioDescuento(maquina.getPrecioDescuento());
			ArrayList<MaquinaDTO> lista = new ArrayList<MaquinaDTO>();
			lista.add(maquinaDTO);
			respuesta.setResponse(lista);
			respuesta.setStatus("success");
			
		} catch (Exception e) {
			e.getMessage();
			respuesta.setResponse(null);
			respuesta.setStatus("error");
		}
		return respuesta;
	}

	@Transactional
	public EstadoRespuesta metodoUpdate(Maquina maquina) {		
		try {
			maquinaDAO.metodoUpdate(maquina);
			respuesta.setStatus("success");
			respuesta.setResponse(null);
		} catch (Exception e) {
			e.getMessage();
			respuesta.setStatus("error");
			respuesta.setResponse(null);
		} 
		return respuesta;
	}
	
	@Transactional
	public EstadoRespuesta metodoDelete(Long id) {
		try {
			maquinaDAO.metodoDelete(id);
			respuesta.setStatus("success");
			respuesta.setResponse(null);
		} catch (Exception e) {
			e.getMessage();
			respuesta.setStatus("error");
			respuesta.setResponse(null);
		} 
		return respuesta;
		
	}

	@Transactional
	public EstadoRespuesta metodoList() {
		List<MaquinaDTO> maquinasDTO = new ArrayList<MaquinaDTO>();	
		List<Maquina> maquinas = maquinaDAO.metodoList();
		
		try {
		
		
		for (Maquina maquina : maquinas) {
			Long id = maquina.getId();
			String descripcion = maquina.getDescripcion();
			double descuento = maquina.getDescuento();
			String imagen = maquina.getImagen();
			boolean disponibilidad = maquina.isDisponibilidad();
			String nombre = maquina.getNombre();
			double precio = maquina.getPrecio();
			double precioDescuento = maquina.getPrecioDescuento();
			maquinasDTO.add(new MaquinaDTO(id,nombre,descripcion, disponibilidad,precio,descuento,imagen,precioDescuento));
		}
			respuesta.setStatus("success");
			respuesta.setResponse(maquinasDTO);
		
		} catch (Exception e) {

			respuesta.setStatus("error");
			respuesta.setResponse(null);
		}
		return respuesta;
		
	}
	
	@Transactional
	public EstadoRespuesta metodoListBusqueda(String busqueda) {
		List<MaquinaDTO> maquinasDTO = new ArrayList<MaquinaDTO>();	
		List<Maquina> maquinas = maquinaDAO.metodoListBusqueda(busqueda);
		
		try {
		
		
		for (Maquina maquina : maquinas) {
			Long id = maquina.getId();
			String descripcion = maquina.getDescripcion();
			double descuento = maquina.getDescuento();
			String imagen = maquina.getImagen();
			boolean disponibilidad = maquina.isDisponibilidad();
			String nombre = maquina.getNombre();
			double precio = maquina.getPrecio();
			double precioDescuento = maquina.getPrecioDescuento();
			maquinasDTO.add(new MaquinaDTO(id,nombre,descripcion, disponibilidad,precio,descuento,imagen,precioDescuento));
		}
			respuesta.setStatus("success");
			respuesta.setResponse(maquinasDTO);
		
		} catch (Exception e) {

			respuesta.setStatus("error");
			respuesta.setResponse(null);
		}
		return respuesta;
		
	}


}
