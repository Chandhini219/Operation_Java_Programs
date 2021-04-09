package File_Operations;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {

	static Logger logger=Logger.getLogger("Basic_Congiguration.class");



	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
	}

}
