package structurialternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative = conditii
    //IF este o structura de control care este folosita pentru a evalua o conditie boolean si pt a executa
    //Bloc de cod daca aceste conditie este adevarata
    //if(conditia){
    //blocul de cod care se executa daca conditia e adevarata
    //  } elser {
    //blocul de cod care se executa daca conditia este falsa
    //  }

    @Test
    public void MetodaDeTest(){
      //  VerificareNumar(4);
       // VerificareNumar(-1);
       // VerificareNumar(0);
       // VerificareNumar(9);
       // VerificareNumar(-12);
        afisareZileSaptamanii(8);
    }


    public void VerificareNumar(int numar){
        if (numar>0){
            if (numar % 2 == 0){
                System.out.println("Numarul:"+numar+ " este par pozitiv");
            } else {
                System.out.println("Numarul: "+numar+ " este impar pozitiv");
            }
        } else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul:" + numar + " este par negativ");
            } else {
                System.out.println("Numarul:" + numar + " este impar negativ");
            }
        } else {
            System.out.println("Numarul: "+ numar+ " este egal cu 0");
        }
    }

    //Switch este o structura de control care porneste evaluarea si executarea unei dintre mai multe blocuri de cod
    //in functie de valoarea expresiei evaluate.
    //Switch (expresia de evaluat){
    //    case valoare1:
    //         blocul de cod care se executa in cazul in care valoare1
    //         break;
    //    case valoare2:
    //         blocul de cod care se executa in cazul in care valoare2
    //         break;
    //    default: alte valori
    //         blocul de cod care se executa in cazul in care niciunul dintre cazurile de mai sus nu se potrivesc
    //         break;

    public void afisareZileSaptamanii(int zi){
        switch (zi){
            case 1:
                System.out.println("Azi este ziua de luni");
                break;
            case 2:
                System.out.println("Azi este ziua de marti");
                break;
            case 3:
                System.out.println("Azi este ziua de miercuri");
                break;
            case 4:
                System.out.println("Azi este ziua de joi");
                break;
            case 5:
                System.out.println("Azi este ziua de vineri");
                break;
            case 6:
                System.out.println("Azi este ziua de sambata");
                break;
            case 7:
                System.out.println("Azi este ziua de duminica");
                break;
            default:
                System.out.println(zi+" Nu este o zi a saptamanii");
        }
    }
}
