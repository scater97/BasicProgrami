package oop;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public void testMethod(){

        Student Laura = new Student("Popescu", "Laura", 20, "Psihologie",true, "Filozofie");
        //Laura.infoStudent();
        //Laura.mananca();

        Angajat Eduard = new Angajat("Ionescu", "Eduard",26,"ARKA","Inginer",1);
        //Eduard.infoAngajat();
        //Eduard.companie = "somer";
        //Eduard.mananca();

        Eduard.programLucru();
        Eduard.programLucru(4);
        Eduard.programLucru("remote");
        Eduard.programLucru(false);




    }


}
