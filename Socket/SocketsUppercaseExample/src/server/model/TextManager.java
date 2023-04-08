package server.model;


import shared.transferobjects.LogEntry;
import shared.util.Subject;


import java.util.List;

public interface TextManager extends Subject
{

    String toUppercase(String str);
    List<LogEntry> getLog();
}
