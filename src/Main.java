import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
class Quote{
    int id;
    String wise;
    String author;

    Quote(int id, String wise, String author) {
        this.id = id;
        this.wise = wise;
        this.author = author;
    }
}

class App{
    private Quote[] quotes = new Quote[100];
    private int count = 0;

    public void run(){
        System.out.println("== 명언 앱 ==");
        Scanner scanner = new Scanner(System.in);

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

                quotes[count] = new Quote(count + 1, wise, author);

                System.out.println((count + 1) + "번 명언이 등록되었습니다.");
                count++;
            }else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = count - 1; i >= 0; i--) {
                    Quote quote = quotes[i];
                    System.out.println(quote.id + " / " + quote.author + " / " + quote.wise);
                }
            }else if (cmd.startsWith("삭제?id=")){
                String idStr = cmd.substring(6);
                int id = Integer.parseInt(idStr);
                if (id > 0 && id <= count) {
                    for (int i = id - 1; i < count - 1; i++) {
                        quotes[i] = quotes[i + 1];
                    }
                    quotes[count - 1] = null;
                    count--;
                    System.out.println(id + "번 명언이 삭제되었습니다.");
                } else {
                    System.out.println(id + "번 명언은 존재하지 않습니다.");
                }
            }
        }
        scanner.close();
    }

}