package vendors.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vendors.model.Vendor;

@RestController
public class VendorController {

    
    @RequestMapping("/requestPrice")
    public double requestPrice(@RequestParam(value="ID", defaultValue="Not an ID") String ID) {
        return Vendor.requestPrice(ID);
    }
}
