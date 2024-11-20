import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run() {
        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        int lastId = 0;

        WiseSaying[] wiseSayings = new WiseSaying[100];

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                int id = ++lastId;

                WiseSaying wiseSaying = new WiseSaying(id, content, author);


                wiseSaying.id = id;
                wiseSaying.content = content;
                wiseSaying.author = author;

                wiseSayings[id] = new WiseSaying(lastId, content, author);

                System.out.println("%d번 명언이 등록되었습니다.".formatted(id));

            } else if(cmd.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i = lastId; i >= 0;i--){
                    WiseSaying wiseSaying = wiseSayings[i];
                    if(wiseSaying != null){
                        System.out.println(wiseSaying.id + " / " + wiseSaying.author + " / " + wiseSaying.content);
                    }
                }
            }
        }

        scanner.close();
    }
}

class WiseSaying {
    int id;
    String content;
    String author;

    public WiseSaying(int id, String content, String author){
        this.id = id;
        this.content = content;
        this.author = author;
    }
}