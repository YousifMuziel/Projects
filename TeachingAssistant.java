public class TeachingAssistant implements ProfListener {
    private String name;

    public TeachingAssistant(String name) {
        this.name = name;
    }

    @Override
    public void midtermAnnounced(ProfEvent event) {
        System.out.println(name + " is proctoring the midterm: " + event.getMidtermDetails());
    }

    @Override
    public void midtermPostponed(ProfEvent event) {
        System.out.println(name + " is rescheduling the midterm: " + event.getMidtermDetails());
    }
}
