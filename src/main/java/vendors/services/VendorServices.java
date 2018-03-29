package vendors.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vendors.dao.VendorData;

@Component
public class VendorServices {

	@Autowired
	private VendorData vendorData;
	
	public double requestPrice(String id) {
		
		return vendorData.getPriceById(id);
	}
	

	
	
}
