package com.ideas2it.multipledatasource.model.card;

public class CardDTO {

    private String firstName;
    private String lastName;
	//private String name;
    private int expirationMonth;
    private int expirationYear;
    
	public CardDTO() {
		super();
	}

	public CardDTO(String firstName, String lastName, int expirationMonth, int expirationYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}



	public int getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public int getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	
	



}