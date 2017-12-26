package com.dtc.service.impl;

import com.dtc.bean.Order;
import com.dtc.service.IOrderService;
import com.dtc.service.IProductService;

public class OrderServiceImpl implements IOrderService {

	private IProductService productService;
	
	@Override
	public void order(Order order) {
		
	}

	@Override
	public Order queryOrder(Long orderId) {
		return null;
	}

	public IProductService getProductService() {
		return productService;
	}

	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	
	
}
