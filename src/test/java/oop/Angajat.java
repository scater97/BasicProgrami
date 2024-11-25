package oop;

public class Angajat extends Persoana {

    public String companie;
    public String profesie;
    public int vechime;

    public Angajat(String nume, String prenume, int varsta, String companie,String profesie, int vechime) {
        super(nume, prenume, varsta);
        this.companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Angajatul: " + getNume() + " lucreaza la compania: " + companie);
        System.out.println("Angajatul: " + getNume() + " are profesia de: " + profesie);
        System.out.println("Angajatul: " + getNume() + " are vechimea de: " + vechime + " ani");

    }
    public void mananca(){
        System.out.println("Angajatul mananca in pauza");
        super.mananca();
    }
    public void programLucru(){
        System.out.println("Angajatul lucreaza 8 ore standard");
    }

    public void programLucru(int numarOre){
        System.out.println("Angajatul part-time lucreaza " + numarOre + " ore");
    }

    public void programLucru(String locatie){
        System.out.println("Tester-ul lucreaza " + locatie);
    }

    public void programLucru(boolean overTime){
        System.out.println("Angajatul disperat lucreaza/nu lucreaza " + overTime);
    }
}
