
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        System.out.print("자연수 n을 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Strategy st= new Methood_1();
        System.out.println(st.meth(input));
    }
}