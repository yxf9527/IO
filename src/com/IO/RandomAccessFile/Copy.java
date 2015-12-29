package com.IO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile实现复制功能
 * */
public class Copy {
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("demo.dat", "rw");
		
		RandomAccessFile ra = new RandomAccessFile("copy.dat","rw");
		
		byte[] a = new byte[(int)raf.length()];
		raf.readFully(a);
		ra.write(a);
		raf.close();
		ra.close();
		
		
	}

}
