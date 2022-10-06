import lombok.Data;

//@Data
public class Student
{
    String name;
    int id;


    @Override
   public String toString() {
       return "\nStudent: " + "\nName: " + name  +
               "\nStudentennummer: " + id;
   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
