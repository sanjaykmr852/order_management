package order.management.drinks_order_management.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * customerDto has the detais of the customers who are requesting products from the factory
 * @author SANJAY
 */
@Data
@AllArgsConstructor
@Builder
public class CustomerDTO { 

	private UUID customerId;
	
	private String customerName;
	
}
