package order.management.drinks_order_management.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeverageModel {

	private UUID orderId;
	
	private String beverageName;
	
	private long quantity;
}
