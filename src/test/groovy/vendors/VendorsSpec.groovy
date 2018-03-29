package vendors

import spock.lang.Specification
import vendors.dao.VendorData
import vendors.services.VendorServices

class VendorsSpec extends Specification {
	
	def "Request Product"(){
		
		given: "A sample product"
		Products sampleProduct = new Products("sprite", 2.00); 
				
		and: "a dao that always returns this value"
		VendorData vendorData = Stub(VendorData.class)
		vendorData.getPriceById("sprite") >> 2.0
		
		and: "a VendorServices which is the class under test"
		VendorServices vendorServices = new VendorServices()
		vendorServices.vendorData = vendorData
		
		
		when: "I send the product ID to the product company"
		double price = vendorServices.requestPrice("sprite")
		
		then: "I will receive the product price"
		
		price == 2.0
	}
		

}
