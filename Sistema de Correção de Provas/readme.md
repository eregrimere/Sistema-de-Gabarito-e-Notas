# Sistema de Correção de Provas

Sistema backend desenvolvido em Java para gerenciamento de provas, gabaritos e cálculo automático de notas.

---

# Tecnologias

- Java 21
- Programação Orientada a Objetos (POO)
- Clean Code
- DRY (Don't Repeat Yourself)
- KISS (Keep It Simple)
- Manipulação de arquivos `.txt`

---

# Funcionalidades

- Cadastro de respostas dos alunos
- Criação de gabarito oficial
- Correção automática de provas
- Geração de notas
- Ordenação por nota
- Cálculo de média da turma
- Persistência em arquivos

---

# Estrutura do Projeto

src/main/java
│
├── application
│   └── usecase
│
├── domain
│   ├── model
│   ├── repository
│   ├── service
│   ├── validator
│   └── exception
│
├── infrastructure
│   ├── persistence
│   ├── support
│   └── config
│
├── presentation
│   └── console
│
└── Main.java

---

### Domain
Contém:
- entidades
- regras de negócio
- contratos (interfaces)
- validações

### Application
Responsável pelos casos de uso da aplicação.

### Infrastructure
Responsável pela persistência e acesso a arquivos.

### Presentation
Responsável pela interface de interação via console.

---

# Princípios aplicados

## SOLID
Separação de responsabilidades e desacoplamento entre camadas.

## DRY
Centralização de validações, regras e persistência para evitar repetição de código.

## KISS
Estrutura simples e objetiva, priorizando legibilidade e manutenção.