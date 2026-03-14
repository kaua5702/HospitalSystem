### Sistema Hospitalar (Projeto de Treino)

## 📌 Visão Geral
Este projeto é uma simulação de gerenciamento hospitalar via console, desenvolvida em Java.
Foi criado como exercício de treino para praticar conceitos de programação orientada a objetos, como:
- Classes e objetos
- Herança
- Abstração
- Polimorfismo
- Encapsulamento
O sistema permite cadastrar pacientes e médicos, agendar consultas e registrar diagnósticos.

---

## 🏗️ Estrutura do Projeto
- Patient.java → Representa um paciente com nome, idade, ID e histórico médico.
- Doctor.java → Classe abstrata que representa um médico (nome, CRM, especialidade).
- MedicoClinico.java → Subclasse de Doctor para médicos clínicos gerais.
- MedicoCirurgiao.java → Subclasse de Doctor para médicos cirurgiões.
- Consultation.java → Conecta paciente e médico, armazenando data e diagnóstico.
- Main.java → Ponto de entrada com entrada de dados via Scanner para rodar o sistema.

---

## ▶️ Como Executar
- Clone ou baixe o projeto.
- Compile os arquivos Java:
```
javac com/kauabiscotto/HospitalSystem/*.java
```
- Execute a classe Main:
```
java com.kauabiscotto.HospitalSystem.Main
```
- Siga as instruções no console para:
- Registrar um paciente
- Registrar um médico
- Agendar uma consulta
- Inserir um diagnóstico
- Visualizar informações da consulta e histórico do paciente

---

## 📖 Exemplo de Saída

=== Patient Registration ===

Enter patient name: John

Enter patient age: 35

--

=== Doctor Registration ===

Enter doctor name: Dr. Smith

Enter doctor CRM: 12345

Choose specialty (1 - Clinical, 2 - Surgeon): 1

--

=== Consultation Scheduling ===

Enter diagnosis: Common cold

--

=== Consultation Information ===

Consulta:

Paciente: John

Médico: Dr. Smith (Clínico Geral)

Data: 2026-03-14

Diagnóstico: Common cold

--

=== Patient Medical History ===

Histórico do paciente John:

- Diagnóstico clínico: Common cold

---

## 🎯 Objetivos de Aprendizado
- Praticar programação orientada a objetos em Java.
- Entender como abstração e polimorfismo funcionam em cenários reais.
- Construir uma aplicação simples e funcional de console.
