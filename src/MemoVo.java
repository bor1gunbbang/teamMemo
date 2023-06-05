package teamMemo.src;

public class MemoVo {
    int postNumber;
    String name;
    String memoField;
    String time;

    public MemoVo(int postNumber, String name, String memoField, String time) {
        this.postNumber = postNumber;
        this.name = name;
        this.memoField = memoField;
        this.time = time;
    }
}
