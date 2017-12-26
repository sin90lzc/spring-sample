package com.dtc.service;

import com.dtc.bean.Order;

public interface IOrderService {

	public void order(Order order);
	
	public Order queryOrder(Long orderId);
}
