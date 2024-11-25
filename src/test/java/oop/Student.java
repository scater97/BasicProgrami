package oop;

public class Student extends Persoana {

    private String facultate;
    private boolean bursa;
    private String cursuri;



    public Student(String nume, String prenume, int varsta, String facultate, boolean bursa, String cursuri) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Persoana: " + getNume() + " este student la facultatea: " + facultate);
        System.out.println("Persoana: " + getNume() + " ia/nu ia " + bursa);
        System.out.println("Persoana: " + getNume() + " are cursuri de: " + cursuri);

    }

    public void mananca(){
        System.out.println("Studentul mananca cand are timp");
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public String getCursuri() {
        return cursuri;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }
}
