package com.IO.DataInOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���writeChars��writeUTF����������
 * **/
public class writeCharsAndUTF {
	
	public static void main(String[] args) throws IOException {
		String path = "demo.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
		String s = "this is utf-16be";
		int len = s.length();
		dos.writeInt(len);
		dos.writeChars("this is utf-16be");
		dos.writeUTF("this is utf-8");
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream(path));
		
		/***
		 * ��ȡchars
		 * �ȶ�ȡд��chars�ĳ���
		 */
		len = dis.readInt();
		for(int i=0;i<len;i++){
			System.out.print(dis.readChar());
		}
		System.out.println();
		System.out.println(dis.readUTF());
		dis.close();
	}

}
