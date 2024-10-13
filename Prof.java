import java.util.ArrayList;
import java.util.List;

public class Prof {
    private String name;
    private List<ProfListener> profListeners = new ArrayList<>();

    public Prof(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProfListener(ProfListener listener) {
        profListeners.add(listener);
    }

    public void removeProfListener(ProfListener listener) {
        profListeners.remove(listener);
    }

    public void announceMidterm(String details) {
        ProfEvent event = new ProfEvent(this, details); // Correct instantiation
        for (ProfListener listener : profListeners) {
            listener.midtermAnnounced(event);
        }
    }

    public void postponeMidterm(String details) {
        ProfEvent event = new ProfEvent(this, details); // Correct instantiation
        for (ProfListener listener : profListeners) {
            listener.midtermPostponed(event);
        }
    }
}
