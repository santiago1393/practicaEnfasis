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

import co.com.udem.practica.business.MaquinaService;
import co.com.udem.practica.domain.Maquina;

@Controller
@RequestMapping("/maquinas")
public class MaquinasController {

	@Autowired
	public MaquinaService maquinaService;
	
	@RequestMapping("/list")
	public @ResponseBody List<Maquina> MaquinaList(){
		
		List<Maquina> maquinas = maquinaService.metodoList();
		return maquinas;
	}
	
	@RequestMapping("/create")
	public @ResponseBody String MaquinaCreate(@RequestParam(value = "nombre", required = false, defaultValue = "HOMECENTER") String nombre,@RequestParam(value = "descripcion", required = false, defaultValue = "HOMECENTER") String descripcion, @RequestParam(value = "precio", required = false, defaultValue = "0") double precio, @RequestParam(value = "descuento", required = false, defaultValue = "0") double descuento,@RequestParam(value = "disponibilidad", required = false, defaultValue = "true") boolean disponibilidad){
		return  maquinaService.metodoCreate(new Maquina(nombre,descripcion,disponibilidad,precio,descuento,""));
	
	}
	
	@RequestMapping("/delete")
	public @ResponseBody String MaquinaDelete(@RequestParam(value = "id", required = false, defaultValue = "0") Long id){
		return  maquinaService.metodoDelete(id);
	
	}
	
	@RequestMapping("/read")
	public @ResponseBody Maquina MaquinaRead(@RequestParam(value = "id", required = false, defaultValue = "0") Long id){
		return maquinaService.metodoRead(id);	
	}
	
	@RequestMapping("/update")
	public @ResponseBody String MaquinaUpdate(@RequestParam(value = "id", required = false, defaultValue = "0") Long id, @RequestParam(value = "nombre", required = false, defaultValue = "HOMECENTER") String nombre,@RequestParam(value = "descripcion", required = false, defaultValue = "HOMECENTER") String descripcion, @RequestParam(value = "precio", required = false, defaultValue = "0") double precio, @RequestParam(value = "descuento", required = false, defaultValue = "0") double descuento,@RequestParam(value = "disponibilidad", required = false, defaultValue = "true") boolean disponibilidad){
		Maquina maquina = new Maquina(nombre,descripcion,disponibilidad,precio,descuento,"");
		maquina.setId(id);
		String respuesta = maquinaService.metodoUpdate(maquina);
		return respuesta;
	}

	
	// ESTE METODO MAPEA LA VISTA GENERAL DE LAS MAQUINAS
	@RequestMapping("/maquinas")
	public ModelAndView getMaquinasList()
	{
		ModelAndView mv = new ModelAndView();
		List<Maquina> listaMaquinas = MaquinaList();	
		for (Maquina maquina : listaMaquinas) {
			maquina.setNombre(maquina.getNombre().toUpperCase());
			maquina.setDescripcion(maquina.getDescripcion());		
		}
		mv.addObject("name","Lista de Maquinas");
		mv.addObject("lista",listaMaquinas);
		
		return mv;
	}

	// ESTE METODO MAPEA LA VISTA DETALLE DE UNA MAQUINA
	@RequestMapping("/detalle")
	public ModelAndView getMaquinaDetalle(@RequestParam(value = "id", required = false, defaultValue = "1") Long id)
	{
		ModelAndView mv = new ModelAndView();
		Maquina maquina = MaquinaRead(id);
		
		mv.addObject("name","Detalle de Maquinas");
		mv.addObject("maquina",maquina);
		
		return mv;
	}
}
