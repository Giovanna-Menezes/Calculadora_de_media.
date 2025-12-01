Calculadora de Média – Java

Este projeto é uma calculadora de média acadêmica desenvolvida em **Java**, com entrada de notas do usuário via console.  
O programa calcula:

- Média das duas provas (NP1 e NP2)  
- Cálculo ponderado do PIM  
- Média final (nesse curso a média final tem que ser é 7,0, caso contrario fica de exame).
- Verificação se o aluno foi aprovado, reprovado ou precisa de exame  

Projeto desenvolvido no **Eclipse**, com foco em lógica de programação e fundamentos da linguagem Java.

---

## Funcionalidades

- Entrada da nota **NP1**  
- Entrada da nota **NP2**  
- Cálculo da média parcial  
- Entrada do **PIM** (trabalho)  
- Cálculo da média ponderada (80% prova + 20% PIM)  
- Cálculo da média final  
- Se a média final for menor que 6, o programa solicita a nota de exame  
- Exibe o status final do aluno  

---

 Exemplo de execução caso esteja na média:

Digite a nota np1:
7,1
Digite a nota np2:
7,9
resultado = 6,0
Digite sua nota do pim:
7,9
sua nota final é:7,6

Parabens! Você está na média!

 Exemplo de execução caso mesmo com a nota do pim não consiga atingir a média:

Digite a nota np1:
7,9
Digite a nota np2:
2,9
resultado = 4,3
Digite sua nota do pim:
7,0
sua nota final é:5,7

Digite a nota do exame:
8
Sua nota foi: 6,2.

Tecnologias Utilizadas

- **Java 21**  
- **Eclipse IDE**  
- **Git e GitHub**  

---

## Estrutura do Projeto

curso_programacao/
├── src/
│ └── curso_programacao/
│ └── Main.java
├── .gitignore
├── .classpath
└── .project

## Como Executar o Projeto

1. Clone o repositório:
git clone https://github.com/Giovanna-Menezes/Calculadora_de_media.git

Copiar código

2. Abra o projeto no **Eclipse**:
   - `File > Import > Existing Java Project`

3. Execute o arquivo:
Main.java

Copiar código

O programa rodará no console da IDE.

---

##  Melhorias Futuras 

- Criar interface gráfica com JavaFX  
- Transformar em API REST com Spring Boot  
- Adicionar testes automatizados JUnit  
- Criar uma versão web  

---

## Autora

**Giovanna Menezes**  
💻 Estudante de Desenvolvimento de Software  
