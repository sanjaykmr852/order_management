package order.management.drinks_order_management.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import order.management.drinks_order_management.model.BeverageModel;

@Service
public class BeverageService {

	public ResponseEntity<BeverageModel> getBeverageFromFactory(final UUID orderId){
		BeverageModel model=BeverageModel.builder().orderId(orderId).beverageName("Pepsi").quantity(100).build();
		return new ResponseEntity<BeverageModel>(model, HttpStatus.OK);
	}

}
