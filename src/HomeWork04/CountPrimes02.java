package HomeWork04;

import java.util.Scanner;

public class CountPrimes02 {
     /** 
       *  @ClassName CountPrimes02
       *  @Description       求质数-减少搜索空间-利用定理01
       *  @author    Rkjian 2021302111168@whu.edu.cn       
       *  @version    1.0  
       *  @Date   2022-10-05 18:45        
       * */
     private void countPrimes(int num){
        /**
         * @Title countPrimes
         * @Description 因为如果一个数是合数，那么它的最小质因数肯定小于等于它的平方根。
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
                 for (int index01=2; index01<=Math.sqrt(index);index01++) {
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
             //for (int index=0; index<counter; index++){System.out.print(primes[index]+";");}

         }
     }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间
        CountPrimes02 countprimes = new CountPrimes02();
        //Scanner intInput = new Scanner(System.in);
        //System.out.println("please input your number:");
        int num =400000; //intInput.nextInt();
        countprimes.countPrimes(num);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println('\n'+"程序运行时间： "+(endTime-startTime)+"ms");
    }
}
