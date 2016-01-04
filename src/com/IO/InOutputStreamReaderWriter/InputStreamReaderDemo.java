package com.IO.InOutputStreamReaderWriter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader字符流操作
 * */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * InputStreamReader的构造相似与DataInputStream
		 * */
		FileInputStream fis = new FileInputStream("files/demo.dat");
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		
		/**
		 * 读取方法1
		 * 每次操作一个字节 读取一个int  read读取信息返回int
		 * char int  可以互相转换
		 * */
//		int a ;
//		while((a=isr.read())!=-1){
//			System.out.print((char)a);
//		}
		
		/**
		 * 批量字符读取
		 * */
		char[] buff = new char[8*1024];
		int b;
		//read方法将文件读取进buff数组  每次读取的最大长度为len，从0开始  返回每次读取的字符长度给b  读取到文件末尾返回-1
		while((b=isr.read(buff, 0, buff.length))!=-1){
			//根据String的构造方法  将读取的字符构造成字符串
			String s = new String(buff, 0, b);
			System.out.print(s);
		}
		
		isr.close();
		fis.close();
		
	}
}
