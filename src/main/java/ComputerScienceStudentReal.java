public class ComputerScienceStudentReal extends ComputerScienceStudent{

    @Override
    public String gender(String gender) {
        return gender;
    }

    @Override
    public String toString() {
        return "\n" +"\nComputerScienceStudentReal " + super.toString();
    }
}
