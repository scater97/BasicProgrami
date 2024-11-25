package variabilesiMetode;
import org.testng.annotations. Test;

import java.security.spec.RSAOtherPrimeInfo;

public class Persoana {

    //o clasa in java este o structura care defineste atat atributele cat si metodele unui obiect
    //tipuri de date in java:
    //1. primitive(stocheaza direct valorile in variabila si sunt prestabilite)
    //a. int - numere intregi (32 biti)
    //b. double - numere zecimale
    //c. char - caractere individuale (a)
    //d. boolean - valori true or false
    //e. byte - numere intregi (8)
    //f. short - numere intregi (16)
    //g. long - numere intregi (64)
    //h. float - numere zecimale dar precizia este mai mica decat la double
    //2. Timpuri de fererinta: stocheaza doar referinta catre un obiect
    //a. string - sir de caractere
    //b. Integer - o clasa care invaluieste/wrapper un int

    //variabile globale/instanta
    String nume="Popescu";   //variabila globala de tip String
    String prenume="Ion";    //variabila globala de tip String
    char sexul='M';          //variabila globala de tip char
    int anulNasterii=2004;   //variabila globala de tip int

    @Test
    public void afisarePersoana(){
        System.out.println("Numele persoanei este: "+nume);
        System.out.println("Prenumele persoanei este: "+prenume);
        System.out.println("Anul nasterii persoanei este: "+anulNasterii+ " Sexul este: "+sexul);
    }

    @Test
    public void afisareDetaliiPersoana() {
        double Inaltime=1.80;
        int Greutate=80;
        System.out.println("Inaltimea persoane este de: " +Inaltime);
        System.out.println("Greutatea persoanei este de: " +Greutate);
        System.out.println("Numele persoanei este: " +nume+" Inaltimea persoane este de: " +Inaltime);
    }
    //O metoda este un bloc de care indeplineste o functie specifica
    //Metodele sunt de doua tipuri : VOID sau RETURN
    //Void inseamna ca nu returneaza nimic
    //Return returneaza un tip de date: int, spring sau boolean:
    // in loc de public va fii public int sau public string iar la sfarsit inainte de ultima acolada
    //trebuie sa fie return, iar aceste trebuie sa returneze aceeasi valoare declarata initial:string sau int


    public int calculVarsta(){
        return 2018-anulNasterii;

    }

    public boolean esteAdult(int varsta){
        return varsta>18;
    }
    @Test
    public void afisareDatePersoana(){
        int varstaReala=calculVarsta();
        System.out.println("Varsta calculata a persoanei este de: "+calculVarsta()+" ani");
        System.out.println("Persoana este adult? "+esteAdult(varstaReala));

    }
}
