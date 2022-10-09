package HomeWork02;

public class YanghuiTriangle {
    public static void main(String[] args) {
        for (int index = 1; index<=10; index++){
            int arr[] = new int[index];
            for (int index01=0; index01<index; index01++){
                if (index01==0) arr[index01]=1;
                else {
                    int denominator = 1;
                    int molecular = 1;
                    for (int index02 = index01;index02>0;index02--){denominator*=index02;}
                    for (int index03 = index-1; index03>(index-index01-1);index03--){molecular*=index03;}
                    arr[index01] = molecular/denominator;
                }
            }
            for (int Index=0; Index<arr.length; Index++) {
                System.out.print("[" + arr[Index] + "]");
            }System.out.println();
        }
    }
}
