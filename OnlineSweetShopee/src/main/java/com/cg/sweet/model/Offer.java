package com.cg.sweet.model;

import javax.persistence.*;

@Entity
@Table(name = "offer")
public class Offer  {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "offerid")
     private int  id;
     @Column(name = "offername")
     private String offerName;
     @Column(name = "offerrate")
     private double offerRate;

    @ManyToOne
    @JoinColumn(name = "sweetid" ) 
    private Sweet sweet;

	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public double getOfferRate() {
		return offerRate;
	}

	public void setOfferRate(double offerRate) {
		this.offerRate = offerRate;
	}

	public Sweet getSweet() {
		return sweet;
	}

	public void setSweet(Sweet sweet) {
		this.sweet = sweet;
	}

    
}
