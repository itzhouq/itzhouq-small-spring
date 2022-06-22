package cn.itzhouq.springframework.test.bean;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class UserService {

    private String uid;

    private UserDao userDao;


    public void queryUserInfo(){
        System.out.println("查询用户信息" + userDao.queryUserName(uid));
    }


    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(uid);
        return sb.toString();
    }
}
