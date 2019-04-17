package io.pivotal.workshop.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import io.pivotal.workshop.dao.GroceryDao;
@Repository
public class GroceryDaoImpl {

	public List<String> getAllGroceryDetails(List<String> groceryDetails) {
		// TODO Auto-generated method stub
		List<String> listDetails = new ArrayList<>();
		listDetails.add("Wheatflour");
		listDetails.add("FLipkart");
		listDetails.add("Amazon");
		listDetails.add("Bigbasket");
		
	
		return null;
	}

}
