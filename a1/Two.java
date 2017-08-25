package a1;

public class Two extends Thread{
	private Buffer bufferin, bufferout;
	
	public Two(Buffer bufferin, Buffer bufferout){ 
		this.bufferin = bufferin;
		this.bufferout = bufferout;
	}
	
	public void run(){
		char c = (char) 0;
		char previous = (char) -1;
		while (c != (char) -1) {
			c = bufferin.read();
			if (c !='\t') {
				if (c != ' ' || previous != ' ') {
					bufferout.write(c);
					
				}
			}
			previous = c;
		}
	}
}
