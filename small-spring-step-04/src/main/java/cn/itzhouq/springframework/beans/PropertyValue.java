package cn.itzhouq.springframework.beans;

/**
 * @author itzhouq
 * @date 6/3/22 07:36
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
