package ObiectConstructor;

public class Avion {

    //Constructorul are rolul de a initializa variabilele unei clase
    //Recunoastem un contructor dupa numele unei clase- este o metoda speciala care nu are void return
    //intr-o clasa putem avea unul sau mai multi constructori care se diferentiaza dupa numarul de parametrii
    //intr-o clasa exista mereu un constructor default(fara parametrii)
    //constructorii sunt cu sau fara parametrii
    //constructorul trebuie mereu sa fie public

    //un obiect in java este o instanta unei clase
    //ca sa initializam un obiect folosim cuvantul "new"
    //cand se initializeaza un obiect se apeleaza constructorul unei clase

    public String tip;
    public String marca;
    public int capacitatePasageri;
    public int anFabricatie;
    public Integer capacitateBagaje;
    public String modelAvion;

    public Avion(String tip,String marca,int capacitatePasageri,int anFabricatie,Integer capacitateBagaje, String modelAvion){
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.capacitateBagaje = capacitateBagaje;
        this.modelAvion = modelAvion;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Capacitatea pasagerilor sunt: " + capacitatePasageri);
        System.out.println("Anul fabriectiei avionului este : " + anFabricatie);
        System.out.println("Marca avionuliui este: " + modelAvion);
        if (capacitateBagaje != null){
            System.out.println("Capacitatea de bagaje a avionului este: " + capacitateBagaje);
        }else {
            System.out.println("Avionul nu are bagaje");
        }
    }

    public Avion(String tip,String marca,int capacitatePasageri,int anFabricatie, String modelAvion){
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.modelAvion = modelAvion;

    }
}
