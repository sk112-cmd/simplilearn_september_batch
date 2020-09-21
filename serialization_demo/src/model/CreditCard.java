package model;

import java.io.Serializable;

public class CreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 286360917783568109L;
	private long ccNumber;
	private String cardHolderName;
	private String bankName;
	private String cardType;
	private transient int cvv;
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public CreditCard(long ccNumber, String cardHolderName, String bankName, String cardType, int cvv) {
		super();
		this.ccNumber = ccNumber;
		this.cardHolderName = cardHolderName;
		this.bankName = bankName;
		this.cardType = cardType;
		this.cvv = cvv;
	}

	public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	//to see the content of your CC object we override toString from Object class
	// if you don't override it and just do S.o.p(ccObject) it will print address of this not the content
	@Override
	public String toString() {
		return "CreditCard [ccNumber=" + ccNumber + ", cardHolderName=" + cardHolderName + ", bankName=" + bankName
				+ ", cardType=" + cardType + ", cvv=" + cvv + "]";
	}
	
}
