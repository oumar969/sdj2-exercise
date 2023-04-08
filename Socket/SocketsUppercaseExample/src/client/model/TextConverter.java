package client.model;

import shared.transferobjects.LogEntry;
import shared.util.Subject;


import java.util.List;

public interface TextConverter extends Subject
{

    String toUppercase(String text);
    List<LogEntry> getLogs();

}


