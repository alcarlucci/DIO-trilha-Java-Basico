**Repositório criado para resumo e exemplos do curso de Java Básico da DIO.**

# Java Básico - Sintaxe Java: resumão do curso

### Funcionalidades (features)

A Linguagem Java é composta por um conjunto bem definido de funcionalidades (features):
- Simples
 - Orientada a Objeto
 - Plataforma independente
 - Portátil (Write Once Run Anywhere - WORA)
 - Robusta
 - Segura
 - Interpretada
 - Multi-thread

### Anatomia das classes

Sintaxe de declaração de uma nova classe:
 - 99,9% das nossas classes iniciarão com public class;
 - Toda classe precisa de nome, exemplo MinhaClasse (primeiras letras em maiúsculo);
 - O nome do arquivo deve ser idêntico ao nome da classe pública;
 - Após o nome, definir o corpo { } , compondo nossas classes com atributos e métodos;
 - Classes executáveis devem ter o método "main" definido;

### Padrão de nomenclatura

É recomendado seguir algumas convenções de escrita do código em Java:
 - **Arquivo .java**: deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula;
 - **Nome da classe no arquivo**: A classe deve possuir o mesmo nome do arquivo.java;
 - **Nome de variável**: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA;
 - **Variável que não sofrerá alteração de valor**: toda em MAIÚSCULA.

### Declarando variáveis e métodos

 - Declarar uma variável em Java segue sempre a seguinte estrutura:
```
Tipo nomeBemDefinido = Atribuição [opcional em alguns casos]

// Exemplo
int idade = 23;
double altura;
```

- Declarando métodos em Java segue uma estrutura bem simples:
```
TipoRetorno nomeObjetivoNoInfinitivo Parametro(s)

//Exemplo
int somar (int numeroUm, int numero2)
```

### Organizando arquivos

Os arquivos de um projeto em Java podem ser organizados em um estrutura de sub-diretórios (pastas) através de pacotes (*packages*).

Possível estrutura (path) para um package: `area.empresa.aplicação.finalidade`
 - Área: com (comercial); org (organizacional); edu (educacional)
 - Empresa: nome da empresa
 - Aplicação: nome do aplicação em desenvolvimento
 - Finalidade: app; model; util; service

### Java Beans

A comunidade Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

#### Variáveis
 - Deve ser clara, sem abreviações ou definição sem sentido;
 - Sempre no singular, exceto quando se referir a um array ou coleção;
 - Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.
```
double salarioMedio=1500.23;
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"}
```

#### Métodos
 - nomeados como verbos;
 - através de uma mistura de letras minúsculas e maiúsculas;
 - Em princípio todas as letras devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra;
 - ter uma única finalidade.
```
somar(int n1, int n2){}
abrirConexao(){}
findById(int id){}
```

### Tipos de dados

Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos - *Java é fortemente "tipado"*. Os oito tipos primitivos em Java são:
 - int
 - byte
 - short
 - long
 - float
 - double
 - boolean
 - char

Na grande maioria das vezes utilizaremos o tipo `int` para representar números inteiros e `double` para representar números fracionados.

### Variáveis e Constantes

Uma **variável** é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo, sendo que o valor armazenado pode variar. A estrutura padrão para se declarar uma variável é:
```
<Tipo> <nomeVariavel> <atribuicaoDeValor_Opcional>;
```

Já as **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada `final`, seguida do tipo. Por convenção, Constantes são sempre escritas em CAIXA ALTA. A estrutura padrão para se declarar uma constante é:
```
final <Tipo> <NOME_CONSTANTE> = <Valor>;
```

##
Bons estudos!!!

**André Carlucci**
