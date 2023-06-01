import java.util.Scanner;

class Player{
    private String name;

    public Player(String name){
        this.name = name;
    }

    void getWordFromUser(){


    }
    void checkSuccess(){

    }

}
public class Ch04_OpenChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참여하는 인원은 몇명입니까");
        int NumberOfPerson = scanner.nextInt();

        Player [] player = new Player[NumberOfPerson];

        for(int i = 0; i < player.length ; i++) {

            System.out.print("참가자의 이름을 입력하세요 >> ");
            String name = scanner.next();
            player[i] = new Player(name);
        }


    }

    void run(){
        System.out.println("시작하는 단어는 아버지입니다.");

    }
}
