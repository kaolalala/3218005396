package com.kaola;

import org.junit.Test;

import com.kaola.util.FileUtil;
import com.kaola.util.TokenizerUtil;

import java.util.List;
import java.util.Map;

/**
 * @ClassNamemain
 * @Description
 * @Author Free
 * @Date2020/9/22 11:39
 * @Version V1.0
 **/

public class MainStart {
    @Test
     public void sameTest(){
        String path = "D:\\作业\\软工作业\\orig_0.8_add.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void addTest(){
        String path = "D:\\作业\\软工作业\\orig.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void delTest(){
        String path = "D:\\作业\\软工作业\\orig.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_del.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void disTest(){
        String path = "D:\\作业\\软工作业\\orig.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void dis10Test(){
        String path = "D:\\作业\\软工作业\\orig.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void dis15Test(){
        String path = "D:\\作业\\软工作业\\orig.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void Test(){
        String path = "D:\\作业\\软工作业\\orig.txt";
        String path2 = "D:\\作业\\软工作业\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void NullpointTest(){
        String path = "";
        String path2 = "";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void DIYpointTest(){
        String path = "D:\\作业\\软工作业\\1000.txt";
        String path2 = "D:\\作业\\软工作业\\4.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\作业\\软工作业\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
}
