import java.util.Scanner;

public class Doctor extends Patient {
    private String nameOfDoctor;
    private String idOfDoctor;
    private int roomNumberOfDoctor;
    private String[] doctorType = new String[4];
    private double bill = 0;
    Scanner sc1 = new Scanner(System.in);

    public Doctor(String nameOfDoctor, String idOfDoctor, int roomNumberOfDoctor) {
        super();
        this.nameOfDoctor = nameOfDoctor;
        this.idOfDoctor = idOfDoctor;
        this.roomNumberOfDoctor = roomNumberOfDoctor;
    }

    public String getIdOfDoctor() {
        return idOfDoctor;
    }

    public String getNameOfDoctor() {
        return nameOfDoctor;
    }

    public int getRoomNumberOfDoctor() {
        return roomNumberOfDoctor;
    }

    public void whichDoctor() {
        System.out.println("Enter the Doctor Type (e.g., Head Related, Body Related, Hand or Foot Related, Internal Related): ");
        for (int i = 0; i < 4; i++) {
            doctorType[i] = sc1.nextLine();
        }
    }

    public void assignDoctor() {
        String x = getPatientType();
        if (x == null) {
            System.out.println("Patient type is not set.");
            return;
        }

        for (int i = 0; i < doctorType.length; i++) {
            if (x.equals(doctorType[i])) {
                System.out.println("You need to go to Dr. " + nameOfDoctor + ". His Id number is: " + idOfDoctor +
                        ". He is at room number " + roomNumberOfDoctor + ". He is a Specialist in " + doctorType[i]);
                return;
            }
        }
        System.out.println("You haven't got any appointment");
    }

    public void assignBills() {
        double y = this.bill;
        String z = getPatientType();
        if (z == null) {
            System.out.println("Patient type is not set.");
            return;
        }

        if (z.equals(doctorType[0])) {
            y += 500;
        } else if (z.equals(doctorType[1])) {
            y += 600;
        } else if (z.equals(doctorType[2])) {
            y += 700;
        } else if (z.equals(doctorType[3])) {
            y += 1500;
        } else {
            System.out.println("No Bill need to pay");
            return;
        }
        System.out.println("You need to pay: " + y);
    }
}
