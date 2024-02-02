package kodlamaioweb.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String logMessage) {
		System.out.println("FileLogger : İşlem loglandı. " + logMessage);
	}

}
