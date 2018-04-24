package com.example.bensnedalus.codemorse;

public class TraducteurMorseStub implements TraducteurMorse

{

    //****************** toAlpha **********************//

    @Override

    public String toAlpha(String morse)
    {

        if(morse.equals("."))

            return "E";

        if(morse.equals(".."))

            return"I";

        if(morse.equals("..."))

            return"S";

        if(morse.equals("...."))

            return"H";

        if(morse.equals("....."))

            return"5";

        if(morse.equals("..... ."))

            return"5E";

//-------------- au debut sa fonctionne apres sa ne fonctionne pas -----------//

        if(morse.equals("-"))

            return "T";

        if(morse.equals("--"))

            return"M";

        if(morse.equals("---"))

            return"O";

        if(morse.equals("--- "))

            return"O";

        if(morse.equals("--- -"))

            return"OT";

        //-------------- 3eme cas -----------//


        if(morse.equals("."))

            return "E";

        if(morse.equals(".."))

            return"I";

        if(morse.equals("..."))

            return"S";

        if(morse.equals("...."))

            return"H";

        if(morse.equals("....."))

            return"5";

        if(morse.equals("..... "))

            return"5";

        if(morse.equals("..... -"))

            return"5T";


        return " ";


    }

    //****************** toMorse **********************//

    @Override

    public String toMorse(String alpha)
    {
        alpha = nettoyerAlpha(alpha);

        if(alpha.equals("V"))

            return "...- ";

        if(alpha.equals("VA"))

            return"...- .- ";

        if(alpha.equals("VAD"))

            return"...- .- -.. ";

        if(alpha.equals("VADO"))

            return"...- .- -.. --- ";

        if(alpha.equals("VADOR"))

            return"...- .- -.. --- .-. ";

        return " ";
    }

    //****************** nettoyerAlpha **********************//

    @Override

    public String nettoyerAlpha(String alpha)
    {

        return alpha.toUpperCase();
    }

    //****************** getNomProgrammeurs **********************//

    @Override

    public String getNomProgrammeurs()
    {
        return "Stub";
    }

    //************************************************************//
}
