//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentArray students = new StudentArray();
        students.addStudent(1, "Aiden Smith", "Computer Science", 2023, 3.2f);
        students.addStudent(2, "Sophia Johnson", "Business Administration", 2024, 3.5f);
        students.addStudent(3, "Liam Williams", "Engineering", 2022, 2.8f);
        students.addStudent(4, "Olivia Brown", "Mathematics", 2025, 3.9f);
        students.addStudent(5, "Noah Jones", "Computer Science", 2023, 2.7f);
        students.addStudent(6, "Emma Garcia", "Business Administration", 2024, 3.1f);
        students.addStudent(7, "Mason Miller", "Engineering", 2022, 2.5f);
        students.addStudent(8, "Ava Davis", "Mathematics", 2025, 3.7f);
        students.addStudent(9, "Lucas Rodriguez", "Computer Science", 2023, 3.0f);
        students.addStudent(10, "Mia Martinez", "Business Administration", 2024, 2.9f);
        students.addStudent(11, "Ethan Hernandez", "Engineering", 2022, 3.3f);
        students.addStudent(12, "Isabella Lopez", "Mathematics", 2025, 3.8f);
        students.addStudent(13, "Logan Gonzalez", "Computer Science", 2023, 2.6f);
        students.addStudent(14, "Charlotte Wilson", "Business Administration", 2024, 3.4f);
        students.addStudent(15, "James Anderson", "Engineering", 2022, 2.3f);
        students.addStudent(16, "Amelia Thomas", "Mathematics", 2025, 3.6f);
        students.addStudent(17, "Benjamin Taylor", "Computer Science", 2023, 3.1f);
        students.addStudent(18, "Harper Moore", "Business Administration", 2024, 2.8f);
        students.addStudent(19, "Elijah Jackson", "Engineering", 2022, 3.2f);
        students.addStudent(20, "Evelyn Martin", "Mathematics", 2025, 3.7f);
        students.addStudent(21, "William Lee", "Computer Science", 2023, 2.9f);
        students.addStudent(22, "Abigail Perez", "Business Administration", 2024, 3.0f);
        students.addStudent(23, "Henry White", "Engineering", 2022, 2.7f);
        students.addStudent(24, "Emily Harris", "Mathematics", 2025, 3.5f);
        students.addStudent(25, "Sebastian Clark", "Computer Science", 2023, 3.3f);
        students.addStudent(26, "Elizabeth Lewis", "Business Administration", 2024, 3.2f);
        students.addStudent(27, "Jack Walker", "Engineering", 2022, 2.4f);
        students.addStudent(28, "Sofia Hall", "Mathematics", 2025, 3.9f);
        students.addStudent(29, "Alexander Young", "Computer Science", 2023, 2.8f);
        students.addStudent(30, "Ella King", "Business Administration", 2024, 3.6f);

        students.displayStudentDetails();

        students.delete(1);

        students.displayStudentDetails();
        students.update(29);
        students.displayStudentDetails();
    }
}