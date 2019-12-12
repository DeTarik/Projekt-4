import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiblotekTest {

    @Test
    void addNewBok() {


        // Arrange

        Biblotek biblotek = new Biblotek();

        Bok bokHarryPotter = new Bok("Harrypotter", "1");

        boolean finnsBoken = biblotek.addNewBok(bokHarryPotter);

        assertTrue(finnsBoken);


    }


    @Test
    void addNewLjudBok() {


        // Arrange

        Biblotek biblotek = new Biblotek();


        // Act


        LjudBok ljudbok = new LjudBok("Harrypotter", "123", "Svenska");


        boolean finnsLjudBoken = biblotek.addNewLjudBok(ljudbok);


        // Assert


        assertTrue(finnsLjudBoken);



    }

    @Test

    void removebok(){
        Biblotek biblotek = new Biblotek();

        Bok bok = new Bok("Lord", "1");

        biblotek.addNewBok(bok);

        boolean taBortBok = biblotek.removeBok(bok);

        assertTrue(taBortBok);
    }


    @Test
    void removeLjudBok(){

        Biblotek biblotek = new Biblotek();

        LjudBok ljudbok = new LjudBok("Lord", "1234", "svenska");

        biblotek.addNewLjudBok(ljudbok);

        boolean taBortljudBok = biblotek.removeLjudBok(ljudbok);

        assertTrue(taBortljudBok);
    }

    @Test

    void uppdateraBok(){

        Biblotek biblotek = new Biblotek();

        Bok bok = new Bok ("heej","134445");

        Bok bok1 = new Bok("hej", "134445");

        biblotek.addNewBok(bok);


        boolean uppdateraBoken = biblotek.updateBok(bok, bok1);

        assertTrue(uppdateraBoken);



    }

    @Test

    void uppdateraLjudBok(){

        Biblotek biblotek = new Biblotek();

        LjudBok ljudbok = new LjudBok ("heeeeeej","134445", "Svenska");

        LjudBok ljudBok1 = new LjudBok("hesddsj", "134445", "Ssvenskia");

        biblotek.addNewLjudBok(ljudbok);


        boolean uppdateraLjudBoken = biblotek.uppdateraLjudBok(ljudbok, ljudBok1);

        assertTrue(uppdateraLjudBoken);

    }

    @Test

    void hittaBok() {

        Biblotek biblotek = new Biblotek();

        Bok bok = new Bok("haj", "123");

        biblotek.addNewBok(bok);

        int i = biblotek.findBok(bok);

        assertEquals(0, i);


    }

    @Test

    void hittainteBoken(){


        Biblotek biblotek = new Biblotek();

        Bok bok = new Bok("hajen", "123");

        Bok bok1 = new Bok("hejsaan","1234");

        biblotek.addNewBok(bok);

        int i = biblotek.findBok(bok1);

        assertEquals(-1, i);

    }




    @Test

    void hittaLjudBok() {

        Biblotek biblotek = new Biblotek();

        LjudBok ljudbok = new LjudBok("haeeaej", "123", "Svenskaaa");

        biblotek.addNewLjudBok(ljudbok);

        int i = biblotek.findLjudBok(ljudbok);

        assertEquals(0, i);

    }


    @Test

    void hittainteLjudBoken(){


        Biblotek biblotek = new Biblotek();

        LjudBok ljudbok = new LjudBok("haj", "1233", "engelska");

        LjudBok ljudbok1 = new LjudBok("hajen","123", "engelska");

        biblotek.addNewLjudBok(ljudbok);

        int i = biblotek.findLjudBok(ljudbok1);

        assertEquals(-1, i);

    }

      @Test

      void kollaBoken(){

        Biblotek biblotek = new Biblotek();

        Bok bok = new Bok("hej", "2");

        biblotek.addNewBok(bok);

        int i = biblotek.findBok(bok);



        assertEquals(0, i);


    }

    @Test

    void queryHittaBok(){

        Biblotek biblotek = new Biblotek();

        Bok bok = new Bok("Hello", "12");

        biblotek.addNewBok(bok);

        int position = biblotek.findBok("Hello");

        assertEquals(0, position);



    }


    @Test

    void queryHittaLjudBok(){

        Biblotek biblotek = new Biblotek();

        LjudBok ljudbok = new LjudBok("ibbeee", "1232", "Svenska");

        biblotek.addNewLjudBok(ljudbok);

        int position = biblotek.findLjudBok("ibbeee");

        assertEquals(0, position);


    }



}
