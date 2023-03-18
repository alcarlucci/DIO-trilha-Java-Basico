# Tipos e Variáveis

### Tipos de dados

Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos - *Java é fortemente "tipado"*. Os oito tipos primitivos em Java são:
 - byte
 - short
 - int
 - long
 - float
 - double
 - boolean
 - char

Utilize a classe **String** para representar um texto em uma aplicação.
```
String meuNome = "André Carlucci"
```

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
**André Carlucci**
