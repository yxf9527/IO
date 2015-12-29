package com.IO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("demo.dat", "rw");
		
		for(int i=1;i<11;i++){
			raf.writeDouble(i*1.414);
		}
		
		System.out.println(raf.getFilePointer()); //10*8
		
		//将指针指向第五个数据后面
		raf.seek(5*8);
		//覆盖第六个double数据
		raf.writeDouble(1.234);
		raf.close();
		
		raf = new RandomAccessFile("demo.dat", "r");
		for (int i = 1; i < 11; i++) {
			System.out.println("value "+i+":"+raf.readDouble());
		}
		raf.close();
	}

}
