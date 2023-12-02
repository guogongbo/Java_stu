package IO流;

import java.io.*;

public class 字符和字节流 {
    public static void main(String[] args) {
        //-------------先文件字节
        try (
            FileInputStream fileInputStream =new FileInputStream(new File("文件路径"));
            FileOutputStream fileOutputStream =new FileOutputStream("复制文件路径"))
            //也可以写成FileInputStream fileInputStream =new FileInputStream("文件路径));)
        {
            byte []buf =new byte[1024];//buf用来存每一次读的东西//byte是字节流
            int len=0;
            while ((len=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,len);
            }

        } catch (Exception e) {
            System.out.println("err");
        }
        //-------------文件字符，基本一样，对照差别
        try (
                FileReader fileReader=new FileReader("文件路径");
                FileWriter fileWriter =new FileWriter("文件复制路径"))
        {
            char []buf =new char[1024];//buf用来存每一次读的东西//char是字节流
            int len=0;
            while ((len=fileReader.read(buf))!=-1){
               fileWriter.write(buf,0,len);
            }

        } catch (Exception e) {
            System.out.println("err");
        }
        //-------------------缓冲字节
        try (
                BufferedInputStream bufferedInputStream =new BufferedInputStream(new FileInputStream(""));
                BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(new FileOutputStream("")))
        {
            byte []buf =new byte[1024];//buf用来存每一次读的东西//byte是字节流
            int len=0;
            while ((len=bufferedInputStream.read(buf))!=-1){
                bufferedOutputStream.write(buf,0,len);
            }

        } catch (Exception e) {
            System.out.println("err");
        }
        //-----------同理缓冲字符，懒得写
    }
}
