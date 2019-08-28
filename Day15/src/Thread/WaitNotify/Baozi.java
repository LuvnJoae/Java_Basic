package Thread.WaitNotify;

public class Baozi {
    private String pier;
    private String xianer;
    boolean flag = false;

    public Baozi() {
    }

    public Baozi(String pier, String xianer, boolean flag) {
        this.pier = pier;
        this.xianer = xianer;
        this.flag = flag;
    }

    public String getPier() {
        return pier;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public String getXianer() {
        return xianer;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
