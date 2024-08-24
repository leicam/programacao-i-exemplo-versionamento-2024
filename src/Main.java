// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //exemplo de instancia de classe
        // (nao cai na prova)
        //Main main = new Main();
        //main.exercicioUm();

        exercicioUm();
    }

    //primeiro: definimos o modificador de acesso
    //public protected private

    //segundo: se o metodo e de instancia ou estatico
    // por padrao todo os metodos declarados sao
    // de instancia, fica a cargo o desenvolvedor
    // utilizar a palavra reservada static

    //terceiro: o tipo de retorno de metodo
    // podem ser tipo primitivos: Integer, Double, Float
    // pode apenas executar algo, sem retorno: void
    // (futuramete iram aprender) Tipos Complexos:
    // classes criadas pelo desenvolvedor

    //quarto: o nome do metodo (regra do Java sempre
    // iniciar com letra minuscula)
    // e os parametros de entrada
    // 0 : N -> Tipos Primitivos ou Complexos

    public static void exercicioUm(){
        //Quais sao os operadores logicos do JAVA?
        //&& (AND) - || (pipe = OU) - ! (NEGAÇÃO)

        Boolean verdadeiroUm = true;
        Boolean verdadeiroDois = true;
        Boolean falsoUm = false;

        Boolean resultadoUm;

        resultadoUm = (verdadeiroUm && falsoUm) ||
                (verdadeiroUm && verdadeiroDois);

        System.out.println("verdadeiroUm: " + resultadoUm);

        Boolean resultadoDois;

        resultadoDois = (verdadeiroUm || !falsoUm) &&
                (!verdadeiroUm && verdadeiroDois);

        System.out.println("resultadoDois: " + resultadoDois);

        Boolean resultadoTres;

        resultadoTres = verdadeiroUm || falsoUm && verdadeiroDois;

        System.out.println("resultadoTres: " + resultadoTres);

        Boolean resultadoQuatro;

        resultadoQuatro = verdadeiroUm || falsoUm || verdadeiroUm
                && !verdadeiroDois && !falsoUm;

        System.out.println("resultadoQuatro: " + resultadoQuatro);

        Boolean resultadoCinco;

        resultadoCinco = (verdadeiroUm || falsoUm || verdadeiroUm)
                && !verdadeiroDois && !falsoUm;

        System.out.println("resultadoCinco: " + resultadoCinco);

        Boolean resultadoSeis;

        resultadoSeis = !(verdadeiroUm || falsoUm) && verdadeiroDois;

        System.out.println("resultadoSeis: " + resultadoSeis);
    }
}