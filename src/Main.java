import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        LibraryApp library=new LibraryApp("MyLibrary");

        boolean flag=true;

        while (flag) {
            printActions();
            int choice=s.nextInt();
            switch (choice) {
                case 1:
                    library.listStudents();
                   break;
                case 2:
                    library.addStudent();
                    break;
                case 3:
                    library.removeStudentById();
                    break;
                case 4:
                    library.borrowBookById();
                    break;
                case 5:
                    library.returnBookById();
                    break;

                default:
                    System.out.println("Program exited");
                    flag=false;
                    break;
            }
        }

    }
    private static void printActions(){

        System.out.println("""            
                1.List students.
                2.Add student to library.
                3.Remove student from library.
                4.Borrow book by student's id.
                5.Return book by student's id.           
                Select option (1-5) or other to exit:
                """);
    }




    }


