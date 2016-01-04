package com.IO.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ͨ��������ʵ���ļ��ĸ���
 * */
public class copyDemo {
	
	public static void main(String[] args) throws IOException  {
		File file1 = new File("files/demo.dat");
		File file2 = new File("files/copy.dat");
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(file1)));
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(file2)));
		
		String line;
		
		while((line=br.readLine())!=null){
			
			bw.write(line);
			//readLineʶ���˻���
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
		
	}

}
