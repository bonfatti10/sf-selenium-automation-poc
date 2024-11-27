# Projeto de Automação de Testes com Selenium e Java

Este repositório contém uma estrutura de automação de testes utilizando **Java**, **Selenium WebDriver** e o padrão **Page Object Model (POM)**, além de geração de relatórios com o **Allure Report**. A configuração é gerenciada pelo **Maven**.

---

## Índice

1. [Pré-requisitos](#pré-requisitos)  
2. [Estrutura do Projeto](#estrutura-do-projeto)  
3. [Configuração e Execução](#configuração-e-execução)  
4. [Relatórios de Teste](#relatórios-de-teste)  
5. [Contribuição](#contribuição)  
6. [Licença](#licença)  

---

## Pré-requisitos

Antes de iniciar, certifique-se de que os seguintes itens estão instalados em sua máquina:

- **Java 17+**  
- **Maven 3.8+**  
- **Git**  
- Navegador compatível com Selenium (Chrome, Firefox, etc.)  
- **Docker** *(opcional)* para execução isolada  

---

## Estrutura do Projeto

```plaintext
sf-automation-test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── pages/       # Classes do Page Object Model
│   │               └── utils/       # Classes utilitárias
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── tests/       # Classes de teste automatizado
├── pom.xml                          # Configuração do Maven
└── README.md                        # Documentação do projeto


## Configuração e Execução

### 1. Clone o Repositório

```bash
git clone https://github.com/carlosbonfatti/sf-automation-test.git
cd sf-automation-test
```


### 2. Instale as Dependências

```bash
mvn clean install
```
### 3. Configure o Navegador
Certifique-se de que o driver do navegador (ex.: ChromeDriver) está configurado no **PATH** do sistema ou no projeto.

---

### 4. Execute os Testes
Para executar os testes, utilize o comando:

```bash
mvn test
```
# Relatórios de Teste
Os relatórios são gerados automaticamente pelo Allure. Após a execução dos testes:

### Gerar o Relatório
```bash
allure serve target/allure-results
```

# Padrão de Codificação

Este projeto segue o Page Object Model para organizar as classes de páginas, promovendo a reutilização de código e facilitando a manutenção.


## Licença

Desenvolvido por Carlos Bonfatti ✨

## Sobre

Este projeto foi criado como uma prova de conceito (PoC) para uma empresa na qual atuei, resolvendo um problema para automatizar aplicações Salesforce.




