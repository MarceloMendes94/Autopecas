# Documento de Requisitos
# Sistema e commerce para auto peças

### índice 

1. Mini mundo.
2. Diagrama de classes
3. Requisitos do sistema
   1. Requisitos funcionais. 
   2. Requisitos não funcionais. 
   3. Regras de negócio.
4. Casos de Uso
<hr>  
 Grupo: David Villaça, Douglas Bolis, Ewerson Vieira, Marcelo Mendes.
<hr>

### 1. Mini mundo.
Nosso cliente Alan entrou em contato com a necessidade de um e commerce para sua loja de Autopeças especializada em alternadores, pequenos geradores que através de um eixo conectado por uma polia ao motor aproveitam o trabalho para gerar energia para bateria do carro, em conversa ele relatou o seguinte:
* Seus clientes estão tendo um problema que é não saber se uma determinada peça é ofertada em sua loja, com isso ele acredita estar perdendo vendas para seus concorrentes no site mercado livre.
* A loja está perdendo clientes locais que poderiam comprar na loja para vendedores do Mercado Livre, por não possuir a venda de peças online, mesmo tendo um preço melhor.

Sendo assim nosso cliente gostaria de expor seus produtos em um site e vendê-los, os produtos oferecidos na loja são mecânicos(rolamentos e polias) e elétricos(bobinas,regulador e rotor) todos eles possuem marca, número da peça e número OEM.
Número OEM é um número de licenciamento concedido a peças oficiais, um exemplo são notebooks da HP a tela deles é feita pela samsung, a samsung teria um número OEM por conta disso, o número OEM é apenas para fornecedores de peças oficiais para veículos.<br>
Entre as peças elétricas a bobina tem as suas dimensões, possui um diâmetro interno, amperagem e quantidade de pólos elétricos. 
O rotor por sua vez possui voltagem, amperagem, modelo e diâmetro.
Regulador possui apenas: amperagem, diâmetro e modelo.
Entre as peças mecânicas a polia tem uma quantidade de sulcos(marcações) e uma largura, o rolamento apenas suas dimensões são relevantes.
Nosso cliente disse que em tempos de crise o preço baixo tem sido uma solução para manter as vendas, uma estratégia dele seria a venda com retirada na loja, perde vendas não é algo bom ele também gostaria de ampliar suas formas de pagamento para cartão de crédito e boleto bancário.<br>
Contudo o senhor Alan gostaria de um sistema disponível na internet para vendas de seus produtos e que pudesse o auxiliar controlar seu estoque.
<br>
### Diagrama de Classes
![diagrana de classe](https://github.com/MarceloMendes94/Autopecas/blob/master/analise/diagramaClasses.png)
### Levantamento de Requisitos
#### requisitos funcionais
 | id | nome | descrição | Prioridade |
 |--|--|--|--|
 |RF01|Cadastrar produto| O sistema deve permitir o cadastro de produtos, que serão postos à venda, de acordo com suas características.|Alta|
 |RF02|Excluir produto|O sistema deve permitir a exclusão de produtos que foram cadastrados previamente.|Alta|
 |RF03|Aletrar produto|O sistema deve permitir alterações nos dados referentes a produtos cadastrados|Alta|
 |RF04|Consultar produto|O sistema deve permitir consultas aos produtos cadastrados. As consultas poderão ser feitas informando uma ou uma combinação de informações dos produtos, como: nome, tipo (mecânico ou elétrico), marca e/ou número OEM.|Alta|
 |RF05|Cadastrar usuário|O sistema deve permitir o cadastro de usuários de acordo com os dados necessários|Alta|
 |RF06|Excluir usuário|O sistema deve permitir a exclusão de usuários, de acordo com a RN02.|Média|
 |RF07|Consultar dados do usuário|O sistema deve permitir a consulta aos dados dos usuários cadastrados previamente.|Alta|
 |RF8|Autenticar usuário|O sistema deve autenticar o usuário todas as vezes que o mesmo for utilizar o sistema.|Alta|
 |RF9|Efetuar pagamentos de produtos|Deve ser permitido o pagamento de produtos por parte dos usuários do sistema.|Alta|
 |RF10|Gerar relatório de vendas|O sistema deve gerar relatórios sobre as vendas realizadas num período de tempo determinado.|Alta|
 |RF11|Gerar relatório por produto|O sistema deve gerar relatórios sobre as vendas de um determinado produto num determinado período de tempo|Alta|
 |RF12|Gerar relatório de clientes|O sistema deve gerar relatórios sobre as compras efetuadas por determinado cliente num determinado período de tempo.|Alta|

 #### requisitos não funcionais


### Casos de uso
![casos de uso]()