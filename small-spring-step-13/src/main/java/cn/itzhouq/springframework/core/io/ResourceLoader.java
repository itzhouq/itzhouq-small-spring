package cn.itzhouq.springframework.core.io;

/**
 * @author itzhouq
 * @date 6/3/22 10:02
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
