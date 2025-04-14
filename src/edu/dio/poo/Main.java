package edu.dio.poo;

import edu.dio.poo.dispositivo.IPhone;

public class Main {
    public static void main(String[] args) {
        String[] numeros = {"11 91111-1111", "21 92222-2222"};
        IPhone iphone = new IPhone();

        iphone.selecionarMúsica("Take Me to the Beach (feat. Ado)");
        iphone.tocar();
        iphone.pausar();
        iphone.ligar(numeros[0]);
        iphone.atender();
        iphone.fazerConferencia(numeros);
        iphone.exibirPagina("google.com");
        iphone.trocarDeAba("google.com", "youtube.com");
    }
}
