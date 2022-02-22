package ua.lviv.iot.laba1;

public class Main {

	public static void main(String[] args) {
		
		creditCard firstcreditCard = new creditCard();
		creditCard secondcreditCard = new creditCard("Gold", 1.111111111111111, "dollar");
		creditCard thirdcreditCard = new creditCard("Premium", 2.2222222222222222, "euro", 3, "Bob");
	

	System.out.println(firstcreditCard);
	System.out.println(secondcreditCard);
	System.out.println(thirdcreditCard);
	
	System.out.println();
	System.out.println(creditCard.staticField());
}
}