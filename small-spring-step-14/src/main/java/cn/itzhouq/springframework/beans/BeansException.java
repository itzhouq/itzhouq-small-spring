package cn.itzhouq.springframework.beans;

/**
 * @author itzhouq
 * @date 5/27/22 09:24
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
