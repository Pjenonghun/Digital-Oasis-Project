package com.human.springboot;

import lombok.Data;

@Data
public class jh_cartDTO {
	int cart_seq;
	int pid;
	String prod_name;
	String prod_image;
	int cart_qty;
	int cart_price;
}
