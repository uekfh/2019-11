package D_8;

import java.nio.CharBuffer;

public class P271 {
	public static void main(String[] args) {
	CharBuffer charBuffer=CharBuffer.allocate(6);
	System.out.println("容量："+charBuffer.capacity());
	System.out.println("界限值："+charBuffer.limit());
	System.out.println("初始位置："+charBuffer.position());
	charBuffer.put('4');
	charBuffer.put('5');
	charBuffer.put('r');
	System.out.println("后界限值："+charBuffer.limit());
	System.out.println("后始位置："+charBuffer.position());
	charBuffer.flip();
	
	System.out.println("第一个值："+charBuffer.get());
	System.out.println("第后一个值："+charBuffer.limit());
	System.out.println("取出后的位置："+charBuffer.position());
	
	charBuffer.clear();
	System.out.println("清除界限值:"+charBuffer.limit());
	System.out.println("清除后的位置："+charBuffer.position());
	
	System.out.println("第一个值："+charBuffer.get(0));
	System.out.println("取出后的界限值："+charBuffer.limit());
	System.out.println("取出后的位置："+charBuffer.position());
}
}
