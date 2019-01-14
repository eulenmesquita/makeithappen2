package com.euclidesMakeithappen.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

	@RequestMapping("/cadastrarEvento")
	public String formulario(){
		
		return "evento/formEvento";
	}
}
