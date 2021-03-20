# Sistema para controle de vacinas
Projeto Final da Disciplina POO 2020.2
Um sistema feito em Java para fazer o controle de vacinas de uma cidade, e mostrando as estatisticas das vacinas.

## É um emulador?
  Sim, é um emulador, onde o gestor de saúde é o responsável pela administração da secretaria de saúde da sua cidade.<br>
  O gestor pode cadastrar, editar, listar e excluir vacinas, poderá também cadastrar e vacinar a sua população.<br>
  Ele também consegue ver todas as estatísticas e dados da vacinação, escolhendo uma vacina em específico, ou ver todos os dados em um painel geral.

## Objetivos
  Criar um sistema simples para poder cadastrar quantidade de vacinas de um cidade e mostrar as estatisticas com os dados que vão ser gerenciados pelo algoritmo. O sistema deve mostrar as porcentagens de vacinas usadas e de quantas pessoas já tomaram as vacinas, também mostrará quando as vacinas acabar ou sobrar.

## Funcionalidades
  
  ### Vacinas
  - [x] Cadastrar vacinas
  - [x] Listar vacinas
  - [x] Editar vacina
  - [ ] Excluir vacina
  - [x] Vacinar uma pessoa, passando uma pessoa e a vacina
  - [x] Cadastrar a faixa etária das pessoas que podem tomar a vacina
    - Somente pessoas que se encaixa na faixa etária poderá tomar a vacina
    - Caso contrário, mostre dizendo que não é possível
  - [x] Listar dados de uma vacina dentro do arrayList
  
  ### Pessoas
  - [x] Cadastrar pessoas
  - [x] Listar pessoas
  - [ ] Editar pessoas
  - [ ] Excluir pessoas
  - [ ] Buscar pessoas
  - [ ] Listar dados de uma pessoa

### Estatísticas
  - [x] Mostrar a quantidade de vacinas
  - [x] Mostrar a quantidade da população que foram vacinadas
  - [x] Mostrar a quantidade da população que não foram vacinadas
  - [x] Mostrar a porcentagem da população que foram vacinadas
  - [x] Mostrar a porcentagem de vacinas existentes
  - [x] Mostrar a porcentagem de pessoas já vacinadas
  - [ ] Mostrar a quantidade de pessoas (dentro da faixa etária) vacinadas
  - [ ] Mostrar a quantidade de pessoas (dentro da faixa etária) não vacinadas

# UML
![](Controle-de-vacinas.jpg)

## Comandos (Main Interativa)

### Adicionar uma pessoa
/addPessoa [nome] [idade] [bairro] <br>
/addPessoa IsaqueVeras 19 Centro <br>
/addPessoa JoaoSilva 45 Centro <br>
/addPessoa MariaMoreira 85 Centro <br>
/addPessoa Antonio 55 Centro

### Listar pessoas
/listarPessoas

### Adicionar vacina
/addVacina [nomeDaVacina] [descVacina] [quantasVacinas] [faixaEtariaInicio] [faixaEtariaFim] <br>
/addVacina Pfizer vacina-contra-o-covid 2 50 80 <br>
/addVacina Coronavac vacina-contra-o-covid 6 50 80 <br>

### Listar vacinas
/listarVacinas

### Editar vacina
/editVacina [indexDaVacina] [nomeDaVacina] [descVacina] [quantasVacinas] [faixaEtariaInicio] [faixaEtariaFim] <br>
/editVacina 2 PfizerEditado vacina-contra-o-covid-editado 7 21 61 <br>

### Vacinar
/vacinar [IdPessoa] [idVacina] <br>
/vacinar 1 1 <br>
/vacinar 4 1

### Painel da vacina
/painel [idVacina] <br>
/painel 1 <br>
/painel 2

### Finalizar programa
/fim
