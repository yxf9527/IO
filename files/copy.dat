package com.IO.file;

import java.io.File;

/**
 * File不能操作文件的内容   只可获取文件或目录相关的属性信息（大小，文件名等）具体参考API
 * */
public class FileDemo {
	
	public static void main(String[] args) {
		
		//构建file类的对象可以传入路径  也可以传递URL
		File file = new File("f:/EclipseProject/IO");
		System.out.println("是否是目录："+file.isDirectory());
		if(file.exists()){
			String[] s = file.list();
			//IO下子目录   要想获取IO下所有子目录和文件  可以使用递归
			for (String string : s) {
				System.out.println(string);
			}
		}
		
	}

}
