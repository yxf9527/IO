package com.IO.file;

import java.io.File;

/**
 * File���ܲ����ļ�������   ֻ�ɻ�ȡ�ļ���Ŀ¼��ص�������Ϣ����С���ļ����ȣ�����ο�API
 * */
public class FileDemo {
	
	public static void main(String[] args) {
		
		//����file��Ķ�����Դ���·��  Ҳ���Դ���URL
		File file = new File("f:/EclipseProject/IO");
		System.out.println("�Ƿ���Ŀ¼��"+file.isDirectory());
		if(file.exists()){
			String[] s = file.list();
			//IO����Ŀ¼   Ҫ���ȡIO��������Ŀ¼���ļ�  ����ʹ�õݹ�
			for (String string : s) {
				System.out.println(string);
			}
		}
		
	}

}
