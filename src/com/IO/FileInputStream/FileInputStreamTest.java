package com.IO.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream类单字节读取文件  和 批量字节处理文件
 * */
public class FileInputStreamTest {
	
	/**
	 * 单字节读取
	 * 以十六进制打印出
	 * */
	public static void readByByte(String filename) throws IOException {
		//通过传参文件路径   构造FileInputStream对象
		FileInputStream fis = new FileInputStream(filename); 
		
		int b = 0;
		//read方法每次只读取一个字节  该方法下一个数据字节 读取至文件末尾返回-1   
		while((b=fis.read())!=-1){
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		fis.close();
	}
	
	/**
	 * 批量读取1
	 * 该方法假设定义的byte数组可以一次容纳要读取的字节数
	 * read(byte[] a)方法将流读取到数组中   返回的是读取到数组中的字节总数
	 * @throws IOException 
	 * */
	public static void readByByteGroup1(String filename) throws IOException{
		FileInputStream fis = new FileInputStream(filename);
		
		//假设可以一次性将文件流的内容读取到长度为20*1024的数组中   
		byte[] buf = new byte[20*1024];
		//len存储读取的字节总数
		int len = fis.read(buf);
		//输出
		for (int i=0;i<len;i++) {
			System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
		}
		fis.close();
	}
	
	/**
	 * 循环批量读取
	 * read(byte[] a ,int off,int len)该方法将从off起始处开始 长度为len读取到a数组中  返回读入到数组的字节总数
	 * 如果因为到达文件末尾返回-1 
	 * */
	public static void readByByteGroup2(String filename) throws IOException{
		FileInputStream fis = new FileInputStream(filename);
		byte[] buf = new byte[8*1024];
		
		//返回每次批量读取的字节总数
		int len = 0;
		
		while((len=fis.read(buf, 0, buf.length))!=-1){
			for(int i=0;i<len;i++){
				System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
			}
		}
		fis.close();
	}
	
	
	//测试  比较 单字节读取和批量读取的效率
	public static void main(String[] args) throws IOException {
		readByByte("test.txt");
		System.out.println("\n"+"--------------------------------------------");
		readByByteGroup1("test.txt");
		System.out.println("\n"+"--------------------------------------------");
		readByByteGroup2("test.txt");
	}

}
