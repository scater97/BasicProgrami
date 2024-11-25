package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class CalculeTest {

    @Test
    public void testAdunare(){
        Calcule calcule = new Calcule();
        System.out.println("Adunarea in 2 int-uri este: " + calcule.adunare(2, 3));
        System.out.println("Adunarea in 2 doubel-uri este: " + calcule.adunare(2.4, 3.1));
        System.out.println("Adunarea in 2 string-uri este: " + calcule.adunare("buna", "seara"));
    }
}
