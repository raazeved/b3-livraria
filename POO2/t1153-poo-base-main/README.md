# PRECIFICAÇÃO DE OPÇÕES DE JUROS  

A precificação de ativos financeiros são uma parte importante para entender como o mercado de derivativos permite ao investidor diversas estratégias de especulação e, principalmente, hedge. E um dos seus conceitos fundamentais é o modelo de Black-Scholes.

Black-Scholes é o nome dado a um modelo de precificação de opções que se tornou muito famoso desde a sua criação.

![Derivativos](https://github.com/raazeved/B3ADA/blob/main/POO2/t1153-poo-base-main/black-schoules-800x450.jpg)

## R E S U M O 

I  - O que é Black-Scholes? 

II - Como funciona o Black-Scholes?

III- A fórmula Black-Scholes

IV - Quando surgiu o modelo de Black and Scholes?

V  - Quais as vantagens e desvantagens de investir em opções?


-----------------------------

## I - O QUE É BLACK-SHOLES?

Também conhecido como Black-Scholes-Merton, Black-Scholes foi o primeiro modelo amplamente difundido para precificação de opções.

Ele é utilizado para calcular o valor teórico das opções usando uma série de variáveis, como os preços atuais das ações, preço de exercício da opção, dividendos esperados, taxas de juros projetadas, tempo de expiração e volatilidade esperada.


## II - COMO FUNCIONA O BLACK SHOLES ?  

A fórmula de Black-Scholes foi desenvolvida na década de 70 por Fischer Black, Robert Merton e Myron Scholes.

No entanto, não é todo preço de opção que pode ser calculado através da fórmula. A opção precisa ser do tipo europeu. Ou seja, o detentor da opção só pode exercer seu direito do contrato na data do exercício. Já na modalidade de opções americana, do qual o detentor da opção pode exercer o seu direito a qualquer momento, a fórmula não funciona tão bem. Mesmo calculando o preço de opções europeias o modelo possui algumas premissas. São elas:

O comportamento do preço da ação corresponde a um modelo logarítmico normal com desvio padrão e média constante;
Não há custos de transação;
Os contratos são divisíveis;
Não há arbitragem possível;
A negociação de títulos e ações é contínua;
Todos os investidores possuem a mesma taxa livre de risco;
A taxa de juros livre de risco no curto prazo é constante.


## III - A FORMULA BLACK SHOLES  
A fórmula Black-Scholes é uma equação diferencial que leva em conta diversas informações a respeito da opção negociada: A equação de black scholes envolve uma matemática bastante avançada, mas não é necessário nenhum conhecimento matemático para utilizar o modelo.
No entanto, será demonstrado aqui o que constitui cada equação para uma compreensão do que significa esses cálculos

![Precificação](https://github.com/raazeved/B3ADA/blob/main/POO2/t1153-poo-base-main/Formula_Backsholes.jpg)

(∂V/∂t) + (1/2σ²S²[ ∂²V/ ∂S/2]) + (rS[∂V/∂S]) – rV = 0
Onde: 
V= preço da opção
S = preço do ativo
t = tempo
r = taxa livre de risco
σ = volatilidade

Entretanto, ao usar uma calculadora, será preciso apenas colocar os dados acima, sem se preocupar em saber como fazer cálculos com derivadas. Assim, a calculadora te dará o preço da opção no valor presente.

Por fim, o modelo Black-Scholes é o mais utilizado no mundo para precificar opções europeias de ações por conseguir chegar o mais perto possível do preço real futuro.


## IV - QUANDO SURGIU O MODELO DE BLACK AND SCHOLES? 

![Calculo](https://github.com/raazeved/B3ADA/blob/main/POO2/t1153-poo-base-main/CalculoOpcao.png) 
Os economistas Fischer Black e Myron Scholes demonstraram em 1968 que uma revisão dinâmica do portfólio remove o retorno esperado de uma ação, criando assim um conceito denominado apreçamento neutro ao risco.

Baseando-se nas descobertas de economistas anteriores, os dois profissionais buscaram aplicar a fórmula nos mercados, mas tiveram perdas financeiras provenientes da falta de gestão de risco em suas operações.

Os economistas continuaram seus esforços e, em 1973, publicaram um artigo sobre o tema, chamado “The Pricing of Options and Corporate Liabilities”.

Outro economista, Robert Merton publicou outro artigo expandindo o entendimento matemático desse método de precificação de opções. Foi nesse artigo que foi usado o termo “Model Black-Scholes de precificação de opções”.

Essa fórmula aumentou a popularidade do trade de opções, especialmente no ambiente da bolsa de valores de Chicago (CBOT), o que legitimou a teoria.

Merton e Scholes receberam o prêmio Nobel de economia em 1997. Black não recebeu o prêmio porque já havia falecido. Até hoje, o modelo é muito utilizado, fato comprovado pelo número de calculadora black scholes disponível na internet.

##  V - QUAIS AS VANTAGENS E DESVANTAGENS DE INVESTIR EM OPÇÕES? 

![Calculo](https://github.com/raazeved/B3ADA/blob/main/POO2/t1153-poo-base-main/CalculoOpcao2.png) 
O mercado de opções possui muitas particularidades, permitindo ganhos muito maiores do que o simples investimento em ações. No entanto, é preciso ter cuidado para não perder dinheiro. Primeiramente, investir em opções pode servir como um hedge aos seus investimentos. Sendo assim, é uma forma do investidor se proteger em momentos de queda.  Além disso, é possível ganhar ainda mais dinheiro através da alavancagem, que permite pegar dinheiro emprestado para investir.

No entanto, operações com opções são voltadas para investidores com baixa aversão ao risco, pois é possível perder muito dinheiro caso a operação dê errado. E com a alavancagem, é possível perder mais de 100% do valor investido.

Por isso, muitos investidores preferem investimentos de longo prazo, tornando-se sócios de boas empresas e acumulando patrimônio ao longo do tempo.


