package order.management.drinks_order_management.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import order.management.drinks_order_management.model.CustomerDTO;

@Service
public class CustomerService {

	public ResponseEntity<CustomerDTO> getCustomerDetails(UUID customerId){
		CustomerDTO customerDTO=CustomerDTO.builder().customerId(customerId).customerName("Mahabalai").build();
		return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK);
	}
}
