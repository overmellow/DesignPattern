package bridge.exercise1;

public class BridgeDemo {
   public static void main(String[] args) {
	      Remote radioRemote = new BasicRemote(new TV());
	      Remote tvRemote = new AdvancedRemote(new Radio());
	      
	      tvRemote.volumeUp();
	      tvRemote.volumeUp();
	      tvRemote.volumeUp();
	      radioRemote.volumeUp();
	      radioRemote.volumeUp();
	}
}
