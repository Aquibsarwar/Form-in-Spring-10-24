package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

@GetMapping("customer")
public String show() {
	return "customer.jsp";
}
@PostMapping("/details")
public String viewdetails(@RequestParam("cid") String cid,
	@RequestParam("cname") String cname,
	@RequestParam("cemail") String cemail) {
	 return "ViewCustomerDetails.jsp";
}

}
