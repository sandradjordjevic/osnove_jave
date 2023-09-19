package p18_09_2023.zadatak2;

public class StudentMaster extends Student{
    public StudentMaster(String imePrezime, int brojIndexa, int godinaStudija) {
        super(imePrezime, brojIndexa, godinaStudija);
    }
    @Override
    public double cenaSkolarine () {
        return 100000;
    }
    @Override
    public boolean daLiJeNaBudzetu () {
        boolean budzet = false;
        if (this.godinaStudija < 2) {
            budzet = true;
        }
        return budzet;
    }
}
