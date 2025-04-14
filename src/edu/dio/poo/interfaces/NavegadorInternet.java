package edu.dio.poo.interfaces;

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
    void trocarDeAba(String url1, String url2);
}
