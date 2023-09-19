package p18_09_2023.zadatak2;

public class StudentOsnovnih extends Student{
    public StudentOsnovnih(String imePrezime, int brojIndexa, int godinaStudija) {
        super(imePrezime, brojIndexa, godinaStudija);
    }
    @Override
    public double cenaSkolarine () {
        return 90000;
    }
    @Override
    public boolean daLiJeNaBudzetu () {
        boolean budzet = false;
        if (this.godinaStudija < 5) {
            budzet = true;
        }
        return budzet;
    }
}