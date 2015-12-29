package com.IO.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream�൥�ֽڶ�ȡ�ļ�  �� �����ֽڴ����ļ�
 * */
public class FileInputStreamTest {
	
	/**
	 * ���ֽڶ�ȡ
	 * ��ʮ�����ƴ�ӡ��
	 * */
	public static void readByByte(String filename) throws IOException {
		//ͨ�������ļ�·��   ����FileInputStream����
		FileInputStream fis = new FileInputStream(filename); 
		
		int b = 0;
		//read����ÿ��ֻ��ȡһ���ֽ�  �÷�����һ�������ֽ� ��ȡ���ļ�ĩβ����-1   
		while((b=fis.read())!=-1){
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		fis.close();
	}
	
	/**
	 * ������ȡ1
	 * �÷������趨���byte�������һ������Ҫ��ȡ���ֽ���
	 * read(byte[] a)����������ȡ��������   ���ص��Ƕ�ȡ�������е��ֽ�����
	 * @throws IOException 
	 * */
	public static void readByByteGroup1(String filename) throws IOException{
		FileInputStream fis = new FileInputStream(filename);
		
		//�������һ���Խ��ļ��������ݶ�ȡ������Ϊ20*1024��������   
		byte[] buf = new byte[20*1024];
		//len�洢��ȡ���ֽ�����
		int len = fis.read(buf);
		//���
		for (int i=0;i<len;i++) {
			System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
		}
		fis.close();
	}
	
	/**
	 * ѭ��������ȡ
	 * read(byte[] a ,int off,int len)�÷�������off��ʼ����ʼ ����Ϊlen��ȡ��a������  ���ض��뵽������ֽ�����
	 * �����Ϊ�����ļ�ĩβ����-1 
	 * */
	public static void readByByteGroup2(String filename) throws IOException{
		FileInputStream fis = new FileInputStream(filename);
		byte[] buf = new byte[8*1024];
		
		//����ÿ��������ȡ���ֽ�����
		int len = 0;
		
		while((len=fis.read(buf, 0, buf.length))!=-1){
			for(int i=0;i<len;i++){
				System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
			}
		}
		fis.close();
	}
	
	
	//����  �Ƚ� ���ֽڶ�ȡ��������ȡ��Ч��
	public static void main(String[] args) throws IOException {
		readByByte("test.txt");
		System.out.println("\n"+"--------------------------------------------");
		readByByteGroup1("test.txt");
		System.out.println("\n"+"--------------------------------------------");
		readByByteGroup2("test.txt");
	}

}
