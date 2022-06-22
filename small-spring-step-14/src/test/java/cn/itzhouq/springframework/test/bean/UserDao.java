package cn.itzhouq.springframework.test.bean;

import cn.itzhouq.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author itzhouq
 * @date 6/15/22 08:12
 */
@Component
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥，北京，亦庄");
        hashMap.put("10002", "八杯水，上海，尖沙咀");
        hashMap.put("10003", "阿毛，香港，铜锣湾");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
