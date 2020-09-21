package character_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("charDemo.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("hello hi I will be written on the file in first line");
			bw.newLine();
			bw.write("hey I am in 2nd line");
			bw.newLine();
			bw.write("I am in 3rd line... Observe that we dont have to do any conversions here");
			System.out.println("Messages writeen to file successfully");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
