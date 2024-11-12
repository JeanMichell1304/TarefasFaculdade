Aqui está a descrição de como é e como utilizar os programas citados logo abaixo.

    Calculadora de Desconto: 

Descrição

    Calcula o valor do Imposto de Transmissão de Bens Imóveis (ITBI) com base no valor de transação do imóvel, valor venal e a porcentagem do imposto.
    Descrição

Este programa calcula o valor de desconto aplicado a um produto, além de exibir o preço final após o desconto.

    Como funciona:
O programa solicita ao usuário que informe o valor original do produto e a porcentagem de desconto.
O valor do desconto é calculado multiplicando o valor do produto pela porcentagem de desconto.
O preço final do produto é obtido subtraindo o valor do desconto do valor original.
O programa exibe o valor do desconto e o preço final.

Como executar:
Para executar o programa CalculadoraDesconto, siga os mesmos passos de compilação e execução:

1. Compile o código:
    javac CalculadoraDesconto.java

2. Execute o programa:
    java CalculadoraDesconto

Aqui tenho um exemplo de como deverá funcionar:

Entrada:

    Valor do produto: 500,00
    Porcentagem de desconto: 10%

Saída:
    Valor do Desconto R$ 500,00
    Preço final do produto R$ 450,00

    ------------------------------------------------------------------------------------------------------------------------------------
    

    Calculadora ITBI

Descrição

    Este programa calcula o valor do Imposto de Transmissão de Bens Imóveis (ITBI) com base nas informações fornecidas pelo usuário. O ITBI é um imposto pago durante a transferência de propriedade de imóveis. O programa solicita o valor de transação do imóvel, o valor venal do imóvel e a porcentagem do imposto ITBI, e então calcula o valor do imposto com base no maior valor entre o valor de transação e o valor venal.

    Como Funciona:
O programa solicita ao usuário que informe o valor de transação do imóvel, o valor venal do imóvel e a porcentagem do imposto ITBI.
O imposto ITBI é calculado com base no maior valor entre o valor de transação e o valor venal.
O programa exibe o valor do ITBI a ser pago em uma caixa de diálogo.

    Como Executar:

1. Compile o código:
    javac CalculadoraITBI.java

2. Execute o programa:
    java CalculadoraITBI
    
----------------------------------------------------------------------------------------------------------------------------------------
    
    
    Sistema de Avaliação

Descrição

Este programa calcula a média de um aluno com base nas notas de duas provas e de um trabalho. Ele também informa se o aluno está aprovado ou reprovado. O critério de aprovação é uma média maior ou igual a 6.

    Como Funciona:

O programa solicita ao usuário as notas das duas provas e do trabalho.
Calcula a média das três notas.
Exibe a média e o status do aluno (Aprovado ou Reprovado).

    Como Executar:

1. Compile o código com o comando:
    javac SistemaDeAvaliacao.java

2. Execute o programa com:
    java SistemaDeAvalicao

Aqui está um exemplo de como o programa deverá se comportar:

    Exemplo de Entrada e Saída:

Entrada:

Valor de transação do imóvel: 300.000
Valor venal do imóvel: 280.000
Porcentagem do imposto ITBI: 3%

Saída:
    O valor do ITBI a ser pago é: R$ 9000.00

---------------------------------------------------------------------------------------------------------------------------


    Calculadora de Aposentadoria

Descrição

Este programa simula uma calculadora de aposentadoria, utilizando a entrada de dados do usuário para calcular se ele pode ou não se aposentar. O cálculo leva em consideração a idade, o sexo e o tempo de contribuição. O programa segue as regras de aposentadoria brasileiras:

Homens: Aposentadoria por idade aos 65 anos ou por tempo de contribuição com 35 anos.
Mulheres: Aposentadoria por idade aos 60 anos ou por tempo de contribuição com 30 anos.
Através de um simples JOptionPane, o usuário insere seus dados e o programa retorna se ele já pode se aposentar ou quantos anos faltam para a aposentadoria, considerando ambos os critérios: por idade e por tempo de contribuição.


    Como funciona:

1. O programa solicita ao usuário:

Idade.
Sexo (masculino ou feminino).
Anos de contribuição.
Com esses dados, o programa verifica:

Se o usuário já pode se aposentar por qualquer um dos critérios (idade ou tempo de contribuição).
Se não, calcula quantos anos faltam para que ele se aposente por idade e/ou por tempo de contribuição.
O programa exibe a mensagem informando o resultado, utilizando caixas de diálogo JOptionPane.

    Regras de Aposentadoria
Homens:
Aposentadoria por idade: 65 anos.
Aposentadoria por tempo de contribuição: 35 anos.
Mulheres:
Aposentadoria por idade: 60 anos.
Aposentadoria por tempo de contribuição: 30 anos.

    Como Executar:

Compile o código 
    javac CalculadoraAposentadoria.java

Execute o código:
    java CalculadoraAposentadoria

Aqui está um exemplo de como o código deverá se comportar:

Entrada:

    Idade: 62 anos
    Sexo: Feminino
    Anos de contribuição: 32

Saida:

    Você já pode se aposentar por ambos os critérios!

Exemplo 2:

Entrada:

    Idade: 55 Anos
    Sexo: Masculino
    Anos de contribuição: 33

Saida:

    Faltam 10 anos para se aposentar por idade
    Faltam 2 anos para se aposentar por tempo de contribuição

---------------------------------------------------------------------------------------------------------------------------


