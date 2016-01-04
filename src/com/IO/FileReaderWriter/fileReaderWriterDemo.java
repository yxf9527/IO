package com.IO.FileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 利用FileReader和FileWriter实现文件复制功能
 * */
public class fileReaderWriterDemo {
	
	@Test
	public void copy() throws IOException{
		File file1 = new File("files/demo.dat");
		
		File file2 = new File("files/copy.dat");
		FileReader fr = new FileReader(file1);
		/**
		 * 	FileWriter fw = new FileWriter(file2,true);
		 * 在原来的文件上追加
		 * */
		FileWriter fw = new FileWriter(file2);
		
		/**
		 * 批量读取
		 * */
		char[] buff = new char[8*1024];
		int a;
		while((a=fr.read(buff, 0, buff.length))!=-1){
			fw.write(buff, 0, a);
			fw.flush();
		}
		
		fw.close();
		fr.close();
	}

}
