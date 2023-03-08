package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {

        Telefone tel = new Telefone();
        Telefone tel2 = new Telefone();
        Telefone tel3 = new Telefone();

        Contato cont1 = new Contato();
        Contato cont2 = new Contato();
        Contato cont3 = new Contato();

        cont1.nome = "rafaela";
        cont1.numero = " 1232134214";

        cont2.nome = "joão";
        cont2.numero = "213213123";

        cont3.nome = "Carmem";
        cont3.numero = "123123123";

        tel.cont1 = cont1;
        tel2.cont2 = cont2;
        tel3.cont3 = cont3;

        tel.cor = "Azul";
        tel2.cor = "verde";
        tel3.cor = "amarelo";

        tel.marca = "iphone";
        tel2.marca = "S20";
        tel3.marca = "iphone";


        System.out.println(tel.cont1.nome + tel.cont1.numero);
        System.out.println(tel2.cont2.nome + tel2.cont2.numero);
        System.out.println(tel3.cont3.nome + tel3.cont3.numero);

    }
}
