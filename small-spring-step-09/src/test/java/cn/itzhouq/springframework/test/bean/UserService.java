package cn.itzhouq.springframework.test.bean;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.factory.BeanClassLoaderAware;
import cn.itzhouq.springframework.beans.factory.BeanFactory;
import cn.itzhouq.springframework.beans.factory.BeanFactoryAware;
import cn.itzhouq.springframework.beans.factory.BeanNameAware;
import cn.itzhouq.springframework.context.ApplicationContext;
import cn.itzhouq.springframework.context.ApplicationContextAware;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class UserService {

    private String uId;

    private String company;

    private String location;

    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

}
