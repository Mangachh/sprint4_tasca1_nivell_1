package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private Logger log = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping(path="asd/1")
	public String saluda() {
		return "No quiero salir";
	}
	
	
	@GetMapping(path="HelloWorld")
	public String saluda(@RequestParam(name="nom", required=false, defaultValue="UNKNOWN") String nom) {
		log.debug("entramos en Hello World");
		return String.format("Hola, %s. Estàs executant un projecte Maven", nom);
	}
	
	@GetMapping(path="HelloWorld2/{nom}")
	public String saluda2(@PathVariable(name="nom", required=false) String nom) {
		return String.format("Hola, %s. Estàs executant un projecte Maven", nom);
	}
}
