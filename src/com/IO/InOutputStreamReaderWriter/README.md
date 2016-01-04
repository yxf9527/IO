字符流每次操作一个字符 ，虽然底层依然是一个字节操作

文本和文件：
Java文本（char）是16位的无符号整数，是unicode字符编码，
文件是byte byte byte。。的序列集合
文本文件就是文本按照某种编码方式序列化为byte byte byte的集合

字符流操作的基础类是Reader和Writer
inputStreamReader和outputStreamWriter分别做了继承和具体实现

