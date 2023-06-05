package teamMemo.src;

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
    //종료

    public void choiceNumber(){
        screen();
        int number = scan.nextInt();
        switch (number){
            case 1:
                    //입력
            case 2:
                showMemoList();
                    //조회
            case 3:
                    //수정
            case 4:
                    //삭제
            case 5:
                   System.exit(0); //종료
        }
    }

    public void showMemoList() {
        System.out.println(writeMemo);

        int index = writeMemo.size();
        for (int i = writeMemo.size() - 1; i >= 0; i--) {
            pswMemo memo = writeMemo.get(i);
            System.out.println(memo.getPostNumber() + ". " + memo.getName() + " | " +
                    memo.getMemoField() + " | " + memo.getTime());
            index--;
        }

        choiceNumber();

    }






    public void screen(){

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
