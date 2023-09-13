package d12_09_2023.zadatak2;

public class ZeleniKarton {
    private String student;
    private int brojIndexa;
    private String predmet;
    private String profesor;
    private int ocena;
    public ZeleniKarton (String student, int brojIndexa) {
        this.student = student;
        this.brojIndexa = brojIndexa;
    }
    public boolean daLiJeIspitPolozen () {
        return this.ocena > 5;
    }
    public void stampaj () {
        System.out.println(this.predmet + " - " + this.ocena);
        System.out.println("Student: " + this.student + ", " + this.brojIndexa);
        System.out.println("Profesor: " + this.profesor);
    }
    public String getStudent () {
        return this.student;
    }
    public int getBrojIndexa () {
        return this.brojIndexa;
    }
    public void setPredmet (String predmet) {
        this.predmet = predmet;
    }
    public String getPredmet () {
        return this.predmet;
    }
    public void setProfesor (String profesor) {
        this.profesor = profesor;
    }
    public String getProfesor () {
        return this.profesor;
    }
    public void setOcena (int ocena) {
        this.ocena = ocena;
    }
    public int getOcena () {
        return this.ocena;
    }
}
