public class Main {
    public static void main(String[] args) {
        Patient person1 = new Patient("Md Sajis Alam", "27 July 2003", 24, null);
        Doctor doctor1 = new Doctor("Dr. Akbar Ali Khan", "DRH00980", 503);

        person1.detectDisease(); // Set patient type in Patient class
        doctor1.whichDoctor();   // Populate doctor types
        doctor1.assignDoctor();  // Assign doctor based on patient type
        doctor1.assignBills();   // Calculate and print bills
    }
}
