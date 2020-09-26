package ex1;

public class WhatsAppMain {

	public static void main(String[] args) {

		WhatsAppV3 v3 = new WhatsAppV3();
		System.out.println("Accessing using v3 object");
		v3.groupMessages();
		v3.textMessaging();
		v3.fileTransfer();
		v3.videoCalling();
		System.out.println(v3.getClass());
		System.out.println(v3.hashCode());
		
		
		WhatsAppV1 v1=new WhatsAppV1();
		System.out.println("\nAccessing using v1 object");
		System.out.println(v1.getClass());
		System.out.println(v1.hashCode());
		v1.textMessaging();
		v1.voiceMessaging();

	}

}
