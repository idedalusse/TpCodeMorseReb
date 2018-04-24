package com.example.bensnedalus.codemorse;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TraducteurMorseConcretTest {


    //************* 0 - Example :Test  ***************//

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //***********************************************//


    // $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//


    //***************************** Les Tests pour le ToAlpha ***********************************//


    //************* 1 - Test: SOS ***************//

    @Test
    public void toAlphaTestSOS(){

        Morse morse = new Morse();
        assertEquals("SOS", morse.toAlpha("... --- ..."));
    }

    //************* 2 - Test: SOS ***************//
    @Test
    public void toAlphaTestALLO(){

        Morse morse = new Morse();
        assertEquals("ALLO", morse.toAlpha(".- .-.. .-.. ---"));
    }


    //************* 3 - Test: SOS ***************//
    @Test
    public void toAlphaTestHelp(){

        Morse morse = new Morse();
        assertEquals("HELP", morse.toAlpha(".... . .-.. .--."));
    }


    //************* 4 - Test: SOS ***************//
    @Test
    public void toAlphaTestDanger(){

        Morse morse = new Morse();
        assertEquals("DANGER", morse.toAlpha("-.. .- -. --. . .-."));
    }


    //************* 5 - Test: SOS ***************//
    @Test
    public void toAlphaTestTp(){

        Morse morse = new Morse();
        assertEquals("TP", morse.toAlpha("- .--."));
    }


//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//



    //***************************** Les Tests pour le ToMorse ***********************************//


    //************* 1 - Test: WARS ***************//

    @Test
    public void toMorseTestWAR(){

        Morse morse = new Morse();
        assertEquals(".-- .- .-.", morse.toMorse("WAR"));
    }

    //************* 2 - Test: SOS ***************//

    @Test
    public void toMorseTestSOS(){

        Morse morse = new Morse();
        assertEquals("... ---", morse.toMorse("SO"));
    }

    //************* 3 - Test: BOBO ***************//

    @Test
    public void toMorseTestBOBO(){

        Morse morse = new Morse();
        assertEquals("-... ---", morse.toMorse("BO"));
    }

    //************* 4 - Test: HELLO ***************//

    @Test
    public void toMorseTestHELLO(){

        Morse morse = new Morse();
        assertEquals(".... . .-.. .-.. ---", morse.toMorse("HELLO"));
    }

    //************* 5 - Test: YODA ***************//

    @Test
    public void toMorseTestYODA(){

        Morse morse = new Morse();
        assertEquals("-.-- --- -.. .-", morse.toMorse("YODA"));
    }

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//



    //***************************** Les Tests pour nettoyerAlpha ***********************************//


    @Test
    public void testNettoyerAlpha()
    {

        //******************** Test nettoyage de Alpha Text *******************//

        Morse morse = new Morse();

        assertEquals("", morse.nettoyerAlpha(" vide"));

    }

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//


    //***************************** Les Tests pour getNomProgrammeurs ***********************************//


    //************* 1 - Test: s ***************//

    @Test
    public void getNomProgrammeurs()
    {
        Morse morse = new Morse();

        assertEquals("Nidhal Marcos", morse.getNomProgrammeurs());
    }
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
}
