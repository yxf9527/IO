package com.IO.encode;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class EncodeDemo {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "Ľ��ABC";
		byte[] b1 = str.getBytes();//ת�����ֽ�����    �Ǵ���Ŀ��ǰĬ�ϵı���  gbk
		for (byte b : b1) {
			//���ַ���ת����byte�������
//			System.out.print(b+" ");
			//��ת���ɵ�byte��ת����ʮ���������
			//gbk��������ռ��2���ֽ�  Ӣ��ռ��һ���ֽ�
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			System.out.println();
		}
		System.out.println("\n"+"------------------------------------------------");
		//ͨ�����ݵı��뷽ʽutf-8����  ʹ�û�ȡ�ַ���ת��Ϊutf-8���б�����ֽ�����
		byte[] b2 = str.getBytes("utf-8");
		for (byte b : b2) {
			//utf-8������3���ֽڴ洢һ������  һ���ֽڴ洢Ӣ��
			//System.out.print(b);
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
	}
	
	
	/**
	 * byte����ת��Ϊʮ��������ʾ 
	 * int���   �����ַ���   
	 * */
	@Test
	public void byte2Hex(){
		int a = 1234;
		byte b = 122;
		System.out.println(Integer.toHexString(a));//4d2
		System.out.println(Integer.toHexString(b));//7a
	}
	

}
