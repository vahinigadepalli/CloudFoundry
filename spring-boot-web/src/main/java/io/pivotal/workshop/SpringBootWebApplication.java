package io.pivotal.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.workshop.dao.GroceryDao;

@RestController
@SpringBootApplication
public class SpringBootWebApplication {
public GroceryDao groceryDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@RequestMapping("/")
	public String greetings(){
		return "Hello: Spring Boot!";
	}
	
	@PostMapping("/fetchAllDetails")
	public List<Integer> groceryDetails(@RequestBody GroceryDao groceryDetails) {
		List<String> allGroceryDetails = groceryDetails.getGroc();
		Stream<String> grocerySteram = allGroceryDetails.stream();
		return grocerySteram.map(a->a.length()).collect(Collectors.toList());
		
	}
}
