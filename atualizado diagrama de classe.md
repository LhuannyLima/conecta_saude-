# Diagrama de Classes

O diagrama abaixo é uma proposta inicial de modelagem, elaborada a partir dos requisitos e das anotações da equipe. Os campos não especificados nas anotações devem ser discutidos e validados pela equipe antes da implementação.

```mermaid
classDiagram
    class Usuario {
        +id
        +nome
        +telefone
    }

    class Paciente {
        +id
        +nome
        +telefone
        +cpf
        +dataNascimento
        +cartaoSUS
        +acompanhante : opcional
    }

    class Motorista {
        +codigoIdentificacao
    }

    class Funcionario {
        +codigoIdentificacao
    }

    class SolicitacaoTFD {
        +municipioOrigem
        +municipioProcedimento
    }

    class Viagem {
        +data
        +localOrigem
        +hospitalDestino
        +confirmacao
        +presencaPaciente
    }

    class MensagemTFD {
        +dataSaida
        +confirmacao
        +nomeMotorista
        +contatoMotorista
    }

    Usuario <|-- Motorista
    Usuario <|-- Funcionario

    Paciente "1" --> "0..*" SolicitacaoTFD : solicita
    SolicitacaoTFD "1" --> "1..*" Viagem : origina
    Funcionario "1" --> "0..*" Viagem : aloca motorista
    Motorista "1" --> "0..*" Viagem : realiza
    Paciente "1" --> "0..*" Viagem : participa
    Viagem "1" --> "0..*" MensagemTFD : gera confirmação
    MensagemTFD "0..*" --> "1" Paciente : enviada paraZ
    