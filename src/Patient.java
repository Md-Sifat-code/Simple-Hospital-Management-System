import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private String dateOfBirth;
    private String patientType;

    public Patient() {
    }

    public Patient(String name, String dateOfBirth, int age, String patientType) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.patientType = patientType;
    }

    public String getPatientType() {
        return patientType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void detectDisease() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Disease Type: \n1) Head Related\n2) Body Related\n3) Hand or Foot Related\n4) Internal Related");
        int choose = scan.nextInt();
        scan.nextLine(); // Consume newline

        switch (choose) {
            case 1:
                patientType = "Head Related";
                break;
            case 2:
                patientType = "Body Related";
                break;
            case 3:
                patientType = "Hand or Foot Related";
                break;
            case 4:
                patientType = "Internal Related";
                break;
            default:
                System.out.println("Choose a valid number between 1 to 4");
                patientType = null; // Reset patientType if invalid input
                return;
        }

        System.out.println("The Patient name is: " + name);
        System.out.println("The Patient age is: " + age);
        System.out.println("The Patient Birth Date is: " + dateOfBirth);
        System.out.println("The Patient problem is: " + patientType);
    }
}
