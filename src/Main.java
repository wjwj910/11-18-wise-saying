import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App{
    public void run(){
        System.out.println("== 명언 앱 ==");
        Scanner scanner = new Scanner(System.in);
        int id = 0;

        while (true){
            System.out.print("명령) ");
            String cmd = scanner.nextLine();
            if(cmd.equals("종료")){
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String wise = scanner.nextLine();

                System.out.print("작가 : ");
                String author = scanner.nextLine();

                System.out.println((++id) + "번 명언이 등록되었습니다.");
            }

        }
        scanner.close();
    }
}