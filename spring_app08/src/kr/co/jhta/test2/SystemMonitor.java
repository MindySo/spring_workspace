package kr.co.jhta.test2;

public class SystemMonitor {
	Sender sender;

	public SystemMonitor(Sender sender) {
		super();
		this.sender = sender;
	}

	//	public void setSender(Sender sender) {
//		this.sender = sender;
//	}
	
	public void print() {
		System.out.println("SystemMonitor 클래스의 print() 실행중");
		sender.show();
	}

}
