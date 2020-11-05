package mx.com.qtx.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.com.qtx.entidades.TematicaPersona;

@RestController
public class ApiController {
	@Autowired
	private IGestorTematicas gestorTematicas;
	
	@GetMapping(path = "/tematicas/{numPersona}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TematicaPersona> getTematicas(@PathVariable int numPersona){
		return this.gestorTematicas.getTematicasXpersona(numPersona);
	}

}
