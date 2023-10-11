package com.paymentApp.serviceImplemantation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentApp.Entity.MenuManager;
import com.paymentApp.dao.MenuManagerDao;
import com.paymentApp.services.Menumanagerservices;

@Service
public class MenuManagerServiceImp implements Menumanagerservices {

	@Autowired
	private MenuManagerDao menuManagerdao;

	@Override
	public List<MenuManager> getMenu() {

		return this.menuManagerdao.findAll();
	}

	@Override
	public MenuManager addProduct(MenuManager product) {
		return menuManagerdao.save(product);
	}

}
