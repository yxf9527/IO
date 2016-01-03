package com.IO.InOutputStreamReaderWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 根据字符流的操作得到 文件的复制功能
 * */
public class CopyDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("files/demo.dat");
		InputStreamReader isr = new InputStreamReader(fis);
		
		FileOutputStream fos = new FileOutputStream("files/copy.dat");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		/**
		 * 批量字节操作达到复制功能实现
		 * */
		char[] buff = new char[8*1024];
		int a ;
		while((a=isr.read(buff, 0, buff.length))!=-1){
			//将读取进buff中的字符流 写进文件
			osw.write(buff, 0, a);
			osw.flush();
		}
		osw.close();
		isr.close();
		fis.close();
		fos.close();
	}

}
