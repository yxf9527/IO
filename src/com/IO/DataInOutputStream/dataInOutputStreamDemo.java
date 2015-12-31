package com.IO.DataInOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 输出流向文件中写数据  后  输入流读取数据
 * */
public class dataInOutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		/**
		 * 构造DataOutputStream对象需要传递一个outputStream抽象类的对象参数
		 * 以此知道 dataOutputStream是在FileOutputStream类的基础上做了修改
		 * */
		String path = "files/demo.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
		
		//DataOutputStream类提供特定的一次性写方法   避免了一次一个字节的写  但是其还是通过一次一个字节实现的
		dos.writeInt(12);
		dos.writeBoolean(true);
		//以utf-8
		dos.writeUTF("中国");
		//以Java的默认编码方式写utf-16be
		dos.writeChars("汇");
		
		//关闭资源
		dos.close();
		System.out.println("以上操作写");
		System.out.println("---------------------------------------------------------");
		System.out.println("以下操作读");
		
		DataInputStream dis = new DataInputStream(new FileInputStream(path));
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		dis.close();
	}

}
