package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.regex.Pattern;

public class FilterWordsHandler extends Handler {
	private final List<String> bannedWords;
    private final Handler delegate;

    public FilterWordsHandler(List<String> bannedWords, Handler delegate) {
        this.bannedWords = bannedWords;
        this.delegate = delegate;
    }

	
	public void publish(LogRecord record) {
		String msg = record.getMessage();
		this.bannedWords.stream()
		.forEach(w -> msg.replaceAll("(?i)\\b" + Pattern.quote(w) + "\\b", "***"));
		LogRecord filteredRecord = new LogRecord(record.getLevel(), msg);
		filteredRecord.setLoggerName(record.getLoggerName());
		filteredRecord.setMillis(record.getMillis());
		filteredRecord.setThrown(record.getThrown());
		filteredRecord.setSourceClassName(record.getSourceClassName());
		filteredRecord.setSourceMethodName(record.getSourceMethodName());
		delegate.publish(filteredRecord);
		
	}

	
	public void flush() {
		this.delegate.flush();
		
	}

	
	public void close() throws SecurityException {
		this.delegate.close();
		
	}
    
    

}
