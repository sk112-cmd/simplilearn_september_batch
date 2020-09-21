package serailize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.CreditCard;

public class SerializationMain {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("ccdata.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			CreditCard cc=new CreditCard(1234567890123456L, "Vinay N Ingalahalli", "Simplilearn Bank", "RuPAY", 122);
			oos.writeObject(cc);
			System.out.println("CC object with below data written to the file successfully");
			System.out.println(cc); //this is where toString() will print the content of cc object
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
