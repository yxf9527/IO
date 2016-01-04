package com.IO.FileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * ����FileReader��FileWriterʵ���ļ����ƹ���
 * */
public class fileReaderWriterDemo {
	
	@Test
	public void copy() throws IOException{
		File file1 = new File("files/demo.dat");
		
		File file2 = new File("files/copy.dat");
		FileReader fr = new FileReader(file1);
		/**
		 * 	FileWriter fw = new FileWriter(file2,true);
		 * ��ԭ�����ļ���׷��
		 * */
		FileWriter fw = new FileWriter(file2);
		
		/**
		 * ������ȡ
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
