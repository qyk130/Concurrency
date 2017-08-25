package a1;

public class Buffer {
	private char[] buffer;
	private int in,out;
	
	public Buffer(){
		buffer = new char[20];
		in = 0;
		out = 0;
	}
	
	public char read(){
		while (in == out) {
			Thread.yield();
		}
		char temp = buffer[out];
		out = (out + 1) % 20;
		return temp;
	}
	
	public void write(char d){
		while (out == (in + 1) % 20) {
			Thread.yield();
		}
		buffer[in] = d;
		in = (in + 1) % 20;
	}
}
