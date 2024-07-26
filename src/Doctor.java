import java.util.Scanner;

public class Doctor extends Patient{
    private String name_of_Doctor;
    private String Id_of_Doctor;
    private int Room_Number_of_Doctor;
    public String Doctor_type[3];
    private double BiLL = 0;
    int count =0;
    Scanner sc1 = new Scanner(System.in);

    public Doctor(String name_of_Doctor, String Id_of_Doctor,int Room_Number_of_Doctor){
        super();
        this.name_of_Doctor =name_of_Doctor;
        this.Id_of_Doctor = Id_of_Doctor;
        this.Room_Number_of_Doctor = Room_Number_of_Doctor;
    }

    public String getId_of_Doctor() {
        return Id_of_Doctor;
    }

    public String getName_of_Doctor(){
        return name_of_Doctor;
    }

    public int getRoom_Number_of_Doctor() {
        return Room_Number_of_Doctor;
    }
    public void which_Doctor(){
        System.out.println("Enter the Doctor Type: ");
        for(int i=0;i<4;i++){
            Doctor_type[i] = sc1.nextLine();
        }
    }
    public void assign_Doctor(String x){
        x = getPatient_type();
        if(x == Doctor_type[0]){
            System.out.println("You need to go the "+name_of_Doctor+"His Id number is : "+Id_of_Doctor+"He is at "+Room_Number_of_Doctor+"He is Specialist in "+Doctor_type);
        } else if (x == Doctor_type[1]) {
            System.out.println("You need to go the "+name_of_Doctor+"His Id number is : "+Id_of_Doctor+"He is at "+Room_Number_of_Doctor+"He is Specialist in "+Doctor_type);

        }else if (x == Doctor_type[2]) {
            System.out.println("You need to go the "+name_of_Doctor+"His Id number is : "+Id_of_Doctor+"He is at "+Room_Number_of_Doctor+"He is Specialist in "+Doctor_type);

        } else if (x == Doctor_type[3]) {
            System.out.println("You need to go the "+name_of_Doctor+"His Id number is : "+Id_of_Doctor+"He is at "+Room_Number_of_Doctor+"He is Specialist in "+Doctor_type);

        }

        }

    }

}
