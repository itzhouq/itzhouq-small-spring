package cn.itzhouq.springframework.test.bean;

/**
 * @author itzhouq
 * @date 6/13/22 07:24
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}
