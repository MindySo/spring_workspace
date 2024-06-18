package spring_app03;

public class LazerPrinter implements Printer{
	
	@Override
	public void print(String msg) {
		System.out.println("레이저프린트로 '" + msg + "' 출력");
	}
}
