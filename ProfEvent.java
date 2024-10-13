import java.util.EventObject;

public class ProfEvent extends EventObject {
    private String midtermDetails;

    public ProfEvent(Object source, String midtermDetails) {
        super(source);
        this.midtermDetails = midtermDetails;
    }

    public String getMidtermDetails() {
        return midtermDetails;
    }
}
