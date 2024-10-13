public class Student implements ProfListener {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void midtermAnnounced(ProfEvent event) {
        String profName = ((Prof) event.getSource()).getName();
        if (profName.equals("Dr. Bedawi")) {
            System.out.println(name + " is studying hard for Dr. Bedawi midterm: " + event.getMidtermDetails());
        } else {
            System.out.println(name + " is preparing for another professor's midterm: " + event.getMidtermDetails());
        }
    }

    @Override
    public void midtermPostponed(ProfEvent event) {
        System.out.println(name + " is happy that the midterm is postponed: " + event.getMidtermDetails());
    }
}
