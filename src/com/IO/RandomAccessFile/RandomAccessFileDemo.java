package com.IO.RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("demo.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		
		//��д�Ĳ���ģʽ
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		//���ļ�ʱ ָ���λ��0
		System.out.println(raf.getFilePointer());
		
		raf.write(12);//ֻдһ���ֽ�
		System.out.println(raf.getFilePointer());//1
		
//		byte[] a = new byte[3];
//		raf.write(a);
//		System.out.println(raf.getFilePointer());//4
//		System.out.println(raf.length());//4   �����ļ��ĳ���
		
		raf.writeInt(12);
		/**
		 * int4���ֽ�
		 * �÷�����ײ㻹��ͨ��writeʵ��һ���ֽ�д������
		 * */ 
		System.out.println(raf.getFilePointer());

		//д�ַ���
		byte[] b = "�й�".getBytes("GBK");
		raf.write(b);
		//���ж�����ʱ  Ҫ��pointָ��ָ��0
		raf.seek(0);
	
		byte[] c = new byte[(int)raf.length()];
		//�����ݶ�������c
		raf.read(c);
		String str = new String(c,"GBK");
		System.out.println(str);
		for (byte c2 : c) {
			System.out.print(c2+" ");
		}
	}

}
