import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private String Date_of_Birth;
    private String patient_type;
    int choose ;
    Scanner scan = new Scanner(System.in);
    public Patient(){

    }
    public Patient(String name, String Date_of_Birth,int age,String patient_type){
        this.name =name;
        this.Date_of_Birth = Date_of_Birth;
        this.age =age;
        this.patient_type = patient_type;
    }

    public String getPatient_type() {
        return patient_type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void detect_disis(){

        System.out.println("Chooose your Disis Type: 1) Head Related\n 2) Body Related \n 3) Hand or Foot Related \n4) Internal Related");
        int choose = scan.nextInt(); ;
        switch(choose){
            case 1:
                patient_type = "Head Related";
                break;
            case 2:
                patient_type = "Body Related";
                break;
            case 3:
                patient_type = "Hand or Foot Related";
                break;
            case 4:
                patient_type = "Internal Related";
                break;
            default:
                System.out.println("Choose a valid number between 1 to 4");

        }
        System.out.println("The Patient name is: "+name);
        System.out.println("The Patient age is: "+age);
        System.out.println("The Patient Birth Date is: "+Date_of_Birth);
        System.out.println("The Patient problem is: "+patient_type);
    }

}
