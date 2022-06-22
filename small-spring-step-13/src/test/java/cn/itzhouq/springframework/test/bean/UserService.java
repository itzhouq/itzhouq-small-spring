package cn.itzhouq.springframework.test.bean;

import cn.itzhouq.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author itzhouq
 * @date 6/13/22 07:25
 */
@Component("userService")
public class UserService implements IUserService {

    private String token;

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小付哥，100001，深圳";
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户： " + userName + "success!";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserService#token = { " + token + " }";
    }
}
