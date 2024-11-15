import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int id;
    private List<String> borrowedBooks;

    public Student(int id, String surname, String name) {
        this.borrowedBooks = new ArrayList<String>();
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void borrowBook(String name){
        this.borrowedBooks.add(name);
    }

    public void returnBook(String name){
        if(!borrowedBooks.contains(name)){
            System.out.println("This book wasn't borrowed by student "+this.name+" (id:"+this.id+")");
        }
        this.borrowedBooks.remove(name);
    }


    @Override
    public String toString() {
        return "Name: "+name+", Surname: "+surname+", id: "+id+", Borrowed books: "+
                (borrowedBooks.size()>0 ? borrowedBooks : "No books borrowed" )+" ";
    }
}
