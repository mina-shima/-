import java.util.Scanner;

public class oturi {
    public static void main(String[] args) {
        int n,x,oturi;
        int[] maisuu=new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        n = sc.nextInt();
        System.out.print("x=");
        x=sc.nextInt();

        oturi=n-x;

        maisuu[0]=oturi/500;
        oturi=oturi%500;

        maisuu[1]=oturi/100;
        oturi=oturi%100;

        maisuu[2]=oturi/50;
        oturi=oturi%50;

        maisuu[3]=oturi/10;
        oturi=oturi%10;
        
        System.out.println("500円玉:"+maisuu[0]);
        System.out.println("100円玉:"+maisuu[1]);
        System.out.println("50円玉:"+maisuu[2]);
        System.out.println("10円玉:"+maisuu[3]);

        sc.close();
    }
}