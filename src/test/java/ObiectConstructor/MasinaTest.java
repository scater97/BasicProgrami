package ObiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {
    @Test
    public void informatiiMasina(){
        Masina masina1 = new Masina("Volkswagen","Golf 8 GTI",6,250);
        masina1.prezentareMasina();

        Masina masina2 = new Masina("Volkswagen","Golf 8 R",4,270,"Akrapovic");
        masina2.prezentareMasina();
    }
}
