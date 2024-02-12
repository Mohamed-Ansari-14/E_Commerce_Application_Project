package com.ecom.eCommerceWebsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.eCommerceWebsite.dao.cartDao;
import com.ecom.eCommerceWebsite.dto.Cart;

import java.util.List;

@Service
public class cartService {
	@Autowired
	private cartDao cartDao;

	public Cart addCart(Cart cart)
	{
		return cartDao.addCart(cart);
	}
	
//  public Cart getCart(int id)
//  {
//  	return cartDao.getCart(id);
//  }
	public List<Cart> getCarts(){
		return this.cartDao.getCarts();
	}
	
	public void updateCart(Cart cart){
		cartDao.updateCart(cart);
	}
	
	public void deleteCart(Cart cart)
	{
		cartDao.deleteCart(cart);
	}
}
