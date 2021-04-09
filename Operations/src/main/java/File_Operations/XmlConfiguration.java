package File_Operations;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConfiguration {
      
	static Logger logger=Logger.getLogger("XmlConfiguration.class");
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is debug message--");
		logger.info("This is info message--");
		logger.warn("This is warning message--");
		logger.error("This is error message--");
		logger.fatal("This is fatal message--");
	}

}
