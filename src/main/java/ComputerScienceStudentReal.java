public class ComputerScienceStudentReal extends ComputerScienceStudent implements Citizen{

    @Override
    public String gender(String gender) {
        return gender;
    }

    @Override
    public String toString() {
        return "\n" +"\nComputerScienceStudentReal " + super.toString();
    }

    @Override
    public String getAdress() {
        return "Street 5, NY City";
    }

    @Override
    public int getIdentityCardNumber(int cardnumber) {
        return cardnumber;
    }
}
