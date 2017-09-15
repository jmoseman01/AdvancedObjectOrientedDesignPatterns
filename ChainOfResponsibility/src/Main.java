
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger loggerChain = getChainOfLoggers();
		
	      loggerChain.logMessage(AbstractLogger.INFO, 
	    	         "This is an information.");

	    	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	    	         "This is an debug level information.");

	    	      loggerChain.logMessage(AbstractLogger.ERROR, 
	    	         "This is an error information.");
	}

	private static AbstractLogger getChainOfLoggers() {
		// TODO Auto-generated method stub
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.DEBUG);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

}
