package cn.itzhouq.springframework.context.event;

/**
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 *
 * @author itzhouq
 * @date 6/12/22 10:17
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
