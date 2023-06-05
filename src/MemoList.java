import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoList {
    private List<pswMemo> writeMemo = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int postNumber = 0;

    //입력
    //조회
    //수정
    //삭제
    public void removeMemo() {
        //조회();
        System.out.println("삭제할 글 번호를 입력하세요.");
        int choice = scan.nextInt();
        scan.nextLine();
        if (!(choice < writeMemo.size() && choice >= 0)) {
            System.out.println("선택하신 글이 존재하지 않습니다.");
            removeMemo();
            return;
        }
        System.out.println("비밀번호를 입력하세요.");
        String psw2 = scan.nextLine();
        if (writeMemo.get(choice - 1).psw.equals(psw2)) {
            writeMemo.remove(choice - 1);
            System.out.println(choice + "번째 글을 삭제하였습니다.");
            screen();
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
            screen();
        }

    }
    //종료

    public void choiceNumber() {
        screen();
        int number = scan.nextInt();
        switch (number) {
            case 1:
                //입력
            case 2:
                //조회
            case 3:
                //수정
            case 4:
                removeMemo(); //삭제
                break;
            case 5:
                System.exit(0); //종료
        }
    }


    public void screen() {

        StringBuilder sb = new StringBuilder();
        sb.append("메모장");
        sb.append("1.입력");
        sb.append("2.조회");
        sb.append("3.수정");
        sb.append("4.삭제");
        sb.append("5.종료");
        sb.append("원하는 메뉴의 숫자를 입력하세요_>");
        System.out.println(sb.toString());

    }
}
