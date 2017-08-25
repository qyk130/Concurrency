package a1;

import java.io.IOException;

public class FileConverter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A1Reader reader = new A1Reader("source.txt");
			A1Writer writer = new A1Writer("out.txt");	
			Buffer oneToTwo = new Buffer();
			Buffer twoToThree = new Buffer();
			One one = new One(reader, oneToTwo);
			Two two = new Two(oneToTwo, twoToThree);
			Three three = new Three(twoToThree, writer);
			one.start();
			two.start();
			three.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
