package com.IO.FileInOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * ����FileInputStream������Դ���file����Ҳ���Դ����ļ�Ŀ¼ ��
		 * ֻͨ��һ�������������ʱ  ����ļ�������  ��ֱ�Ӵ����ļ�  ���������ֱ��ɾ���ٴ���
		 * �������ɾ��ԭ�����ļ�����  ��ô����ͨ�����ݵڶ�������true��׷���ļ�����
		 * */
		FileOutputStream fos = new FileOutputStream("files/test.txt",true);
		//���ļ���дint������  ��Ҫд�Ĵ�   
		int a = 100;
		fos.write(a >>> 24);//��߰�λ
		fos.write(a >>> 16);
		fos.write(a >>> 8);
		fos.write(a);//����λ
		
		//���ļ�����д���ַ�
		String s = "�й�";
		byte[] by = s.getBytes();
		fos.write(by);
		
		fos.close();
	}
}
