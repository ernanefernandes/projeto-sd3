
package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;


public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long deals;
	private Long visited;	
	private String sellerName;	
	
	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Long deals, Long visited, Seller seller) {		
		this.deals = deals;
		this.visited = visited;
		this.sellerName = seller.getName();
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
		
	
			

}

