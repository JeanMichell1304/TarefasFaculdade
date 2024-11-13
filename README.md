# Projetos em Java

Este repositório contém vários programas em Java, cada um com uma funcionalidade específica. Abaixo, você encontra a descrição de cada programa, seu funcionamento e instruções para executá-los.

---

## 1. Calculadora de Desconto

### Descrição

Este programa calcula o valor de desconto aplicado a um produto, além de exibir o preço final após o desconto.

### Como funciona:

1. O programa solicita ao usuário que informe:
    - O **valor original** do produto.
    - A **porcentagem de desconto**.
2. O **valor do desconto** é calculado multiplicando o valor do produto pela porcentagem de desconto.
3. O **preço final** do produto é obtido subtraindo o valor do desconto do valor original.
4. O programa exibe o **valor do desconto** e o **preço final**.

### Como executar:

1. Compile o código:

    ```bash
    javac CalculadoraDesconto.java
    ```

2. Execute o programa:

    ```bash
    java CalculadoraDesconto
    ```

### Exemplo de entrada e saída:

**Entrada:**
    Valor do produto: 500,00 Porcentagem de desconto: 10%


**Saída:**
    Valor do Desconto: R$ 50,00 Preço final do produto: R$ 450,00

    
---

## 2. Calculadora ITBI

### Descrição

Este programa calcula o valor do Imposto de Transmissão de Bens Imóveis (ITBI) com base nas informações fornecidas pelo usuário. O ITBI é um imposto pago durante a transferência de propriedade de imóveis. O programa solicita o valor de transação do imóvel, o valor venal do imóvel e a porcentagem do imposto ITBI, e então calcula o valor do imposto com base no maior valor entre o valor de transação e o valor venal.

### Como funciona:

1. O programa solicita ao usuário que informe:
    - O **valor de transação** do imóvel.
    - O **valor venal** do imóvel.
    - A **porcentagem do imposto ITBI**.
2. O imposto **ITBI** é calculado com base no maior valor entre o valor de transação e o valor venal.
3. O programa exibe o **valor do ITBI** a ser pago.

### Como executar:

1. Compile o código:

    ```bash
    javac CalculadoraITBI.java
    ```

2. Execute o programa:

    ```bash
    java CalculadoraITBI
    ```

### Exemplo de entrada e saída:

**Entrada:**
    Valor de transação do imóvel: 300.000 Valor venal do imóvel: 280.000 Porcentagem do imposto ITBI: 3%
    
**Saída:**
     valor do ITBI a ser pago é: R$ 9.000,00

     
---

## 3. Sistema de Avaliação

### Descrição

Este programa calcula a média de um aluno com base nas notas de duas provas e de um trabalho. Ele também informa se o aluno está aprovado ou reprovado. O critério de aprovação é uma média maior ou igual a **6**.

### Como funciona:

1. O programa solicita ao usuário as notas das:
    - **Duas provas**.
    - **Um trabalho**.
2. Calcula a **média** das três notas.
3. Exibe a **média** e o **status do aluno** (Aprovado ou Reprovado).

### Como executar:

1. Compile o código:

    ```bash
    javac SistemaDeAvaliacao.java
    ```

2. Execute o programa:

    ```bash
    java SistemaDeAvaliacao
    ```

### Exemplo de entrada e saída:

**Entrada:**
    Nota da prova 1: 7 Nota da prova 2: 5 Nota do trabalho: 8

    
**Saída:**
    Média: 6.67 Status: Aprovado

    
---

## 4. Calculadora de Aposentadoria

### Descrição

Este programa simula uma calculadora de aposentadoria, utilizando a entrada de dados do usuário para calcular se ele pode ou não se aposentar. O cálculo leva em consideração a **idade**, o **sexo** e o **tempo de contribuição**. O programa segue as regras de aposentadoria brasileiras:

- **Homens**: Aposentadoria por idade aos 65 anos ou por tempo de contribuição com 35 anos.
- **Mulheres**: Aposentadoria por idade aos 60 anos ou por tempo de contribuição com 30 anos.

Através de um simples **JOptionPane**, o usuário insere seus dados e o programa retorna se ele já pode se aposentar ou quantos anos faltam para a aposentadoria, considerando ambos os critérios: por idade e por tempo de contribuição.

### Como funciona:

1. O programa solicita ao usuário:
    - **Idade**.
    - **Sexo** (masculino ou feminino).
    - **Anos de contribuição**.
2. Com esses dados, o programa verifica:
    - Se o usuário já pode se aposentar por qualquer um dos critérios (idade ou tempo de contribuição).
    - Se não, calcula quantos anos faltam para que ele se aposente por idade e/ou por tempo de contribuição.
3. O programa exibe a mensagem informando o resultado, utilizando caixas de diálogo **JOptionPane**.

### Regras de Aposentadoria:

- **Homens**:
  - Aposentadoria por **idade**: 65 anos.
  - Aposentadoria por **tempo de contribuição**: 35 anos.
  
- **Mulheres**:
  - Aposentadoria por **idade**: 60 anos.
  - Aposentadoria por **tempo de contribuição**: 30 anos.

### Como executar:

1. Compile o código:

    ```bash
    javac CalculadoraAposentadoria.java
    ```

2. Execute o programa:

    ```bash
    java CalculadoraAposentadoria
    ```

### Exemplo de entrada e saída:

**Exemplo 1:**

**Entrada:**
    Idade: 62 anos 
    Sexo: Feminino 
    Anos de contribuição: 32

    
**Saída:**
    Você já pode se aposentar por ambos os critérios!

    
---

**Exemplo 2:**

**Entrada:**
    Idade: 55 anos 
    Sexo: Masculino 
    Anos de contribuição: 33

    
**Saída:**
    Faltam 10 anos para se aposentar por idade 
    Faltam 2 anos para se aposentar por tempo de contribuição

    
---



---

## 5. Circuito de Resistências

### Descrição

Este programa calcula a resistência equivalente de um circuito em série com base em quatro resistências fornecidas pelo usuário. Além disso, ele exibe a maior e a menor resistência do circuito.

### Como funciona:

1. O programa solicita ao usuário as quatro resistências.
2. O programa calcula a resistência equivalente somando os valores das resistências.
3. O programa identifica e exibe a maior e a menor resistência.

### Como executar:

1. Compile o código:

    ```bash
    javac CircuitoResistencias.java
    ```

2. Execute o programa:

    ```bash
    java CircuitoResistencias
    ```

### Exemplo de entrada e saída:

**Entrada:**

 Resistência 1: 5.0 Resistência 2: 10.0 Resistência 3: 3.0 Resistência 4: 8.0
 
**Saída:**

 Resistência Equivalente: 26.0 Maior Resistência: 10.0 Menor Resistência: 3.0
 
---

## 5. Sistema de Login

### Descrição

Este programa simula o acesso a um sistema solicitando **login** e **senha**. O usuário tem **3 tentativas** para acertar, e o sistema compara os dados inseridos com os valores corretos: **"java8"**. O programa exibe mensagens de erro informativas a cada falha.

### Como funciona:

1. O programa solicita ao usuário que informe:
    - **Login**.
    - **Senha**.
2. O programa compara os dados inseridos com os valores corretos (**"java8"** para login e senha).
3. O usuário tem até **3 tentativas** para acertar, com mensagens de erro a cada falha.

### Como executar:

1. Compile o código:

    ```bash
    javac SistemaDeLogin.java
    ```

2. Execute o programa:

    ```bash
    java SistemaDeLogin
    ```

### Exemplo de entrada e saída:

**Entrada:**
    Login: java8
    Senha: java8

    
**Saída:**
    Login bem-sucedido!

**Entrada (tentativa falha):**
    Login: admin
    Senha: 1234

    
**Saída:**
    Login ou senha incorretos. Você tem 2 tentativa(s) restante(s).