package client.network;

import shared.transferobjects.LogEntry;
import shared.util.Subject;


import java.util.List;

public interface Client extends Subject
{

    String toUppercase(String str);
    List<LogEntry> getLog();

    void startClient();
}
