package com.xworkz.test.serial;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Train train = new Train("Bangalore",21,250.0);
		byte[] bytes = convertObjectToBytes(train);
		Train train1 = (Train)	convertByteToObject(bytes);	
		
		System.out.println(train1);
	}

	private static Object convertByteToObject(byte[] bytes)  {
		InputStream in=new ByteArrayInputStream(bytes);
		try (ObjectInputStream out=new ObjectInputStream(in))
		{
			return out;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return in; 
	}
		
	private static byte[] convertObjectToBytes(Train train) {
		ByteArrayOutputStream by= new ByteArrayOutputStream();
		try (ObjectOutputStream out=new ObjectOutputStream(by))
		{
			out.writeObject(out);
		}

		 catch (IOException out) {
			 out.printStackTrace();
			
		
		}
		return null;

}
}
