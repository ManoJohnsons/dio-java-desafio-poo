package edu.dio.poo.interfaces;

public interface Telefone {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void fazerConferencia(String[] numeros);
    void colocarLigacaoEmEspera();
}
