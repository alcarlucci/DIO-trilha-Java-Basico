# Curso Programação Orientada a Objetos (POO) - resumo

Apresentação dos conceitos relativos à Orientação a Objetos (OO).

## Definição

A Orientação a Objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas  unidades de software chamadas de objetos.

## Fundamentos

### Abstração

Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos.

### Reuso

Capacidade de criar novas unidades de código a partir de outras já existentes.

### Encapsulamento

Capacidade de esconder complexidades e proteger dados.

## Estruturas Básicas da OO - conceitos

### Classe

É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.

### Atributo

É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe.

### Método

É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento.

### Objeto

Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos.

### Mensagem

É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução  de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático.

## Relações entre Entidades

### Herança

É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.

- **Polimorfismo**: A mesma ação, se comportando diferente;
- **Sobrescrita**: A mesma ação, podendo se comportar diferente.

### Associação

Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos.

- **Estrutural**: Composição; Agregação;
- **Comportamental**: Dependência.

### Interface

Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza.

## Conceitos de Organização

### Pacotes (*package*)

São uma organização física ou lógica criada para separar classes com responsabilidades distintas. Com isso, espera-se que a aplicação fique mais organizada e seja possível separar classes de finalidades e representatividades diferentes.

### Visibilidades

Um modificador de acesso tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado. A utilização de modificadores de acesso é fundamental para o uso efetivo da Orientação a Objetos. Algumas boas práticas e conceitos só são atingidos com o uso corretos deles.

- **Private**: Só dentro a classe;
- **Protected**: Dentro da classe, mesmo pacote e subclasses;
- **Public**: Em qualquer lugar.

#
André Carlucci
