package fr.univrouen.stb23v1.controllers;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.STB;

@RestController
public class GetController {

	@GetMapping("/resume")
	public String getListRSSinXML() {
		return "Envoi de la liste des STB";
	}
	
	@GetMapping("/stbid")
	public String getRSSinXML(@RequestParam(value="id")String texte) {
		return "Détail de la STB n°" + texte;
	}
	
	@RequestMapping(value="/xml",produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody STB getXML() {
		STB stb = new STB(123,"Test STB","2023-04-01T14:22:33");
		return stb;
	}
}
