package cn.itzhouq.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author itzhouq
 * @date 6/3/22 07:57
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小付哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
