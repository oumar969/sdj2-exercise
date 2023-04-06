import java.beans.PropertyChangeListener;

public interface PropertyChangeSubject {
//man starter med interface klasse, for at difinere hvad der skal være metoder i klasserne.
    public void addPropertyChangeListener(String name, PropertyChangeListener listener);
    public void addPropertyChangeListener(PropertyChangeListener listener);
    public void removePropertyChangeListener(String name, PropertyChangeListener listener);
    public void removePropertyChangeListener(PropertyChangeListener listener);

}

