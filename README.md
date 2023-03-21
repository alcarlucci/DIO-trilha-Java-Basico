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

### Operadores

Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações. São classificados em:

 - **Atribuição**: representado pelo símbolo de igualdade `=`
 - **Aritméticos**: `+` (adição), `-` (subtração), `*` (multiplicação) e `/` (divisão)
 - **Unários**:
   - `+` **valor positivo**: números são positivos sem esse operador explicitamente;
   - `-` **valor negativo**: negativa um número ou expressão aritmética;
   - `++` **incremento de valor**: incrementa o valor em 1 unidade;
   - `--` **decremento de valor**: decrementa o valor em 1 unidade;
   - `!` **lógico de negação**: nega o valor de uma expressão booleana;
 - **Ternário**: `<Expressão Condicional> ? <Caso seja true> : <Caso seja false>`
```
String resultado = (a==b) ? "verdadeiro" : "false";
```
 - **Relacionais**: avaliam a relação entre duas variáveis ou expressões
   - `==` verificar se uma variável é IGUAL A outra.
   - `!=` verificar se uma variável é DIFERENTE da outra.
   - `>` verificar se uma variável é MAIOR QUE a outra.
   - `>=` verificar se uma variável é MAIOR OU IGUAL a outra.
   - `<` verificar se uma variável é MENOR QUE outra.
   - `<=` verificar se uma variável é MENOR OU IGUAL a outra.
 - **Lógicos**:
   - `&&` Operador Lógico "E";
   - `||` Operador Lógico "OU".

### Métodos

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.

**Critério de nomeação de Métodos**
 - Deve ser nomeado como verbo;
 - Seguir o padrão *camelCase* (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

**Critério de definição de métodos**
 - Qual a proposta principal do método?
 - Qual o tipo de retorno esperado após executar o método?
```
Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.
```
 - Quais os parâmetros serão necessários para execução do método?
 - O método possui o risco de apresentar alguma exceção?
 - Qual a visibilidade do método?

Exemplo de uma classe com dois métodos:
```
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	
	// throws Exception: indica que o método poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
}
```

### Escopo

- Em Java, o escopo de variáveis vai **de acordo com o bloco onde ela foi declarada**;
- A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence;
- Em uma Classe os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos da Classe;
- Caso declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

Três tipos iniciais de escopo:
- **Escopo de Classe**: variáveis declaradas no corpo principal da Classe;
- **Escopo de método**: variáveis declaradas dentro do corpo de um método;
- **Escopo de fluxo**: variáveis declaradas dentro de controles de fluxo (*for* por exemplo);

### Palavras reservadas

São **identificadores de uma linguagem que já possuem uma finalidade específica**, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas, todas escritas com letra minúscula.

Grupos de classificação das palavras reservadas:
- Controle de pacotes: **import; package;**
- Modificadores de acesso: **public; private; protected;**
- Primitivos: **boolean; byte; char; double; float; int; long; short; void;**
- Modificadores de classes, variáveis ou métodos: **abstract; class; extends; final; implements; interface; native; new; static; strictfp; synchronized; transient; volatile;**
- Controle de fluxo dentro de um bloco de código: **break; case; continue; default; do; else; for; if; instanceof; return; switch; while;**
- Tratamento de erros: **assert; catch; finally; throw; throws; try;**
- Variáveis de referência: **super; this;**
- Palavras reservadas não utilizadas: **const; goto;**
- Literais reservados: **null; true; false**.

### Estruturas de Controle de Fluxo

São estruturas que tem a capacidade de direcionar o fluxo de execução do código.

Tipos:
- **Decisão**: `if` ; `if-else` ; `if-else-if` ; `switch` ; e operador ternário
- **Repetição**: `for` ; `while` ; `do while`
- **Interrupção**: `break` ; `continue` ; `return`

##
Bons estudos!!!

**André Carlucci**
