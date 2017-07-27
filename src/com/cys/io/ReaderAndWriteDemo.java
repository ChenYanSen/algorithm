package com.cys.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ReaderAndWriteDemo {
    public static void main(String[] args) throws IOException {
     //createFile();
        readFile("demo.txt");
    }
    public static void createFile() throws IOException {
        FileWriter fileWriter=new FileWriter("demo.txt");
        fileWriter.write("abcdef哈哈");
        fileWriter.flush();
        fileWriter.close();
    }
    public static void readFile(String string) throws IOException {
        //读必须保证文件存在
        FileReader fileReader=new FileReader(string);
        IntBuffer  intBuffer=IntBuffer.allocate(10);
        ByteBuffer  byteBuffer=ByteBuffer.allocateDirect(20);
        char[]buf=new char[1024];
        int len=0;
        while ((len=fileReader.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        fileReader.close();
    }
}
