package cn.itzhouq.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author itzhouq
 * @date 6/3/22 09:50
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
