package fr.univrouen.stb23v1.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.TestSTB;

@RestController
public class PostController {
	@RequestMapping(value="/testpost",method=RequestMethod.POST,consumes="application/xml")
	public String postTest(@RequestBody String flux) {
		return ("<result><respoonse>Message reçu : </response>" + flux + "</result>");
	}
	
	@PostMapping(value="/poststb",produces = MediaType.APPLICATION_XML_VALUE)
	public String postSTB() {
		TestSTB stb = new TestSTB();
		return stb.loadFileXML();
	}
}
