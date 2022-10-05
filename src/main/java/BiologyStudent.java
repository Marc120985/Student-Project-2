public class BiologyStudent extends Student implements Citizen{
    @Override
    public String getAdress() {
        return "Chicago";
    }

    @Override
    public int getIdentityCardNumber(int cardnumber) {
        return cardnumber;
    }
}
