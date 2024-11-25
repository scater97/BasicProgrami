package ObiectConstructor;

import org.testng.annotations.Test;

public class JocTest {
    @Test
    public void testJoc(){
        Joc joc1 = new Joc("Imposibil",100);
        System.out.println(joc1);
    }
}
