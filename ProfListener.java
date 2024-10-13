import java.util.EventListener;

public interface ProfListener extends EventListener {
    void midtermAnnounced(ProfEvent event);
    void midtermPostponed(ProfEvent event);
}
