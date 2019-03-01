public class shuixinhua {
    public static void main(String[] args) {
        for (int i = 100;i<1000;i++){
            int a = i % 10;
            int b = (i%100)/10;
            int c = i/100;
            int a3 = a*a*a;
            int b3 = b*b*b;
            int c3 = c*c*c;
            if((a3+b3+c3)==i){
                System.out.println(i);
            }
        }
    }
}
