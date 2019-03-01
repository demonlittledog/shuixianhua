import java.util.Scanner;

public class fenjiezhiyinshu {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner s = new Scanner(System.in);
        int j = 0;
        int a = s.nextInt();
        for (int i =2;i<=a;i++){
           while(a%i ==0){
               System.out.println(i);
                j++;
                a=a/i;
            }
        }
    }
}
