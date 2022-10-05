public abstract class ComputerScienceStudent extends Student{
    private String hauptfach = "Informatik";
    private String nebenfach = "Englisch";


    public String getHauptfach() {
        return hauptfach;
    }

    public void setHauptfach(String hauptfach) {
        this.hauptfach = hauptfach;
    }

    public String getNebenfach() {
        return nebenfach;
    }

    public void setNebenfach(String nebenfach) {
        this.nebenfach = nebenfach;
    }

    @Override
    public String toString() {
        return "\nComputerScienceStudent: " + super.toString() +
                "\nHauptfach: " + hauptfach  +
                "\nNebenfach: " + nebenfach;
    }

    public abstract String gender(String gender);
}
