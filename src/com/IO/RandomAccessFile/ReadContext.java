package com.IO.RandomAccessFile;

import java.io.RandomAccessFile;


public class ReadContext {
	
	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		
		byte[] buff = new byte[1024];
		
		int len = 0;
		while((len=raf.read(buff))>0){
			System.out.println(new String(buff,0,len));
		}
		
		raf.close();
		
	}

}
