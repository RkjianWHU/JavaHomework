package HomeWork02;

import java.security.KeyStore;
import java.util.function.DoubleToIntFunction;

public class ProgramStructure {
    /**
     * 矩阵求和方法
     * @param array01
     * @param array02
     */
    public void sumArray(int array01[][], int array02[][]){
        int sumarray[][];
        sumarray = new int[3][3];
        for (int Index01=0; Index01<3; Index01++){
            for (int Index02=0; Index02<3; Index02++){
                sumarray[Index01][Index02]=array01[Index01][Index02]+array02[Index01][Index02];
            }
        }
        for (int Index01=0; Index01<3; Index01++){
            for (int Index02=0; Index02<3; Index02++){
                System.out.print(" ["+sumarray[Index01][Index02]+"] ");
            }System.out.println();
        }
    }
    public void proArray(int array01[][], int array02[][]){
        int proarray[][];
        proarray = new int[3][3];
        for (int Index01=0; Index01<3; Index01++){
            for (int Index02=0; Index02<3; Index02++){
                for (int Index03=0; Index03<3; Index03++){
                    proarray[Index01][Index02]+=array01[Index01][Index03]*array02[Index03][Index02];
                }
            }
        }
        for (int Index01=0; Index01<3; Index01++){
            for (int Index02=0; Index02<3; Index02++){
                System.out.print(" ["+proarray[Index01][Index02]+"] ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        /**
         * 1~100以内的奇数和
         */
        int oddNumber = 0;
        for (int Index = 0; Index <=100; Index++){
            if (Index%2==1) oddNumber+=Index;
        }
        System.out.println("1~100以内的奇数和为：\n"+oddNumber);
        /**
         * 1~100以内7的倍数及其个数及其总和
         */
        int conter = 0;//设置计数器
        int summation=0;
        for (int Index = 0; Index<=100; Index++){
            if (Index%7==0&&Index!=0){conter++;summation+=Index;}
        }
        System.out.println("1~100以7的倍数的个数为：\n"+conter);
        System.out.println("1~100以7的倍数的和为：\n"+summation);
        /**
         * 输出水仙花数
         */
        int unitsdigit;//个位数
        int tensdigit;//十位数
        int hundredsdigit;//百位数
        System.out.println("输出水仙花数:");
        for (int Index = 100; Index< 1000; Index++){
           unitsdigit = Index%10;
           tensdigit = (Index/10)%10;
           hundredsdigit = Index/100;
           int narcissisticnum = unitsdigit*unitsdigit*unitsdigit
                   +tensdigit*tensdigit*tensdigit
                   +hundredsdigit*hundredsdigit*hundredsdigit;
           if(Index == narcissisticnum) System.out.println(narcissisticnum);
        }
        /**
         * 数组运算
         */
        int arrayC[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arrayD[][] = {{2,2,2},{1,1,1},{3,3,3}};
        System.out.println("矩阵C");
        for (int Index01=0; Index01<3; Index01++){
            for (int Index02=0; Index02<3; Index02++){
                System.out.print("["+arrayC[Index01][Index02]+"]");
            }System.out.println();
        }
        System.out.println("矩阵D");
        for (int Index01=0; Index01<3; Index01++){
            for (int Index02=0; Index02<3; Index02++){
                System.out.print("["+arrayD[Index01][Index02]+"] ");
            }System.out.println();
        }
        ProgramStructure programStructure01 = new ProgramStructure();
        System.out.println("矩阵相加：");
        programStructure01.sumArray(arrayC,arrayD);
        System.out.println("矩阵相乘：");
        programStructure01.proArray(arrayC,arrayD);
        }


    }

