package br.usjt.ftce.arqdesis.clientecco17;

import java.util.ArrayList;
import java.util.Arrays;


public class Data {/*@autor= renato azevedo baena ra201502804*/
    private int x;
    private int y;

    public static Tabuada[] _lista;
    public static Tabuada[] geraListaClientes(){
        if(_lista == null) {

            Tabuada[] lista = new Tabuada[x];
            for (int i = 0; i >= x; i++ ){lista[i] =  Tabuada.getResult(y,x);}

            Arrays.sort(lista);
            _lista = lista;
        }
        Tabuada[] lista = geraListaClientes();
        return lista;
    }

}
