package bridge.exercise1;

public class Radio implements Device {
	private int volumeLevel;
	
	public Radio() {
		this.volumeLevel = 0;
	}
	
	@Override
	public void setVolume(int percent) {
		this.volumeLevel += percent;
		System.out.println("Setting Volume[Radio: " + volumeLevel + "]");		
	}

}
