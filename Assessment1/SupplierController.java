import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public List<Supplier> searchSuppliers(
        @RequestParam String location,
        @RequestParam NatureOfBusiness natureOfBusiness,
        @RequestParam ManufacturingProcess manufacturingProcess
    ) {
        return supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcess);
    }
}
