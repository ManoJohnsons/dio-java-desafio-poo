# DIO | Desafio: Utilizando POO para Montar um iPhone

Este repositório tem a finalidade de armazenar o projeto proposto pelo desafio da DIO, que consiste em representar o conceito do iPhone apresentado por Steve Jobs em 2007, utilizando o paradigma de programação orientada a objetos e ferramentas de diagramação para a elaboração do projeto.  

## Ferramenta Escolhida para Montar o Diagrama UML do Projeto

Nesta seção encontra-se o diagrama UML elaborado com base nas instruções do desafio e no vídeo de apresentação do primeiro iPhone por Steve Jobs.  

Primeiro, modelei o diagrama no diagram.net (Draw.io), aproveitando minha experiência prévia com a ferramenta.  

Posteriormente, descobri uma ferramenta de diagramação chamada Mermaid, que renderiza diretamente em Markdown, o que oferece maior praticidade ao manter tudo integrado ao Markdown.

## Diagrama UML do Projeto

```mermaid
---
title: Projeto — iPhone
---
classDiagram

%% Definindo as interfaces do projeto.
class ReprodutorMusical {
    <<interface>>
    + tocar() void
    + pausar() void
    + selecionarMusica(musica: String) void
}

class Telefone {
    <<interface>>
    + ligar(numero: String) void
    + atender() void
    + iniciarCorreioVoz() void
}

class NavegadorInternet {
    <<interface>>
    + exibirPagina(url: String) void
    + adicionarNovaAba() void
    + atualizarPagina() void
}

%% Definindo a classe do projeto.
class IPhone

%% Definindo as relações e cardinalidade entre os componentes no projeto.
ReprodutorMusical "1" <|.. "1" IPhone : implementa
Telefone "1" <|.. "1" IPhone : implementa
NavegadorInternet "1" <|.. "1" IPhone : implementa
```

## Fontes

- [Repositório do desafio proposto pela DIO.](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)
- [Steve Jobs apresenta primeiro iPhone legendado (2007)](https://www.youtube.com/watch?v=9ou608QQRq8)
