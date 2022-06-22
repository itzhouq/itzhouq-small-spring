package cn.itzhouq.springframework.test;


import cn.itzhouq.springframework.context.support.ClassPathXmlApplicationContext;
import cn.itzhouq.springframework.test.bean.Husband;
import cn.itzhouq.springframework.test.bean.Wife;
import org.junit.Test;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class ApiTest {

    @Test
    public void test_circular() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println("老公的媳妇：" + husband.queryWife());
        System.out.println("媳妇的老公：" + wife.queryHusband());
    }

}
