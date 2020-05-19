import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 和Java标准库提供的日志不同，Commons Logging是一个第三方日志库，它是由Apache创建的日志模块。
 *
 * Commons Logging的特色是，它可以挂接不同的日志系统，并通过配置文件指定挂接的日志系统。默认情况下，Commons Loggin自动搜索并使用Log4j（Log4j是另一个流行的日志系统），如果没有找到Log4j，再使用JDK Logging。
 *
 * 使用Commons Logging只需要和两个类打交道，并且只有两步：
 *
 * 第一步，通过LogFactory获取Log类的实例； 第二步，使用Log实例的方法打日志。
 */
public class CommonsLoggingDemo {
    /**
     * The Log 2.
     */
    static  Log log2 = LogFactory.getLog(CommonsLoggingDemo.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonsLoggingDemo.class);
        log.info("start...");
        log.warn("end.");

        log2.info("log2.info");
        try {
            int i1 = 2 - 2;
            int i=3/ i1;
        } catch (Exception e) {
            log2.error("Exception:",e);
        }

    }
}
