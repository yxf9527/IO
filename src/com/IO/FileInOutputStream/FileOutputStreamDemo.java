package com.IO.FileInOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 构造FileInputStream对象可以传递file对象，也可以传递文件目录 ，
		 * 只通过一个参数构造对象时  如果文件不存在  则直接创建文件  如果存在则直接删除再创建
		 * 如果不想删除原来的文件内容  那么可以通过传递第二个参数true来追加文件内容
		 * */
		FileOutputStream fos = new FileOutputStream("files/test.txt",true);
		//向文件中写int的数字  需要写四次   
		int a = 100;
		fos.write(a >>> 24);//最高八位
		fos.write(a >>> 16);
		fos.write(a >>> 8);
		fos.write(a);//最后八位
		
		//向文件流中写入字符
		String s = "中国";
		byte[] by = s.getBytes();
		fos.write(by);
		
		fos.close();
	}
}
