package order.management.drinks_order_management.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import order.management.drinks_order_management.model.CustomerDTO;
import order.management.drinks_order_management.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/{customerId}",method= {RequestMethod.GET},produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerDTO> getCustomerDetails(@PathVariable UUID customerId){
	return customerService.getCustomerDetails(customerId);	
	}

}
