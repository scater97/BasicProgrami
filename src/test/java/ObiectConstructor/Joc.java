package ObiectConstructor;

public class Joc {
    public String nivel;
    public int dificultate;

    public Joc(String nivel, int dificultate) {
        this.nivel = nivel;
        this.dificultate = dificultate;
        incarcaResurse();
    }

    public void incarcaResurse(){
        System.out.println("Se incarca resursele pentru nivelul: " + nivel + " pentru dificultatea: " + dificultate);
    }
}
