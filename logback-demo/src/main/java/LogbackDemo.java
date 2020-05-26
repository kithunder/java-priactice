import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
   static final Logger logger = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        logger.info("My name is {}, and I like {}","Rex","Java");
        logger.info("My name is {}, and I like {}","Rex","Java");
        logger.info("My name is {}, and I like {}","Rex","Java");
        logger.info("My name is {}, and I like {}","Rex","Java");
        logger.info("My name is {}, and I like {}","Rex","Java");
    }
}
