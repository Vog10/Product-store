package model.services;

public class PriceUpdate implements ProfitMargin{
	
@Override
public double updatedPrice( double price) {
		
		return price += price * 0.20; 
		
	}

}
