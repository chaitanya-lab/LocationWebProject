package com.paymentApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paymentApp.Entity.MenuManager;

@Service
public interface Menumanagerservices {

	public List<MenuManager> getMenu();

	public MenuManager addProduct(MenuManager product);

}
