package edu.dio.poo.dispositivo;

import edu.dio.poo.interfaces.NavegadorInternet;
import edu.dio.poo.interfaces.ReprodutorMusical;
import edu.dio.poo.interfaces.Telefone;

public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo o conteúdo da página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void trocarDeAba(String url1, String url2) {
        System.out.println("Trocando de aba: ");
        System.out.println("De: " + url1);
        System.out.println("Para: " + url2);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void fazerConferencia(String[] numeros) {
        System.out.println("Fazendo conferência com os números: ");
        for (String numero : numeros) {
            System.out.println(numero);
        }
    }

    @Override
    public void colocarLigacaoEmEspera() {
        System.out.println("Colocando ligação em espera...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMúsica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
