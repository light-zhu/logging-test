import org.apache.log4j.Logger;

/**
 * <p>Title:Log4jMain</p>
 * <p>Description: </p>
 *
 * @author zhuxl
 * @version v1.0
 * @date 2019/7/29 14:42
 */
public class Log4jMain {

    public static final Logger log = Logger.getLogger(Log4jMain.class);

    public static void main(String[] args) {
        log.error("print error Message");
        log.debug("print debug Message");
        log.info("print info message");
    }
}
