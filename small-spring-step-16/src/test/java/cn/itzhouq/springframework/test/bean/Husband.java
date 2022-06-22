package cn.itzhouq.springframework.test.bean;

/**
 * @author itzhouq
 * @date 6/19/22 10:24
 */
public class Husband {

    private Wife wife;

    public String queryWife() {
        return "Husband.wife";
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
