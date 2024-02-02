package kodlamaioweb.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String logMessage) {
		System.out.println("DatabaseLogger : İşlem loglandı. " + logMessage);
	}

}
