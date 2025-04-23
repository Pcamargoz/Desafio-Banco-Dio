<!-- README para o Desafio Banco DIO -->

<p align="center">
  <img src="https://img.shields.io/badge/Desafio-Banco%20DIO-007ACC" alt="Desafio Banco DIO" />
  <img src="https://img.shields.io/badge/Java-11%2B-orange" alt="Java 11+" />
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-green" alt="MIT License" /></a>
</p>

# 🏦 Banco Digital
**Sistema completo de operações bancárias construído em Java, desenvolvido no Bootcamp da Digital Innovation One.**

---

## 📖 Sumário
- [🚀 Visão Geral](#-visão-geral)
- [✨ Funcionalidades](#-funcionalidades)
- [⚙️ Arquitetura e POO](#️-arquitetura-e-poo)
- [📁 Estrutura de Pastas](#️-estrutura-de-pastas)
- [🛠️ Tecnologias](#️-tecnologias)
- [🚀 Como Rodar](#-como-rodar)
- [🎯 Exemplos de Uso](#-exemplos-de-uso)
- [🌱 Melhorias Futuras](#-melhorias-futuras)
- [📄 Licença](#-licença)
- [🖊️ Autor](#️-autor)

---

## 🚀 Visão Geral
O **Banco Digital** permite criar agências, cadastrar clientes, abrir contas (Corrente ou Poupança) e executar operações bancárias básicas por meio de um menu interativo no terminal. É ideal para reforçar conceitos de **POO**, coleções e boas práticas em Java.

---

## ✨ Funcionalidades
- ✅ Criar Agência (número e nome)
- ✅ Cadastrar Cliente (CPF e nome)
- ✅ Abrir Conta (Corrente / Poupança) vinculada a cliente e agência
- ✅ Consultar Saldo
- ✅ Efetuar Depósito
- ✅ Efetuar Saque
- ✅ Transferir Valores entre contas
- ✅ Listar Todas as Contas
- ✅ Buscar Conta por número ou nome do cliente
- ✅ Excluir Conta

---

## ⚙️ Arquitetura e POO
- **Abstração:** classes-modelo (`Conta`, `Cliente`, `Agencia`) com atributos e métodos essenciais.
- **Encapsulamento:** atributos privados e acesso via getters/setters para proteger dados.
- **Herança:** `ContaCorrente` e `ContaPoupanca` estendem a classe abstrata `Conta`.
- **Polimorfismo:** sobrescrita de métodos para comportamentos específicos das contas.
- **Interfaces (quando aplicadas):** contratos para operações bancárias.

---

## 📁 Estrutura de Pastas
```
Desafio-Banco-Dio/
├── LICENSE
├── README.md
└── src
    └── main
        └── java
            └── br/com/banco
                ├── model
                │   ├── Agencia.java
                │   ├── Cliente.java
                │   ├── Conta.java
                │   ├── ContaCorrente.java
                │   └── ContaPoupanca.java
                ├── service
                │   └── BancoService.java
                └── App.java           ← Entrada (método main + menu)
```

---

## 🛠️ Tecnologias
- **Linguagem:** Java 11 ou superior
- **Compilação:** `javac` / qualquer IDE (IntelliJ, Eclipse, VS Code...)
- **Controle de Versão:** Git & GitHub

---

## 🚀 Como Rodar
1. **Clone o repositório**
   ```bash
   git clone https://github.com/Pcamargoz/Desafio-Banco-Dio.git
   cd Desafio-Banco-Dio
   ```
2. **Compile o código**
   ```bash
   javac -d out src/main/java/br/com/banco/**/*.java
   ```
3. **Execute a aplicação**
   ```bash
   java -cp out br.com.banco.App
   ```

*Divirta-se operando seu próprio banco digital!* 🚀

---

## 🎯 Exemplos de Uso
1. **Cadastrar Agência**: Informe número (e.g., `1001`) e nome (`Agência Central`).
2. **Cadastrar Cliente**: Informe CPF (e.g., `12345678900`) e nome (`João Silva`).
3. **Abrir Conta**: Escolha tipo (1 – Corrente, 2 – Poupança) e associe à agência/cliente.
4. **Operações**: Siga o menu para depósito, saque ou transferência.

---

## 🌱 Melhorias Futuras
- 📂 Persistência em arquivo (TXT/JSON) ou banco de dados
- 🖥️ Interface gráfica (JavaFX / Swing)
- 🛡️ Tratamento de exceções e validações mais robustas
- ✅ Testes unitários automatizados (JUnit)

---

## 📄 Licença
Este projeto está sob a [MIT License](LICENSE).

---

## 🖊️ Autor
**Pcamargoz**  
<a href="https://github.com/Pcamargoz"><img src="https://img.shields.io/badge/GitHub-Pcamargoz-181717?logo=github" alt="GitHub Pcamargoz" /></a>

