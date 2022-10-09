package HomeWork03;

import java.util.Scanner;

/**
   *  @ClassName CharacterString
   *  @Description    字符串作业与复习
   *  @author    Rkjian 2021302111168@whu.edu.cn
   *  @version    1.0
   *  @Date   2022-10-03 21:48
   * */

public class CharacterString {
    public static void main(String[] args) {
     //判断是否为回文
        Scanner stringInput = new Scanner(System.in);
        System.out.println("please input any string:");
        String palindrome = stringInput.nextLine();
        StringBuffer newpalindrome = new StringBuffer();
        for (int index=palindrome.length()-1; index>=0; index--) {
            newpalindrome.append(palindrome.charAt(index));
        }
        boolean palin = false;
        for (int index=0; index<palindrome.length(); index++){
            if (palindrome.charAt(index)==newpalindrome.charAt(index))  palin=true;
            else palin=false;
        }
        if (palin) System.out.println("输入的的字符串："+palindrome+"是回文");
        else System.out.println("输入的的字符串："+palindrome+"不是回文");

        //查找字符
        System.out.println("请输入字符串：");
        String longString = stringInput.nextLine();
        System.out.println("请输入需要查找的字符：");
        char  findChar= (stringInput.nextLine()).charAt(0);
        int lastPosion = 0;
        for (int index=0; index<longString.length(); index++){
            if (findChar==longString.charAt(index)) lastPosion=index+1;
        }
        if (lastPosion==0) System.out.println("Not Found!");
        else System.out.println(findChar+"最后出现在"+longString+"的"+lastPosion+"位");

        //进制转换
        System.out.println("请输入16进制数：");
        String hexNumber = stringInput.nextLine();
        int decNumber = Integer.parseInt(hexNumber,16);
        System.out.println("转换成10进制数为："+decNumber);
    }
}
