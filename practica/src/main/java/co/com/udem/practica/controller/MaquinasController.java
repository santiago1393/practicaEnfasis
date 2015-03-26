package co.com.udem.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.practica.business.MaquinaService;
import co.com.udem.practica.domain.Maquina;

@Controller
@RequestMapping("/maquinas")
public class MaquinasController {

	@Autowired
	public MaquinaService maquinaService;
	
	@RequestMapping("/list")
	public ModelAndView MoviesList(@RequestParam(value = "name", required = false, defaultValue = "HOMECENTER") String name){
		
		List<Maquina> maquinas = maquinaService.metodoList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("maquinas", maquinas);
		mv.addObject("name", name);
		return mv;
	}
}
