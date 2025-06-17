```
ContaBanco
├─ README.md
├─ bin
│  └─ ContaTerminal.class
├─ lib
└─ src
   └─ ContaTerminal.java
```
# Projeto Conta Terminal

Este é um programa Java simples que simula o processo de criação de uma conta bancária através de um terminal. Ele interage com o usuário para coletar informações essenciais da conta, como número da conta, agência, nome do cliente e saldo inicial, e então apresenta uma mensagem de boas-vindas com os dados da conta recém-criada.

---

## Funcionalidades

* **Coleta de Dados:** O programa solicita e recebe dados do usuário para preencher os detalhes da conta.

* **Mensagem de Boas-Vindas:** Após coletar as informações, uma mensagem personalizada é exibida para o cliente, confirmando os dados da nova conta.

* **Limpeza de Console:** Uma funcionalidade para limpar a tela do terminal é incorporada, visando uma visualização mais organizada. Note que a **efetividade da limpeza pode variar** dependendo do terminal utilizado (funciona bem em terminais compatíveis com ANSI, como VS Code integrado, Linux/macOS).

* **Pausa na Execução:** Uma pausa é implementada após a inserção do saldo, permitindo que o usuário visualize a mensagem de boas-vindas antes que o programa seja encerrado.

---

## Como Usar

Para colocar este programa em funcionamento, siga os passos abaixo:

1.  **Compile o código Java:**
    Abra seu terminal ou prompt de comando, navegue até o diretório onde o arquivo `ContaTerminal.java` está salvo e execute o comando:

    ```
    javac ContaTerminal.java
    ```

2.  **Execute o programa:**
    Após a compilação bem-sucedida, execute o programa com o comando:

    ```
    java ContaTerminal
    ```

Ao iniciar, o programa o guiará através de algumas perguntas no terminal:

* **Número da Conta:** Digite um número inteiro.

* **Número da Agência:** Forneça o número da agência (pode incluir um hífen, por exemplo, `067-8`).

* **Nome do Cliente:** Insira o nome completo do cliente.

* **Saldo da Conta:** Digite o valor do saldo inicial. **Importante:** Utilize o **ponto (`,`)** como separador decimal (por exemplo, `237,48`).

Após inserir o saldo, o programa exibirá a mensagem `--- Pressione ENTER para continuar ---`. Basta **pressionar ENTER** para que a mensagem de boas-vindas seja exibida.

---

## Tecnologias Utilizadas

* **Java:** A linguagem de programação principal para o desenvolvimento deste projeto.

* **`java.util.Scanner`:** Usado para facilitar a leitura da entrada de dados fornecida pelo usuário através do console.

---

## Estrutura do Código

O código está organizado na classe `ContaTerminal`, que contém os seguintes elementos:

* **Atributos da Classe:**

    * `numeroConta` (int): Armazena o número da conta.

    * `agencia` (String): Armazena o número da agência.

    * `nomeCliente` (String): Armazena o nome do cliente.

    * `saldo` (double): Armazena o saldo da conta, permitindo valores decimais.

* **Construtor:**

    * `public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo)`: Inicializa um novo objeto `ContaTerminal` com os valores fornecidos.

* **Métodos Estáticos:**

    * `public static void limparConsole()`: Tenta limpar a tela do terminal para uma exibição mais limpa.

    * `private static void mensagemBoasVindas(String nomeCliente, int numeroConta, String agencia, double saldo)`: Formata e exibe a mensagem de boas-vindas ao cliente.

    * `private static void coletarDadosConta()`: É o método principal responsável por orquestrar a interação com o usuário, solicitando e coletando os dados necessários, criando o objeto `ContaTerminal` e chamando a mensagem de boas-vindas, além de gerenciar as pausas.

* **Método `main`:**

    * `public static void main(String[] args)`: O ponto de entrada do programa, que chama o método `coletarDadosConta()` para iniciar a execução.
