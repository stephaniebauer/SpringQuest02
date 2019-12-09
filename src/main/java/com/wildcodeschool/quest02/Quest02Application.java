package com.wildcodeschool.quest02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
@Controller
@SpringBootApplication
public class Quest02Application {

	public static void main(String[] args) {
		SpringApplication.run(Quest02Application.class, args);
	}
	
	@RequestMapping("/doctor/{number}")
	@ResponseBody
	public String incarnationNumber(@PathVariable int number) {
		String number9 = "Christopher Eccleston";
		String number10 = "David Tennant";
		String number11 = "Matt Smith";
		String number12 = "Peter Capaldi";
		String number13 = "Jodie Whittaker";
		
		if (number == 9){
			return "{number: " + number + ", name: " + number9 +"}";			
		}
		
		if (number == 10){
			return "{number: " + number + ", name: " + number10 +"}";			
		}
		
		if (number == 11){
			return "{number: " + number + ", name: " + number11 +"}";			
		}
		
		if (number == 12){
			return "{number: " + number + ", name: " + number12 +"}";			
		}
		
		if (number == 13){
			return "{number: " + number + ", name: " + number13 +"}";			
		}
	
		else if (number >= 1 && number <=8 ) {
		 return "303 status error";
		}
		
		else {return "Impossible to retrieve the incarnation " + number;}
		
	}

}
