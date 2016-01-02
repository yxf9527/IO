package com.IO.bufferedInOutStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *�ֽڻ�����ʵ���ļ��ĸ���
 * */
public class CopyFileByBufferedStream {

	public static void main(String[] args) throws IOException {
		//file1���ļ����Ƶ�file2
		File file1 = new File("files/demo.dat");
		File file2 = new File("files/copy.dat");
		
		/**
		 * �ֽڻ���������Ĺ����DataInputStreamһ����Ҫ����һ��inputstream�Ķ���
		 * */
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file1));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(file2));
		
		int a = 0;
		
		while((a=bis.read())!=-1){
			bos.write(a);
			bos.flush();//ˢ�»�����
		}
		bis.close();
		bos.close();
	}
}
