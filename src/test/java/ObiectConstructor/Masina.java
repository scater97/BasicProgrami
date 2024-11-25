package ObiectConstructor;

public class Masina {
    public String marca;
    public String model;
    public int primaSuta;
    public int vitezaMaxima;
    public String evacuare;

    public Masina(String marca, String model, int primaSuta, int vitezaMaxima, String evacuare){
        this.marca = marca;
        this.model = model;
        this.primaSuta = primaSuta;
        this.vitezaMaxima = vitezaMaxima;
        this.evacuare = evacuare;
    }
    public void prezentareMasina() {
        System.out.println("Marca acestei masini este un: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Viteza masinii de la 0-100 este de: " + primaSuta + " secunde");
        System.out.println("Viteza maxima pe care masina o are este de: " + vitezaMaxima + "km/h");
        if (evacuare != null) {
            System.out.println("Modelul evacuarii acestei masini este : " + evacuare);
        } else {
            System.out.println("Masina nu are evacuare sport!");
        }
    }
        public Masina(String marca, String model, int primaSuta, int vitezaMaxima){
            this.marca = marca;
            this.model = model;
            this.primaSuta = primaSuta;
            this.vitezaMaxima = vitezaMaxima;
        }

}
