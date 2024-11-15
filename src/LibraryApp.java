import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LibraryApp {

    private String name;
    private List<Student> studentsList;

    public LibraryApp(String name) {
        this.name = name;
        this.studentsList=new ArrayList<Student>();
    }
    public void addStudent(){
        Scanner s=new Scanner(System.in);
        String name,surname;
        int id;
        System.out.println("Student name: ");
        name=s.nextLine();
        System.out.println("Student surname:");
        surname=s.nextLine();
        System.out.println("Student id:");
        id=s.nextInt();
        studentsList.add(new Student(id,surname,name));
        System.out.println("Student added succesfully!");

    }

    public void removeStudentById(){
        Scanner s=new Scanner(System.in);
        int idToRemove;
        System.out.println("Write student's ID who you want to remove from list:");
        idToRemove=s.nextInt();
        for(Student student : studentsList){
            if(student.getId()==idToRemove){
                studentsList.remove(student);
            }else{
                System.out.println("There is no student with this ID on the list");
            }
        }
    }

    public void borrowBookById() {
        Scanner s = new Scanner(System.in);

        System.out.println("Write student's ID who borrows the book:");
        int idToBorrow = s.nextInt();
        s.nextLine();
        boolean found = false;

        for (Student student : studentsList) {
            if (student.getId() == idToBorrow) {
                found = true;
                System.out.println("Write the title of the book: ");
                String bookToBorrow = s.nextLine();
                student.borrowBook(bookToBorrow);
                System.out.println("Book borrowed succesfully");
                break;
            }
        }
            if (!found) {
                System.out.println("There is no student with this ID on the list");
            }
    }

    public void returnBookById() {
        Scanner s = new Scanner(System.in);

        System.out.println("Write student's ID who returns the book:");
        int idToBorrow = s.nextInt();
        s.nextLine();
        boolean found = false;

        for (Student student : studentsList) {
            if (student.getId() == idToBorrow) {
                found = true;
                System.out.println("Write the title of the book to return: ");
                String bookToReturn = s.nextLine();
                student.returnBook(bookToReturn);
                System.out.println("Book returned succesfully");
                break;
            }
        }
        if (!found) {
            System.out.println("There is no student with this ID on the list");
        }
    }
    public void listStudents(){
        for(Student student : studentsList){
            System.out.println(student.toString());
        }
        if(studentsList.isEmpty()){
            System.out.println("Students list is empty");
        }

      }
}
