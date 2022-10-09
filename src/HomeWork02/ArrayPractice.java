package HomeWork02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
   *  @ClassName ArrayPractice
   *  @Description
   *  @author    Rkjian 2021302111168@whu.edu.cn
   *  @version    1.0
   *  @Date   2022-09-21 18:13
   * */

public class ArrayPractice {
     int capacity = 10;//数组容量
     int  length = 0;//存放的数据长度
    public void sortArrary(int arr[]){
        /**
         * @Title rankArrary
         * @Description 数组排序方法
         * @author Rkjian  2021302111168@whu.edu.cn
         * @param arr
         * @return void
         */
        //@Date   2022-09-21 18:17 今日学习所知数组也是相当于创建的对象，其具有属性length表示容量
        // 故删去原本方法中的需要传递的capacity
        for (int Index01=0; Index01< arr.length  ; Index01++){
            for (int Index02=Index01; Index02<arr.length; Index02++){
                if (arr[Index01]>=arr[Index02]){
                    int swap = arr[Index01];
                    arr[Index01] = arr[Index02];
                    arr[Index02] = swap;
                }
            }
        }
    }
    public int[] addelement(int arr[], int adde, int length){
        /**
         * @Title addelement
         * @Description 插入一个值
         * @author Rkjian  2021302111168@whu.edu.cn
         * @param arr
         * @param adde 插入的值
         * @param length  已有的容量
         * @return void
         */
        boolean addsucceess = false;
        if (length >= arr.length){
           int newarr[] = new int[2*arr.length];
           for (int Index=0; Index<arr.length; Index++){
               newarr[Index]=arr[Index];
           }
            arr = newarr;
        }
        for (int Index=0; Index < length; Index++){
            if (adde<=arr[Index]){
                for (int Index01=length; Index01>Index; Index01--){
                    arr[Index01] = arr[Index01-1];
                }
                arr[Index] = adde;
                addsucceess = true;
                break;
            }
        }
       if (!addsucceess) arr[length]=adde;
        length++;
        System.out.println("插入成功");
        return arr;
    }
    public static void main(String[] args) {
        ArrayPractice arrary01 = new ArrayPractice();
        int randarray[] = new int[arrary01.capacity];
        Random random = new Random();
        for (int Index=0; Index<arrary01.capacity; Index++){
            randarray[Index] = random.nextInt(90)+10;
            arrary01.length++;
        }

        arrary01.sortArrary(randarray);
        //@Date   2022-09-21 18:18 Arrays类自带的的静态方法sort（），可直接用来排序
        //Arrays.sort(randarray);
        for (int Index=0; Index<arrary01.length; Index++) {
            System.out.print("[" + randarray[Index] + "]");
        }
        System.out.println('\n'+"请输入要插入的数字：");
        Scanner cin=new Scanner(System.in);
        int addnumber=cin.nextInt();//输入一个整数
        while (addnumber<10||addnumber>99){
            System.out.println("请输入10~99之间的数字：");
            addnumber = cin.nextInt();
        }

        randarray = arrary01.addelement(randarray,addnumber,arrary01.length);
        arrary01.length++;
        for (int Index=0; Index<arrary01.length; Index++) {
            System.out.print("[" + randarray[Index] + "]");
        }
    }

}
