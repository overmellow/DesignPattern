package bridge.exercise1;

public class TV implements Device {
	private int volumeLevel;
	
	public TV() {
		this.volumeLevel = 0;
	}
	
	@Override
	public void setVolume(int percent) {
		this.volumeLevel += percent;
		System.out.println("Setting Volume [TV: " + volumeLevel + "]");
	}

}
