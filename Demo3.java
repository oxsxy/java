import java.util.Scanner;
public class Demo3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要办理的业务：");
        int a = sc.nextInt();
        switch(a){
            case 1 :
            System.out.println("机票查询");
            break;
            case 2 :
            System.out.println("机票预订");
            break;
            case 3 :
            System.out.println("机票改签");
            break;
            default:
            System.out.println("退出服务");
            break;
            

        }
        sc.close();

    }
}