package com.IO.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		File file = new File("files/demo.dat");
		//构造较麻烦 注意构造时传递的类型
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(file)));
		
		String s ;
		while((s=br.readLine())!=null){
			//每次换行时  并不能识别 所以用println
			System.out.println(s);
		}
		br.close();
	}

}
