package com.IO.bufferedInOutStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *字节缓冲流实现文件的复制
 * */
public class CopyFileByBufferedStream {

	public static void main(String[] args) throws IOException {
		//file1的文件复制到file2
		File file1 = new File("files/demo.dat");
		File file2 = new File("files/copy.dat");
		
		/**
		 * 字节缓冲流对象的构造和DataInputStream一样需要传递一个inputstream的对象
		 * */
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file1));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(file2));
		
		int a = 0;
		
		while((a=bis.read())!=-1){
			bos.write(a);
			bos.flush();//刷新缓冲区
		}
		bis.close();
		bos.close();
	}
}
