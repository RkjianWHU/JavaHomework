package HomeWork04;

public class CountPrimes03 {
     /** 
       *  @ClassName CountPrimes03
       *  @Description  求质数-减少搜索空间-利用定理02     
       *  @author    Rkjian 2021302111168@whu.edu.cn       
       *  @version    1.0  
       *  @Date   2022-10-05 20:33        
       * */
     public void countPrimes(int num){
        /**
         * @Title countPrimes
         * @Description 只要尝试小于根号x的质数即可,而这些质数，恰好前面已经算出来了，已经存在res中
         * @author Rkjian  2021302111168@whu.edu.cn
         * @param num
         * @return void
         */   
         //考虑2以上的数字
         if (num<2) System.out.println("不是素数");
         else {
             int primes[] = new int[num];
             primes[0]=2;
             int counter = 0;
             boolean flag=true;
             for (int index=2; index<=num; index++) {
                 flag=true;
                 for (int index01=0; primes[index01]<=Math.sqrt(index);index01++) {
                     if (index%primes[index01]==0){
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
        CountPrimes03 countprimes = new CountPrimes03();
        //Scanner intInput = new Scanner(System.in);
        //System.out.println("please input your number:");
        int num =400000; //intInput.nextInt();
        countprimes.countPrimes(num);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println('\n'+"程序运行时间： "+(endTime-startTime)+"ms");
    }
}
