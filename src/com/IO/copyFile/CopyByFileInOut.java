package com.IO.copyFile; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过FileInputStream 和 FileOutputStream实现复制文件的功能
 * */
public class CopyByFileInOut {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("test.txt");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		//批量读取
		byte[] b = new byte[8*1024];
		
		//读取返回的字节数   读取到文件末尾时返回-1
		int len = 0;
		
		//循环读取
		while((len=fis.read(b,0,b.length))!=-1){
			fos.write(b, 0, len);
			fos.flush();
		}
		
		fis.close();
		fos.close();
		
	}

}
