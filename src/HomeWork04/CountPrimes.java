package HomeWork04;

import java.util.Scanner;

public class CountPrimes {
     /** 
       *  @ClassName CountPrimes
       *  @Description  求质数-穷举法
       *  @author    Rkjian 2021302111168@whu.edu.cn       
       *  @version    1.0  
       *  @Date   2022-10-05 17:50        
       * */
     private void countPrimes(int num){
         /**
          * @Title countPrimes
          * @Description 判断参数是否为素数并找出其以内的所有素数，用数组输出
          * @author Rkjian  2021302111168@whu.edu.cn
          * @param num
          * @return void
          */
         //考虑2以上的数字
         if (num<2) System.out.println("不是素数");
         else {
             int primes[] = new int[num];
             int counter = 0;
             boolean flag=true;
             for (int index=2; index<=num; index++) {
                  flag=true;
                 for (int index01=2; index01<index;index01++) {
                     if (index%index01==0){
                         flag = false;
                         break;
                     }
                 }if (flag) {
                     primes[counter]=index;
                     counter++;
                 }
             }
             System.out.println(num+"之内有"+counter+"个素数");
             for (int index=0; index<counter; index++){System.out.print(primes[index]+";");}

         }
     }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间
        CountPrimes countprimes = new CountPrimes();
        //Scanner intInput = new Scanner(System.in);
       // System.out.println("please input your number:");
        int num = 200000;// intInput.nextInt();
        countprimes.countPrimes(num);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println('\n'+"程序运行时间： "+(endTime-startTime)+"ms");
    }
}
