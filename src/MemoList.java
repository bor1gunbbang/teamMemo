import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                    //조회
            case 3:
                    //수정
            case 4:
                    //삭제
            case 5:
                   System.exit(0); //종료
        }
    }





public void editor(){
    LocalDateTime lt = LocalDateTime.now();
    String time = lt.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
    //조회 메서드
    System.out.println("변경할 메모의 번호를 선택하세요 \n_>");
        int choicnumber = scan.nextInt();
    System.out.println(writeMemo.get(choicnumber - 1).getPostNumber() +
            "번 메모를 수정하시겠습니까? 작성자 : " + writeMemo.get(choicnumber - 1).getName() +
            "\n y/n_>");
        String yorno = scan.nextLine();
        if (yorno.equals("y")){
            System.out.println("암호를 입력하세요");
            String  psm = scan.nextLine();
            if (writeMemo.get(choicnumber-1).getPsw().equals(psm)) {
                System.out.println("수정할 메모를 입력하세요 \n_>");
                String editmemo = scan.nextLine();
                writeMemo.get(choicnumber-1).setMemoField(editmemo);
                writeMemo.get(choicnumber-1).setTime(time);
                System.out.println("메모가 수정되었습니다. :" +
                        writeMemo.get(choicnumber-1).getTime() + "에 수정되었습니다.");
            }
        }else if (yorno.equals("n")){
            // 처음화면메서드
        }


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
        sb.append("123");
        System.out.println(sb.toString());

    }
}
