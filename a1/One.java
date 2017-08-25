package a1;

public class One extends Thread{
	private A1Reader reader;
	private Buffer buffer;
	
	public One(A1Reader reader, Buffer buffer){
		this.reader = reader;
		this.buffer = buffer;
	}
	
	@Override
	public void run(){
		char c = 0;
		while (c !=(char) -1) {
			c = (char) reader.read();
			if (c == '\n') {
				c = ' ';
			}
			buffer.write(c); 
		}
		reader.close();
	}
}
