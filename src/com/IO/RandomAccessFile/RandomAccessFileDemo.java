package com.IO.RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("demo.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		
		//读写的操作模式
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		//打开文件时 指针的位置0
		System.out.println(raf.getFilePointer());
		
		raf.write(12);//只写一个字节
		System.out.println(raf.getFilePointer());//1
		
//		byte[] a = new byte[3];
//		raf.write(a);
//		System.out.println(raf.getFilePointer());//4
//		System.out.println(raf.length());//4   返回文件的长度
		
		raf.writeInt(12);
		/**
		 * int4个字节
		 * 该方法其底层还是通过write实现一个字节写操作的
		 * */ 
		System.out.println(raf.getFilePointer());

		//写字符串
		byte[] b = "中国".getBytes("GBK");
		raf.write(b);
		//进行读操作时  要将point指针指向0
		raf.seek(0);
	
		byte[] c = new byte[(int)raf.length()];
		//将数据读入数据c
		raf.read(c);
		String str = new String(c,"GBK");
		System.out.println(str);
		for (byte c2 : c) {
			System.out.print(c2+" ");
		}
	}

}
