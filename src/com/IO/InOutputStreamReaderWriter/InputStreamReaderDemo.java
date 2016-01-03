package com.IO.InOutputStreamReaderWriter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader�ַ�������
 * */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * InputStreamReader�Ĺ���������DataInputStream
		 * */
		FileInputStream fis = new FileInputStream("files/demo.dat");
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		
		/**
		 * ��ȡ����1
		 * ÿ�β���һ���ֽ� ��ȡһ��int  read��ȡ��Ϣ����int
		 * */
		int a ;
		while((a=isr.read())!=-1){
			System.out.print((char)a);
		}
		
		/**
		 * �����ַ���ȡ
		 * */
		char[] buff = new char[8*1024];
		int b;
		while((b=isr.read(buff, 0, buff.length))!=-1){
			//����String�Ĺ��췽��  ����ȡ���ַ�������ַ���
			String s = new String(buff, 0, b);
			System.out.print(s);
		}
		
		isr.close();
		fis.close();
		
	}
}
