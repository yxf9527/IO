package com.IO.encode;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class EncodeDemo {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "慕课ABC";
		byte[] b1 = str.getBytes();//转化成字节序列    是此项目当前默认的编码  gbk
		for (byte b : b1) {
			//将字符串转化成byte数组输出
//			System.out.print(b+" ");
			//将转化成的byte数转化成十六进制输出
			//gbk编码中文占用2个字节  英文占用一个字节
			System.out.print(Integer.toHexString(b & 0xff)+" ");
//			System.out.println();
		}
		System.out.println("\n"+"------------------------------------------------");
		//通过传递的编码方式utf-8参数  使得获取字符串转化为utf-8序列编码的字节序列
		byte[] b2 = str.getBytes("utf-8");
		for (byte b : b2) {
			//utf-8编码中3个字节存储一个中文  一个字节存储英文
			//System.out.print(b);
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
	}
	
	
	/**
	 * byte类型转化为十六进制显示 
	 * int入参   返回字符串   
	 * */
	@Test
	public void byte2Hex(){
		int a = 1234;
		byte b = 122;
		System.out.println(Integer.toHexString(a));//4d2
		System.out.println(Integer.toHexString(b));//7a
	}
	

}
