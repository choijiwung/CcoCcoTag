package oop.exam10;

public class SamsungTV implements TV {

	private Speaker speaker;

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("SamsungTV : TV를 켭니다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV : TV를 끕니다.");
	}

	public void channelUp() {
		System.out.println("SamsungTV : 채널을 올립니다.");
	}

	public void channelDown() {
		System.out.println("SamsungTV : 채널을 내립니다.");
	}

	public void soundUp() {
		if (speaker == null) {
			System.out.println("SamsungTV : 소리를 올립니다.");
		} else {
			speaker.soundUp();
		}
	}

	public void soundDown() {
		if (speaker == null) {
			System.out.println("SamsungTV : 소리를 내립니다.");
		} else {
			speaker.soundDown();
		}
	}
}
