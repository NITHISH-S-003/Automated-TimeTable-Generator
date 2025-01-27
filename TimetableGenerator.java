import java.util.Random;

public class TimetableGenerator {

    // Number of days and periods per day
    private static final int DAYS = 5; // Monday to Friday
    private static final int PERIODS_PER_DAY = 6; // 6 periods per day
    private static final String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    // Subjects for each class
    private static final String[] CLASS_A_SUBJECTS = {"Math", "Science", "History", "English", "PE", "Music"};
    private static final String[] CLASS_B_SUBJECTS = {"Math", "Physics", "Chemistry", "Biology", "English", "Art"};

    public static void main(String[] args) {
        System.out.println("Timetable for Class A:");
        generateTimetable(CLASS_A_SUBJECTS);
        System.out.println("\nTimetable for Class B:");
        generateTimetable(CLASS_B_SUBJECTS);
    }

    // Method to generate and print the timetable for a class in table format
    public static void generateTimetable(String[] subjects) {
        Random random = new Random();

        // Print table header with proper spacing
        System.out.printf("%-12s", "Day/Period");
        for (int period = 1; period <= PERIODS_PER_DAY; period++) {
            System.out.printf("%-12s", "Period " + period);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");

        // Print table rows for each day
        for (int day = 0; day < DAYS; day++) {
            System.out.printf("%-12s", DAYS_OF_WEEK[day]);
            for (int period = 0; period < PERIODS_PER_DAY; period++) {
                String subject = subjects[random.nextInt(subjects.length)];
                System.out.printf("%-12s", subject);
            }
            System.out.println();
        }
    }
}
