public class Main {
    public static void main(String[] args) {
        Prof prof = new Prof("Dr. Bedawi");

        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");
        TeachingAssistant ta = new TeachingAssistant("TA");

        prof.addProfListener(student1);
        prof.addProfListener(student2);
        prof.addProfListener(ta);

        prof.announceMidterm("Midterm on SYSC3110!");
        prof.postponeMidterm("Midterm postponed by 1 week.");
    }
}
