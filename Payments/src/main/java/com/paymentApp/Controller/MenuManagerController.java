package com.paymentApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentApp.Entity.MenuManager;
import com.paymentApp.dao.MenuManagerDao;
import com.paymentApp.services.Menumanagerservices;

@RestController
public class MenuManagerController {


	@Autowired
	private Menumanagerservices menuManagerServices;
	@GetMapping("/getMenu")

	public List<MenuManager> getAllMenu() {
		return this.menuManagerServices.getMenu();

	}
	
	@PostMapping("/addProductDetails")
	public MenuManager addProductDetails(@RequestBody MenuManager product) {
		return this.menuManagerServices.addProduct(product);
		
	}

}
