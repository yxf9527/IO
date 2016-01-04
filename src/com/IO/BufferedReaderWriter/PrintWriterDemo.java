package com.IO.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * PrintWriter���bufferedReaderʵ�ָ��ƹ���
 * */
public class PrintWriterDemo {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("files/demo.dat")));
		//�乹�캯���ܼ�
		PrintWriter pw = new PrintWriter(new File("files/copy.dat"));
		
		String line;
		
		while((line=br.readLine())!=null){
			pw.println(line);
			pw.flush();
		}
		pw.close();
		br.close();
		
		
	}

}
