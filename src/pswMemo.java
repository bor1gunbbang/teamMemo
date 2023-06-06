package teamMemo.src;

public class pswMemo extends MemoVo{
    String psw;

    public String getPsw() {
        return psw;
    }

    public pswMemo(int postNumber, String name, String memoField, String time, String psw) {
        super(postNumber, name, memoField, time);
        this.psw = psw;
    }

}
