package com.example.bensnedalus.codemorse;

import android.content.Context;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{

    //************** Déclarations des variables **************//
    EditText alpha;
    EditText morse;
    String ajouterAlpha = "";
    String monAlphaText  = "";
    String monMorseText  = "";

    TraducteurMorse morseObj = new Morse();
    boolean semaphore=true;

    //**********************************
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*********************************
        alpha = findViewById(R.id.cAlpha);
        morse = findViewById(R.id.cMorse);

        closeKeyboard();
        TextView back = findViewById(R.id.front);
        back.setText("Front Back-end: " + morseObj.getNomProgrammeurs());

        //*********************************

        //******************* pour faire disparaitre le clavier *****************//
    }

    private void closeKeyboard()
    {
        View view = this.getCurrentFocus();
        if (view != null)
        {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }


        //*************** Pour changer textView dans morse ******************//

        morse.addTextChangedListener(new TextWatcher()
        {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {

            }

            @Override
            public void afterTextChanged(Editable editable)
            {


                TextView textViewSorti = (TextView) findViewById(R.id.sortieTexte);
                textViewSorti.setText(morseObj.toAlpha(editable.toString()));
                TextView textViewEntre = (TextView) findViewById(R.id.entrerTexte);
                textViewEntre.setText(morseObj.nettoyerAlpha(editable.toString()));


            }
        });

        //*************** Pour changer textView dans alpha ******************//


        alpha.addTextChangedListener(new TextWatcher()
        {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {


            }

            @Override
            public void afterTextChanged(Editable editable)
            {


                TextView textViewSorti = (TextView) findViewById(R.id.sortieTexte);
                textViewSorti.setText(morseObj.toMorse(editable.toString()));
                TextView textViewEntre = (TextView) findViewById(R.id.entrerTexte);
                textViewEntre.setText(morseObj.nettoyerAlpha(editable.toString()));


            }
        });

        //**********************************************************************//

    }

    public void maMethode(View view)
    {
        System.out.println(((Button)view).getText());
    }
    //************* Boutton pour le point **************//

    public  void point(View p)
    {
       Button po = (Button) p;
       po.setText(".");
        monMorseText = monMorseText+".";
        morse.setText(monMorseText);

    }
    //************* Boutton pour le moins **************//

    public void moins(View v)
    {
        Button b =  (Button) v;
        b.setText("-");
        monMorseText = monMorseText+"-";
        morse.setText(monMorseText);

    }
    //************* Boutton pour le slash **************//

    public  void slach(View s)
    {
        Button sl =  (Button) s;
        sl.setText("/");
        monMorseText = monMorseText+"/";
        morse.setText(monMorseText);

    }
//************* Boutton Jouer NON operationelle ***********//

    public  void jouer(View j)
    {
        Button jo = (Button) j;
        jo.setText("jouer");

    }
    //******** Boutton Jouer NON operationelle **********//

    public  void Effacer(View efa)
    {
        monAlphaText = "";
        monMorseText = "";
        morse.setText(monAlphaText);
        alpha.setText(monMorseText);

    }
    //************* Boutton Espace **************//

    public  void espace(View e)
    {

        monMorseText += " ";
        morse.setText(monMorseText);

    }


}
