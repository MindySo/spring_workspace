package spring_app02;

public class HandDripCoffee implements Beverage{
	String snack;
	
	public void setSnack(String snack) {
		this.snack = snack;
	}
	
	@Override
	public void drink(String name) {
		
		System.out.println(name + "님이 핸드드립커피와 " + snack + "을(를) 먹어요.");
		
	}
}
