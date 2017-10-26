package br.usjt.ftce.arqdesis.clientecco17;



public class Tabuada {/*@autor= renato azevedo baena ra201502804*/
    private int multiplicador;
    private int vezes;

    public Tabuada(int multiplicador, int vezes) {
        this.multiplicador = multiplicador;
        this.vezes = vezes;
    }


    public int getMultiplicador() {

        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }
    public int getResult(int multiplicador,int vezes){
        int resultado = multiplicador * vezes;
        return resultado;
    }
}
