package HomeWork04;

import java.util.Scanner;

public class PrimeFactorization {
     /**
       *  @ClassName PrimeFactorization
       *  @Description   质因数分解
       *  @author    Rkjian 2021302111168@whu.edu.cn
       *  @version    1.0
       *  @Date   2022-10-05 20:53
       * */
     private void Fatorization(int num) {
         /**
          * @Title Fatorization
          * @Description 先找到所输入数字前的所有素数，在从小到大开始尝试分解
          * @author Rkjian  2021302111168@whu.edu.cn
          * @param num
          * @return void
          */
         //先收集素数
         int primes[] = new int[num];
         primes[0] = 2;
         if (num < 2) System.out.println("不是素数");
         else {
             int counter = 0;
             boolean flag = true;
             for (int index = 2; index <= num; index++) {
                 flag = true;
                 for (int index01 = 0; primes[index01] <= Math.sqrt(index); index01++) {
                     if (index % primes[index01] == 0) {
                         flag = false;
                         break;
                     }
                 }
                 if (flag) {
                     primes[counter] = index;
                     counter++;
                 }
             }
         }
         //再进行分解
         for (int index = 0; primes[index] <= Math.sqrt(num); index++) {
             if (num % primes[index] == 0) {
                 System.out.println(num+"="+primes[index]+"*"+(num/primes[index]));
                 break;
             }
         }
     }
     public static void main(String[] args) {
         PrimeFactorization primeFactorization = new PrimeFactorization();
         Scanner intInput = new Scanner(System.in);
         System.out.println("please input your number:");
         int num =intInput.nextInt();
         primeFactorization.Fatorization(num);
     }
}
