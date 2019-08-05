
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
	 static Logger logger=Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("D:/2019summer_java/TestLog4j/TestLog4j/src/log4j.xml");
//        System.out.println("trace");
//        System.out.println("debug");
//        System.out.println("info");
//        System.out.println("warn");
//        System.out.println("error");
//        System.out.println("fatal");
		  for (int i = 0; i < 5000; i++) {
	            logger.trace("跟踪信息");
	            logger.debug("调试信息");
	            logger.info("输出信息");
	            logger.warn("警告信息");
	            logger.error("错误信息");
	            logger.fatal("致命信息");
	        }
		
 
    }
}
