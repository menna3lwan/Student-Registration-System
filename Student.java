import javax.swing.JOptionPane;
import java.util.ArrayList;
;

public class Student{

  String name, id, faculty, department;
  int age;
  float gpa;

  public static void Showinformation(ArrayList<Student> student) {
    int i = 0;
    for (Student c : student) {
      i++;
      JOptionPane.showMessageDialog(null,
          "Student Name : " + c.name + "\n  ID :" + c.id + "\n Faculty :" + c.faculty + "\n Department :"
              + c.department + "\n  Age :" + c.age + "\n  GPA :" + c.gpa,
          "Student information (" + i + ")", JOptionPane.INFORMATION_MESSAGE);

    }
  }

  public static void AddNew(ArrayList<Student> student, ArrayList<String> namelis ,ArrayList<String> Idlist) {

    String Name = JOptionPane.showInputDialog(null, "Enter Student name : "," Add New Student (Step 1 / 6 ) " ,JOptionPane.INFORMATION_MESSAGE);

    String Id = JOptionPane.showInputDialog(null, "Enter Student ID : "," Add New Student (Step 2 / 6 ) " ,JOptionPane.INFORMATION_MESSAGE);
    while (Id.length() < 6) {
      JOptionPane.showMessageDialog(null, "ID must be at least 6 characters long", "Error", JOptionPane.ERROR_MESSAGE);
      Id = JOptionPane.showInputDialog(null, "Enter Student ID : ");
    }

    String Faculty = JOptionPane.showInputDialog(null, "Enter Student Faculty : " ," Add New Student (Step 3 / 6 ) " ,JOptionPane.INFORMATION_MESSAGE);

    String Department = JOptionPane.showInputDialog(null, "Enter Student department : "," Add New Student (Step 4 / 6 ) " ,JOptionPane.INFORMATION_MESSAGE);
    int Age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Student Age : "));

    float Gpa = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter Student gpa : "," Add New Student (Step 5 / 6 ) " ,JOptionPane.INFORMATION_MESSAGE));
    while (Gpa < 0 || Gpa >= 4) {

      JOptionPane.showMessageDialog(null, "Gpa must be between 0 and 4", "Error", JOptionPane.ERROR_MESSAGE);
      Gpa = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter Student gpa : "," Add New Student (Step 6 / 6 ) " ,JOptionPane.INFORMATION_MESSAGE));

    }
    Student NewS = new Student();

    NewS.name = Name;
    NewS.id = Id;
    NewS.faculty = Faculty;
    NewS.age = Age;
    NewS.gpa = Gpa;
    NewS.department = Department;
    namelis.add(Name);
    student.add(NewS);
    Idlist.add(Id);


  }

  public static void ShowNames(ArrayList<String> namelis) {
    int j = 1;
    String allnames = " ";
    for (String i : namelis) {

      allnames = allnames + j + "-) " + i + "\n";
      j++;
    }
    JOptionPane.showMessageDialog(null, " \n Student Names : \n" + allnames, "Student Names list",
        JOptionPane.INFORMATION_MESSAGE);

  }

  public static void SarchID(ArrayList<String> Idlist, ArrayList<Student> infList) {
    int j = 1;
    boolean exist = false;
    String targetID = JOptionPane.showInputDialog(null, "Enter Student ID : ");
    for (int i = 0; i < Idlist.size(); i++) {
      if (Idlist.get(i).equalsIgnoreCase(targetID.trim())) {

        JOptionPane.showMessageDialog(null,
            "Student Name : " + infList.get(i).name + "\n  ID :" + infList.get(i).id + "\n Faculty :"
                + infList.get(i).faculty + "\n Department :"
                + infList.get(i).department + "\n  Age :" + infList.get(i).age + "\n  GPA :" + infList.get(i).gpa,
            "Student information (" + (i + 1) + ")", JOptionPane.INFORMATION_MESSAGE);

        exist = true;
        break;
      }

    }
    if (!exist) {
      JOptionPane.showMessageDialog(null, "Student not found");
    }

  }

  public static void Delete(ArrayList<Student> inflist, ArrayList<String> namelist) {

    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Student number : ", JOptionPane.INFORMATION_MESSAGE));
    int sur = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Are you sure you want to delete this student? \n 1-) YeS \t \t 2-) No", JOptionPane.YES_NO_OPTION));
    if (sur == 1) {
      inflist.remove(i - 1);
      namelist.remove(i - 1);
      JOptionPane.showMessageDialog(null, "Student deleted successfully");
    } else if (sur == 2) {
      JOptionPane.showMessageDialog(null, "Student not deleted");
    } else {
      JOptionPane.showMessageDialog(null, "invalid input", "Error", JOptionPane.ERROR_MESSAGE);
    }

  }
}