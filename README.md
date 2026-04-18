# Validador de CPF

Projeto desenvolvido em Java que valida matematicamente um CPF digitado pelo usuário.

## Como funciona

O programa solicita que o usuário digite os 11 dígitos do CPF um por um e verifica 
se os dígitos verificadores (10º e 11º dígitos) são matematicamente válidos.

## Validação

- Calcula o 1º dígito verificador usando os 9 primeiros dígitos com pesos de 10 a 2
- Calcula o 2º dígito verificador usando os 10 primeiros dígitos com pesos de 11 a 2
- Compara os dígitos calculados com os informados pelo usuário

## Tecnologias

- Java
- Eclipse IDE
