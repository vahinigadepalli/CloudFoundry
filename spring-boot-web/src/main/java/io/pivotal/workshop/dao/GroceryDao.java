package io.pivotal.workshop.dao;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GroceryDao {
	@JsonProperty
	private List<String> groc;
	
	public List<String> getGroc(){
		return groc;
	}
	public List<String> setGroc(){
		return groc;
	}

}
