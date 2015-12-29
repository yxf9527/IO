package com.IO.copyFile; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ͨ��FileInputStream �� FileOutputStreamʵ�ָ����ļ��Ĺ���
 * */
public class CopyByFileInOut {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("test.txt");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		//������ȡ
		byte[] b = new byte[8*1024];
		
		//��ȡ���ص��ֽ���   ��ȡ���ļ�ĩβʱ����-1
		int len = 0;
		
		//ѭ����ȡ
		while((len=fis.read(b,0,b.length))!=-1){
			fos.write(b, 0, len);
			fos.flush();
		}
		
		fis.close();
		fos.close();
		
	}

}
