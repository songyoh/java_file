package interface_.example;

public class TVRemoteController implements RemoteController {// 구현체

	public final int inch;
	public int channel;
	
	public TVRemoteController(int inch) {
		this.inch = inch;
		this.channel = 1;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setChannelUP() {
		this.channel++;
	}
	
	public void setChannelDown() {
		// 1번 채널까지만 있음
		if(this.channel - 1 < 1) {
			this.channel = 1;
		}else {
			this.channel--;
		}
	}
	
	public void setChannel(int channel) {
		if(channel < 1) {
			this.channel = 1;
		}else {
			this.channel = channel;
		}
	}

	@Override
	public void showStatus() {
		System.out.println(this.inch + "인치");
		System.out.println("현재채널 : " + this.channel);
		
	}
	
}
