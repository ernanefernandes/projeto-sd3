
package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;


public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Double sum;
	private String sellerName;	
	
	public SaleSumDTO() {
	}
	
	public SaleSumDTO(Seller seller, Double sum) {
		
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public String getSallerName() {
		return sellerName;
	}

	public void setSallerName(String sallerName) {
		this.sellerName = sallerName;
	}
	
	
			

}

