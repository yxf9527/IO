package com.IO.InOutputStreamReaderWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * �����ַ����Ĳ����õ� �ļ��ĸ��ƹ���
 * */
public class CopyDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("files/demo.dat");
		InputStreamReader isr = new InputStreamReader(fis);
		
		FileOutputStream fos = new FileOutputStream("files/copy.dat");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		/**
		 * �����ֽڲ����ﵽ���ƹ���ʵ��
		 * */
		char[] buff = new char[8*1024];
		int a ;
		while((a=isr.read(buff, 0, buff.length))!=-1){
			//����ȡ��buff�е��ַ��� д���ļ�
			osw.write(buff, 0, a);
			osw.flush();
		}
		osw.close();
		isr.close();
		fis.close();
		fos.close();
	}

}
