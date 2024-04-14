package adiiapplication;

import java.io.*;
public class Bufrdrder {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos=new FileOutputStream("C:\\Aditya\\Adu.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s="Weclome to java programs";
		byte b[]=s.getBytes();
		bos.write(b);
		bos.flush();			//used for save data
		bos.close();
		System.out.println("Successfully writtten in file");
	}

}
