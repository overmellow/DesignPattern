package bridge.exercise1;

public class AdvancedRemote extends Remote {

	public AdvancedRemote(Device device) {
		super(device);
	}

	@Override
	public void volumeUp() {
		device.setVolume(10);
	}

}
