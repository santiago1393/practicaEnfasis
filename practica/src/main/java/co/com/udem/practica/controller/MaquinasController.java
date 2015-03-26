package co.com.udem.practica.controller;

import java.util.List;

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
	public @ResponseBody List<Maquina> MaquinaList(@RequestParam(value = "name", required = false, defaultValue = "HOMECENTER") String name){
		
		List<Maquina> maquinas = maquinaService.metodoList();
		return maquinas;
	}
	
	@RequestMapping("/create")
	public @ResponseBody boolean MaquinaCreate(@RequestParam(value = "nombre", required = false, defaultValue = "HOMECENTER") String nombre,@RequestParam(value = "descripcion", required = false, defaultValue = "HOMECENTER") String descripcion, @RequestParam(value = "precio", required = false, defaultValue = "0") double precio, @RequestParam(value = "descuento", required = false, defaultValue = "0") double descuento,@RequestParam(value = "disponibilidad", required = false, defaultValue = "true") boolean disponibilidad){
		return  maquinaService.metodoCreate(new Maquina(nombre,descripcion,disponibilidad,precio,descuento,""));
	
	}
	
	@RequestMapping("/delete")
	public @ResponseBody boolean MaquinaDelete(@RequestParam(value = "id", required = false, defaultValue = "0") Long id){
		return  maquinaService.metodoDelete(id);
	
	}
	
	@RequestMapping("/read")
	public @ResponseBody Maquina MaquinaRead(@RequestParam(value = "id", required = false, defaultValue = "0") Long id){
		return  maquinaService.metodoRead(id);
	
	}
}
