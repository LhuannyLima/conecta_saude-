# Sistema de Transporte para Tratamento Fora do Domicílio (TFD)

> **Nome provisório:** substitua pelo nome definitivo do projeto, quando a equipe decidir.

## 1. Descrição do projeto

O projeto propõe um sistema para organizar solicitações de transporte de pacientes que precisam se deslocar do município de origem até o município onde será realizado o procedimento médico, contemplando ida e volta. A aplicação deverá apoiar o cadastro dos pacientes, motoristas e funcionários, a alocação de motoristas, o cadastro de acompanhantes, a confirmação das solicitações e o registro de presença dos pacientes.

## 2. Integrantes da equipe

- Enos Soares de Santana
- Laudiele Carvalho dos Anjos

## 3. API externa consumida

**Pendente de definição pela equipe.** As anotações do projeto mencionam o uso de uma API externa, mas não informam o nome da API nem os dados ou serviços que serão consultados.

Preencher esta seção quando a equipe definir a API:

- **Nome da API:** [informar]
- **Finalidade:** [explicar o que a aplicação irá consultar ou enviar]
- **Dados/serviços utilizados:** [informar os endpoints ou recursos relevantes]
- **Documentação oficial:** [inserir o link]

## 4. Requisitos Funcionais principais

- **RF1:** O sistema deve permitir o cadastro de três tipos de usuários: Motorista, Funcionário e Paciente.
- **RF2:** O sistema deve permitir que o paciente solicite transporte do município de origem para o município de realização do procedimento médico, contemplando ida e volta.
- **RF3:** O sistema deve permitir que o paciente visualize informações e contatos do motorista.
- **RF4:** O sistema deve permitir que o funcionário aloque motoristas para as viagens.
- **RF5:** O sistema deve permitir que o paciente cadastre acompanhantes para viagem.
- **RF6:** O sistema deve permitir que o funcionário envie confirmações das solicitações TFD aos pacientes.
- **RF7:** O sistema deve permitir que o motorista marque a presença de pacientes.
- **RF8:** O sistema deve permitir a visualização do contato do paciente para o motorista.

## 5. Tecnologias e padrões registrados

- **Banco de dados:** SQLite.
- **Padrões de projeto (GoF) previstos:** Factory Method e Facade.

> Atualize esta seção conforme as tecnologias e os padrões forem efetivamente implementados.

## 6. Documentação do projeto

A modelagem do sistema está na pasta [`docs/`](docs/):

- [Diagrama de Classes](docs/diagrama-de-classes.md)

