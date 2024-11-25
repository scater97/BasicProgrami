package oop;

public class Persoana {

    //OOP = programare orientata obiect(object oriented programing)
    //4 principp importante: - mostenire
                            //-incapsulare
                            //-polimorfism
                            //-abstractizare
    //Mostenire: este conceptul in JAVA prin care o clasa(clasa copiilor) mosteneste o alta clasa (clasa parinte)
    //In JAVA se poate mostenii o singura clasa
    //IN momentul in care o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze clasa constructorului din parinte
    //din momentul in care se aplica mostenirea, clasa copil are vizibilitate asupra variabilelor si metodelor din clasa parinte
    //constructorul din clasa parinte spre copil se apeleaza cu "super"
    //in java CA SA EXTINZI o alta clasa se foloseste cuvantul "extend"

    //Incapsulare
    //procesul prin care tinem private anumite info in asa fel ca ele sa nu poate sa fie modificate
    //facem  variabile/metode din public in private
    //private = este un acces control care restrictioneaza accesul doar in clasa respecrtiva , inseamna ca noi le facem doar in aceea clasa
    //ca sa extragem / modifica o valoare a unei variabile private ne folosim de metode get sau set

    //Conceptul prin care definim mai multe implementari pt o metoda;
    //-static si dinamic
    //Polimorfism dinamic = intr-o ierarhie de clase obtinut eprin mostenire, o metoda poate avea implementari diferite
    //Daca vrem sa chemam in copil metoda din parinte trebuie sa folosim SUPER;

    //Polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului de parametrii
    //


    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    //Polimorfism dinamic exemplu : prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
