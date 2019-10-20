package order.management.drinks_order_management.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import order.management.drinks_order_management.model.BeverageModel;
import order.management.drinks_order_management.model.CustomerDTO;
import order.management.drinks_order_management.service.BeverageService;
import order.management.drinks_order_management.service.CustomerService;

@RequestMapping("/api/beverage")
@RestController
@Slf4j
public class BeverageController {

	@Autowired
	private BeverageService beverageService;
	
	@RequestMapping(value="/{beverageId}",method= {RequestMethod.GET},produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BeverageModel> getBeverage(@PathVariable UUID beverageId){
	log.info("Beverage controller:getBevarage method is called,UUID:{}",beverageId);
	log.info("Beverage controller:getBevarage method is ended");
	return beverageService.getBeverageFromFactory(beverageId);	
	}
	
}
