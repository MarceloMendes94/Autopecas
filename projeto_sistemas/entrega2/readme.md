# Segunda entrega  PS 20191

## Entregáveis
1. Plataforma de Implementação
2. Definir Táticas para tratar Atributos de qualidade
3. Elaborar Arquitetura lógica do Sistema

## Grupo
1. David Villaça
2. Douglas Bolis
3. Ewerson Vieira
4. Marcelo Mendes
   

# Plataforma de Implementação:
## Definir a plataforma de hardware e software a ser usada: SGBD, Servidor Web, dispositivos, máquinas (um para o sistema inteiro);

```R.: Usaremos PostgreSQL, AWS, sem dispositivos e máquinas adicionais.```

## Definir tecnologias a serem usadas: frameworks de persistência, interface com o usuário, etc;

```R.:```

*Justificar a escolha tecnológica apresentando o contexto. Para guiar essa justificativa, tome como base as perguntas abaixo:*


## Qual localização geográfica dos usuários?

```R.: Os usuários estão localizados no território nacional (Brasil), com foco no estado do Espírito Santo.```

## Qual o ambiente de hardware e software? Há restrições?

```R.: O sistema rodará em browser para versão desktop, não há necessidade de responsividade a única restrição é funcionar em browser chrome ou firefox.```

## Qual a frequência de uso do sistema ou funcionalidade? E tempo de resposta esperada?
```R.: Espera-se um uso diário do sistema, com tempo de resposta de alguns segundos por operação.```

## Qual o volume de dados esperado? (inicial e futuramente)

```R.: Inicialmente serão inseridos 1000 peças e não há planejamento de aumento até então, usuários em reunião o cliente espera realizar 10 mil vendas por ano dentro do sistema.```

## Há restrições de confiabilidade? (tempo entre falhas) Tarefas críticas, que envolvam risco ou de alto impacto no negócio?

```R.: Sobre as restrições de confiabilidade, se tratando de disponibilidade, dentre 1000 solicitações, o sistema deve atender 999 delas. A taxa de ocorrência de falhas deve ser de 5/1000.```

## A tarefa crítica presente no sistema é o pagamento das compras dos usuários.

```R.:```

## Há restrições de segurança? dados confidenciais, por exemplo?

```R.: Usaremos hash para senhas e criptografia para dados de cartão de crédito no momento de armazenar essas informações no banco de dados.```

## Quais os perfis dos usuários? são leigos, experts, usuários frequentes, esporádicos? possuem alguma dificuldade ou limitação?

```R.: Usuários leigos e esporádicos, acostumados ou não com o uso de e-commerces.```

## Há alguma previsão de mudanças futuras? há alterações no negócio (tipo de produtos, etc)?

```R.: Não há previsão de mudanças futuras nem alterações no negócio.```

<hr>

# Táticas para tratar atributos de qualidade

|Categoria|RNFs|Condutor da arquitetura|Táticas|
|---------|----|-----------------------|-------|
|Segurança|RNF1, RNF2|Sim|1. Identificar usuários utilizando email e autenticá-lo por meio de senha ou Facebook<br>2. Autorizar usuários por meio de perfis de acesso: Gerente (cadastrar produtos, ver relatórios e cadastrar funcionários), Despachante (realizar atendimento ao usuário e visualizar status das compras) e Cliente (realizar compras e visualizar produtos disponíveis).<br>3. Deixar conteúdo visível aos sites de busca como google apenas informações de produtos.|
|Manutenabilidade|RNF08|Não|4. Todas as ações tomadas pelo servidor da aplicação devem ser registradas por meio de logs com vida útil de 90 dias.|
|Modificabilidade|RNF03|Sim|5. Uso da técnica de ORM para abstrair o uso do banco de dados.|
|Confiabilidade|RNF04|Não| 6. Uso de um carrinho de compras, deixando a quantidade de itens visível e destacado.|
|Usabilidade|RNF05, RNF7|Não| 7. Exibir na página inicial do sistema uma lista com produtos mais relevantes.<br>8. Uso de barra de pesquisa geral para pesquisa de produtos e categorias.<br>9. Uso de menu lateral para exibir as categorias e o usuário conseguir navegar por elas.<br>10. Uso de tutorial de utilização do sistema no primeiro acesso.<br>11. Prover ao usuário um FAQ.<br>12. Prover ao usuário um chat ao vivo para sanar suas dúvidas.|
 
 <hr>

# Arquitetura
![arquitetura](../../imagens/arquitetura/Arquitetura_sistema.png)