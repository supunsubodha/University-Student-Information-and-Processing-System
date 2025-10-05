import java.util.Scanner;

public class StudentArray {
    Student[] student;
    final int DEFAULTCAPACITY = 10;
    int studentCount;
    public StudentArray(){
        student = new Student[DEFAULTCAPACITY];
    }
    public void addStudent(int ID,String name,String degree,int year,float GPA){
        if(studentCount == student.length){
            resize();
        }
        student[studentCount] = new Student(ID,name,degree,year,GPA);
        studentCount++;

    }
    public void resize(){
        Student[] newStudent = new Student[student.length*2];
        for(int i=0;i<student.length;i++){
            newStudent[i] = student[i];
        }
        student = newStudent;
    }
    public void update(int ID){
        for(int i=0; i<studentCount;i++){
            if(student[i].ID==ID){
                System.out.println("What information about student you need to update?");
                System.out.println("1.Name\n2.Degree\n3.Year\n4.GPA\nEnter the relevant number here: ");
                Scanner sc = new Scanner(System.in);
                int toUpdate = sc.nextInt();
                switch(toUpdate){
                    case 1:
                        System.out.println("Enter new name: ");
                        student[i].name=sc.next();
                        break;
                    case 2:
                        System.out.println("Enter the new degree: ");
                        student[i].degree = sc.next();
                        break;
                    case 3:
                        System.out.println("Enter the new year: ");
                        student[i].year = sc.nextInt();
                        break;
                    case 4:
                        System.out.println("Enter the new GPA: ");
                        student[i].GPA = sc.nextFloat();
                        break;
                    default:
                        System.out.println("Wrong input, Try again!");
                        update(ID);
                        break;
                }
                break;

            }

        }
        System.out.println("Wrong ID, Try again!");
        update(ID);
    }
    public void delete(int ID){
        for(int i=0; i<studentCount;i++){
            if(student[i].ID==ID){
                for(int j=i; j<studentCount-1; j++){
                    student[j] = student[j+1];
                }
            break;
            }

        }
        System.out.println("Wrong ID, Try again!");
        delete(ID);
    }

}
