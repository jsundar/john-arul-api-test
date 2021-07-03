package com.microservices.test.utils;

public enum Promotions {

	Promotion1("PROMOTION1", "Buy A and get B for half Price. Half Price is applied to B items. Based on number of A items."),
	promotion2("PROMOTION2", "Buy any 3 items from A,B,C,D,E and get the cheapest one for free.");
	
	private String promotionName;
	private String promotionDescription;
	
	Promotions(String promotionName, String promotionDescription) {
		this.promotionName = promotionName;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getPromotionDescription() {
		return promotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}	
	
}
