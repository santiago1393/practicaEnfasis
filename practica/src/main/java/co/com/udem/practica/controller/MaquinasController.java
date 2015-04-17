package co.com.udem.practica.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.io.JsonStringEncoder;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.impl.JsonSerializerMap;
import org.codehaus.jackson.util.JsonParserDelegate;
import org.codehaus.jackson.util.JsonParserSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.practica.DTO.EstadoRespuesta;
import co.com.udem.practica.DTO.MaquinaDTO;
import co.com.udem.practica.business.MaquinaService;
import co.com.udem.practica.domain.Maquina;

@Controller
@RequestMapping("/maquinas")
public class MaquinasController {

	@Autowired
	public MaquinaService maquinaService;
	
	@RequestMapping("/list")
	public @ResponseBody EstadoRespuesta MaquinaList(){
		
		EstadoRespuesta respuesta = maquinaService.metodoList();
		return respuesta;
	}
	
	@RequestMapping("/create")
	public @ResponseBody EstadoRespuesta MaquinaCreate(@RequestParam(value = "nombre", required = false, defaultValue = "HOMECENTER") String nombre,@RequestParam(value = "descripcion", required = false, defaultValue = "HOMECENTER") String descripcion, @RequestParam(value = "precio", required = false, defaultValue = "0") double precio, @RequestParam(value = "descuento", required = false, defaultValue = "0") double descuento,@RequestParam(value = "disponibilidad", required = false, defaultValue = "true") boolean disponibilidad){
		return  maquinaService.metodoCreate(new Maquina(nombre,descripcion,disponibilidad,precio,descuento,""));
	
	}
	
	@RequestMapping("/delete")
	public @ResponseBody EstadoRespuesta MaquinaDelete(@RequestParam(value = "id", required = false, defaultValue = "0") Long id){
		return  maquinaService.metodoDelete(id);
	
	}
	
	@RequestMapping("/read")
	public @ResponseBody EstadoRespuesta MaquinaRead(@RequestParam(value = "id", required = false, defaultValue = "0") Long id){
		return maquinaService.metodoRead(id);	
	}
	
	@RequestMapping("/update")
	public @ResponseBody EstadoRespuesta MaquinaUpdate(@RequestParam(value = "id", required = false, defaultValue = "0") Long id, @RequestParam(value = "nombre", required = false, defaultValue = "HOMECENTER") String nombre,@RequestParam(value = "descripcion", required = false, defaultValue = "HOMECENTER") String descripcion, @RequestParam(value = "precio", required = false, defaultValue = "0") double precio, @RequestParam(value = "descuento", required = false, defaultValue = "0") double descuento,@RequestParam(value = "disponibilidad", required = false, defaultValue = "true") boolean disponibilidad){
		Maquina maquina = new Maquina(nombre,descripcion,disponibilidad,precio,descuento,"");
		maquina.setId(id);
		EstadoRespuesta respuesta = maquinaService.metodoUpdate(maquina);
		return respuesta;
	}

	
	// ESTE METODO MAPEA LA VISTA GENERAL DE LAS MAQUINAS
	@RequestMapping("/maquinas")
	public ModelAndView getMaquinasList()
	{
		ModelAndView mv = new ModelAndView();
		EstadoRespuesta respuesta = MaquinaList();		
		mv.addObject("name","Lista de Maquinas");
		mv.addObject("lista",respuesta.getResponse());
		
		return mv;
	}

	// ESTE METODO MAPEA LA VISTA DETALLE DE UNA MAQUINA
	@RequestMapping("/detalle")
	public ModelAndView getMaquinaDetalle(@RequestParam(value = "id", required = false, defaultValue = "1") Long id)
	{
		ModelAndView mv = new ModelAndView();
		EstadoRespuesta respuesta = MaquinaRead(id);
		
		mv.addObject("name","Detalle de Maquinas");
		mv.addObject("maquina",respuesta.getResponse());
		
		return mv;
	}
}
