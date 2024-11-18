import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(true){
            System.out.print("명령) ");
            input = sc.nextLine();

            if(input.equals("종료")){
                System.out.println("종료");
                break;
            }else if(input.equals("등록")){
                System.out.print("명언 : ");
                String wise_saying = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();
            }
        }
        sc.close();
    }
}