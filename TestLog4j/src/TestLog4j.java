
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
	            logger.trace("������Ϣ");
	            logger.debug("������Ϣ");
	            logger.info("�����Ϣ");
	            logger.warn("������Ϣ");
	            logger.error("������Ϣ");
	            logger.fatal("������Ϣ");
	        }
		
 
    }
}
