package com.paymentApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentApp.Entity.MenuManager;

public interface MenuManagerDao extends JpaRepository<MenuManager,Integer> {


}
