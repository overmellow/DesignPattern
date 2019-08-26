package bridge.exercise1;

public class BasicRemote extends Remote {

	public BasicRemote(Device device) {
		super(device);
	}

	@Override
	public void volumeUp() {
		device.setVolume(1);
	}

}
