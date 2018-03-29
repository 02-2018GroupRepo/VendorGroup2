package vendors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vendors.model.Vendor;
import vendors.services.VendorServices;

@RestController
public class VendorController {
	
	@Autowired
    private VendorServices vendorService;
    
    @RequestMapping("/requestPrice")
    public double requestPrice(@RequestParam String id) {
        return vendorService.requestPrice(id);
    }
}
