package kr.co.jhta.test3;

public class InkJetPrinter implements Printer {
	
	int red, green, blue;	// 0~100
	// 3가지 색 중 부족한 게 있다면 출력할 수 없다
	// 잉크가 부족합니다.
	
//	public InkJetPrinter(int red, int green, int blue) {
//		super();
//		this.red = red;
//		this.green = green;
//		this.blue = blue;
//	}
	
	public void setRed(int red) {
		this.red = red;
	}
	
	public void setGreen(int green) {
		this.green = green;
	}
	
	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	@Override
	public void print() {

		if(red > 0 && green > 0 && blue > 0) {
			System.out.println("프린팅");
			System.out.println("red : " + red);
			System.out.println("green : " + green);
			System.out.println("blue : " + blue);
			red -= 10;
			green -= 10;
			blue -= 10;
		}else {
			System.out.println("잉크가 부족합니다");
		}
		
	}

}
