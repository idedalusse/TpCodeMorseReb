package com.example.bensnedalus.codemorse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AlphabetIndexer;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //************** Déclarations des variables **************//
    EditText alpha;
    EditText morse;
    String ajouterAlpha = "";
    String monAlphaText  = "";
    String monMorseText  = "";


    //**********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*********************************
        alpha = findViewById(R.id.cAlpha);
        morse = findViewById(R.id.cMorse);
        //*********************************

        morse.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                       // System.out.println("hello");

                        if (editable.length() == 0)
                        {
                            morse.setText(alpha.getText());// on montre en meme temps que l'on crris
                        }

                    }
                }
        );
        //**********************************

    }

    /*public void ecrirIci (View n){

        alpha = (alpha.getText().toString())

    }*/



    public void maMethode(View view)
    {
        System.out.println(((Button)view).getText());
    }

    public  void point(View p)
    {
       Button po = (Button) p;
       po.setText(".");
        monMorseText = monMorseText+".";
        //monAlphaText = monAlphaText+".";
        morse.setText(monMorseText);
       // alpha.setText(monAlphaText);
        //System.out.println(((Button)p).getText());
    }

    public void moins(View v)
    {
        Button b =  (Button) v;
        b.setText("-");
        monMorseText = monMorseText+"-";
        //alpha.setText("-");
        morse.setText(monMorseText);
       // System.out.println(((Button)v).getText());
    }

    public  void slach(View s)
    {
        Button sl =  (Button) s;
        sl.setText("/");
        monMorseText = monMorseText+"/";
        morse.setText(monMorseText);
       // morse.setText("/");
       // ajouterAlpha += ajouterAlpha + "/";
        // System.out.println(((Button)s).getText());
    }

    public  void jouer(View j)
    {
        Button jo = (Button) j;
        jo.setText("jouer");
        //System.out.println(((Button)j).getText());

    }

    public  void Effacer(View efa)
    {
        Button ef = (Button) efa;
        ef.clearComposingText();

        //alpha.setText("");
       // morse.setText("");
        monMorseText = "";
        monAlphaText = "";
        // cursseur focus
        morse.setSelection(morse.length()-1);
        morse.requestFocus();

        //alpha.setText(monAlphaText);
        // morse.getText().clear();
        // System.out.println(((Button)efa).getText());
    }

    public  void espace(View e)
    {
        //Button es = (Button) e;
        //es.setText(" ");
        //alpha.setText(" ");
        //morse.setText(" ");
        monMorseText += " ";
        morse.setText(monMorseText);

        //System.out.println(((Button)e).getText());

    }
}
