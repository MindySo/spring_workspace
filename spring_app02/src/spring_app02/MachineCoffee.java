package spring_app02;

public class MachineCoffee implements Beverage {
	
	String cake;
	
	public void setSnack(String snack) {
		this.cake = cake;
	}
	
	@Override
	public void drink(String name) {
		
		System.out.println(name + "님이 아메리카노와 " + cake + "을(를) 먹어요.");
		
	}
}
