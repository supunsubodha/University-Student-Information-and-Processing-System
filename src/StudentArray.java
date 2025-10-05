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

}
