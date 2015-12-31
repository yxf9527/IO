package com.IO.DataInOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * ��������ļ���д����  ��  ��������ȡ����
 * */
public class dataInOutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		/**
		 * ����DataOutputStream������Ҫ����һ��outputStream������Ķ������
		 * �Դ�֪�� dataOutputStream����FileOutputStream��Ļ����������޸�
		 * */
		String path = "files/demo.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
		
		//DataOutputStream���ṩ�ض���һ����д����   ������һ��һ���ֽڵ�д  �����仹��ͨ��һ��һ���ֽ�ʵ�ֵ�
		dos.writeInt(12);
		dos.writeBoolean(true);
		//��utf-8
		dos.writeUTF("�й�");
		//��Java��Ĭ�ϱ��뷽ʽдutf-16be
		dos.writeChars("��");
		
		//�ر���Դ
		dos.close();
		System.out.println("���ϲ���д");
		System.out.println("---------------------------------------------------------");
		System.out.println("���²�����");
		
		DataInputStream dis = new DataInputStream(new FileInputStream(path));
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		dis.close();
	}

}
