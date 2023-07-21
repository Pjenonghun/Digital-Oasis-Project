package com.human.springboot;

import lombok.Data;

@Data
public class jh_selectreviewsDTO {
	int review_seq; 
	int order_id;
	String prod_name;
	String prod_image;
	int review_rate;
	String review_content;
}
