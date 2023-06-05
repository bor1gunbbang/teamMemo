import java.awt.color.ICC_ColorSpace;

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

    public int getPostNumber() {
        return postNumber;
    }


    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMemoField() {
        return memoField;
    }

    public void setMemoField(String memoField) {
        this.memoField = memoField;
    }
}
