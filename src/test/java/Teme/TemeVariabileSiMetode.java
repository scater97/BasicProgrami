package Teme;

import org.testng.annotations.Test;

public class TemeVariabileSiMetode {
    //Casa
    //minim 3 variabile globale
    //minim 3 variabile locale
    //2 metode cu void- una cu parametru alta fara
    //2 metode cu return una cu parametru si alta fara
    //o metoda de test sa afisam sout variabile ce am lucrat si pana acuma

    String strada="Popestilor";
    String design="Modern";
    int etaje=2;
    int nrCamere=4;
    int anConstructie=2002;

    @Test
    public void afisareCasa(){
        System.out.println("Casa se afla pe strada: "+strada);
        System.out.println("Casa are un design: "+design);
        System.out.println("Casa are: "+etaje +" etaje ");
        System.out.println("Casa are: "+nrCamere+" camere ");
    }
    @Test
    public void maiMulteDetaliiCasa(){
        String culoare="Bej";
        String gradina="Gradina mare";
        int garaj=2;
        System.out.println("Culoarea acestei case este: "+culoare);
        System.out.println("In spatele acestei case se afla o: "+gradina);
        System.out.println("Langa casa se afla: "+garaj+" garaje");
    }
public int calculCasa(){
        return 2024-anConstructie;
}
public boolean casaEsteVeche(){
        return anConstructie>2004;
}
@Test
public void afisareVasrtaCasa(){
        int varstaCasa=calculCasa();
    System.out.println("Casa are o vechime de: "+calculCasa()+" de ani");
    System.out.println("Casa este noua?: "+casaEsteVeche());
}


//Tema de facut ce am facut miercuri dar cu masini din tari diferite
    // de tip Hasmap2 si string
    // 4perechi in hasmap
    //dintr-o lista de string-uri cautam un string dorit
    //trebuie fcaut o lista de string
    //variabila de string
    //parcurgeti lista cu un for sau while
    // cand ajungem la cuvantul dorit il introducem in consola si folosim if

}

