package bridge.exercise1;

public abstract class Remote {
	protected Device device;
	
	public Remote(Device device) {
		this.device = device;
	}
	
	public abstract void volumeUp();

}
  