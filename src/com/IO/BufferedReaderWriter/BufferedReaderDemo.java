package com.IO.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		File file = new File("files/demo.dat");
		//������鷳 ע�⹹��ʱ���ݵ�����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(file)));
		
		String s ;
		while((s=br.readLine())!=null){
			//ÿ�λ���ʱ  ������ʶ�� ������println
			System.out.println(s);
		}
		br.close();
	}

}
