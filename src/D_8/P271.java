package D_8;

import java.nio.CharBuffer;

public class P271 {
	public static void main(String[] args) {
	CharBuffer charBuffer=CharBuffer.allocate(6);
	System.out.println("������"+charBuffer.capacity());
	System.out.println("����ֵ��"+charBuffer.limit());
	System.out.println("��ʼλ�ã�"+charBuffer.position());
	charBuffer.put('4');
	charBuffer.put('5');
	charBuffer.put('r');
	System.out.println("�����ֵ��"+charBuffer.limit());
	System.out.println("��ʼλ�ã�"+charBuffer.position());
	charBuffer.flip();
	
	System.out.println("��һ��ֵ��"+charBuffer.get());
	System.out.println("�ں�һ��ֵ��"+charBuffer.limit());
	System.out.println("ȡ�����λ�ã�"+charBuffer.position());
	
	charBuffer.clear();
	System.out.println("�������ֵ:"+charBuffer.limit());
	System.out.println("������λ�ã�"+charBuffer.position());
	
	System.out.println("��һ��ֵ��"+charBuffer.get(0));
	System.out.println("ȡ����Ľ���ֵ��"+charBuffer.limit());
	System.out.println("ȡ�����λ�ã�"+charBuffer.position());
}
}
