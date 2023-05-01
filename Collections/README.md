# Trabalhando com Java Collections - Guia de Uso

- Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, ou seja, agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.
- Serve para armazenar e processar conjuntos de dados de forma eficiente.

Contém os seguintes elementos:

- **Interfaces**: tipos abstratos que representam as coleções. Permitem que coleções sejam manipuladas tendo como base o conceito “Programar para interfaces e não para implementações”, desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces;
- **Implementações**: são as implementações concretas das interfaces;
- **Algoritmos**: são os métodos que realizam as operações sobre os objetos das coleções, tais como busca e ordenação.

## Hierarquia de Interfaces e Classes da Java Collections Framework

![image](https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg)

![image](https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image002.jpg)

## List

Coleções com iterações ordenadas.
Permite elementos duplicados e segue ordem de inserção.

- interface List (*java.util.List*):
  - ArrayList
  - LinkedList

- alguns métodos List:

```
toString()
indexOf()
add()
set()
contains()
toString()
get()
Collections.min()
Collections.max()
Collections.reverse()
iterator()
iterator().hasNext()
iterator().next()
size()
remove()
iterator().remove()
clear()
isEmpty()
```

## Set

Coleções com Singularidades.
Não permite elementos duplicados e não possui índice.

- interface Set (*java.util.Set*):
  - HashSet
  - LinkedHashSet
  - TreeSet

- alguns métodos Set:

```
toString()
contains()
toString()
Collections.min()
Collections.max()
iterator()
iterator().hasNext()
iterator().next()
size()
remove()
iterator().remove()
new LinkedHashMap()
new TreeMap()
clear()
isEmpty()
addAll()
```

## Map

Coleções de Pares Chave/Valor.
Elementos únicos da chave (key) para cada valor (value).

- interface Map (*java.util.Map*):
  - HashMap
  - LinkedHashMap
  - TreeMap

- alguns métodos Map:

```
put()
containsKey()
get()
keySet()
values
entrySet();
getValue();
getKey();
iterator()
iterator().hasNext()
iterator().next()
LinkedHashMap()
clear()
isEmpty()
```
