/**
 * 
 */
package com.cesarmata.ws14restfulwebsservicescontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cesar Mata
 *
 */
@RestController
public class HelloWorldController {
	
	// GET
	// URI: /hello-world
	// method - "Hello world".
	
	@RequestMapping(method = RequestMethod.GET, path="/hello-world")
	public String helloWorld(){
		return "Hello World"; 
	}
}