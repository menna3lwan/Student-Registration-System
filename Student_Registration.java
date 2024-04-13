import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Student_Registration {
    public static void main(String[] args) {
        int i = 0;
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.name = "Menna Elwan";
        stud1.department = "CS";
        stud1.faculty = "BFCAI";
        stud1.id = "20232023";
        stud1.age = 19;
        stud1.gpa = 3.0f;

        stud2.name = "Menna Haleem";
        stud2.department = "AI";
        stud2.faculty = "BFCAI";
        stud2.id = "20235878475";
        stud2.age = 19;
        stud2.gpa = 3.8f;

        ArrayList<Student> infoList = new ArrayList<Student>();
        infoList.add(stud1);
        infoList.add(stud2);
        ArrayList<String> Namelist = new ArrayList<String>();
        Namelist.add(stud1.name);
        Namelist.add(stud2.name);
        ArrayList<String> IDList = new ArrayList<String>();
        IDList.add(stud1.id);
        IDList.add(stud2.id);

        int choise;
        do {

            choise = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of registered students"
                    + infoList.size()
                    + "\n 1-) Show information \n 2-) Add new \n 3-)  Names list \n 4-) Sarch By ID \n 5-) Delete \n 6-) Exit"));

            switch (choise) {
                case 1:
                    Student.Showinformation(infoList);
                    break;
                case 2:
                    Student.AddNew(infoList, Namelist, IDList);
                    break;
                case 3:
                    Student.ShowNames(Namelist);
                    break;
                case 4:
                    Student.SarchID(IDList, infoList);
                    break;
                case 5:
                    Student.Delete(infoList, Namelist);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }

        } while (true);

    }

}