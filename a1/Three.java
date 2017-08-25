package a1;

public class Three extends Thread{
	private Buffer buffer;
	private A1Writer writer;
	volatile int i = 0;
	
	public Three(Buffer buffer,A1Writer writer){
		this.buffer = buffer;
		this.writer = writer;
	}
	
	public void run(){
		char c = (char) 0;	
		while (c != (char) -1) {
			c = buffer.read();
			writer.write(c);
			System.out.print(c);
			i = (i + 1) % 80;
			if (i == 0) {
				writer.lineBreak();
				System.out.println();
			}
		}
	}
}
