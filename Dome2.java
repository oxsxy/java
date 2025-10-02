import java.util.Scanner;
public class Dome2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int m = sc.nextInt();
        if (m > 100){
            System.out.println("去吃酒店");
        }else{
            System.out.println("去吃沙县小吃");
        }
        
        sc.close();
        
    }
}
