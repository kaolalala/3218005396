package com.kaola;
import cn.hutool.core.io.file.FileReader;

/**
 * @ClassNamemain
 * @Description
 * @Author Kaola
 * @Date2020/9/20 11:40
 * @Version V1.0
 **/
public class main {
    public static void main(String[] args) {
        System.out.println("初始化仓库");
        //默认UTF-8编码，可以在构造中传入第二个参数做为编码
        FileReader fileReader = new FileReader("D:\\作业\\软工作业\\orig.txt");
        String result = fileReader.readString();
        System.out.println(result);

    }
}
