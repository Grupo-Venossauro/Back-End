# Project Asapcard Hackathon

## Grupo Venossauro 

<img src="venosaur pixel.webp">

## Desafio: 
### Nível 1: Integração entre camadas O Desafio consistiu em criar uma aplicação capaz de receber um input de um arquivo .csv e gerar um output no formato JSON, persistindo esses dados em um banco de dados relacional. Construímos a aplicação em maven com o framework Spring boot e o SGDB MYSQL para persistir os dados.    

### Nível 2: Evolução do negócio Esse desafio se baseou em validar os dados persistido a partir de um segundo arquivo .csv, conciliando os dados e criando a funcionalidade de status para validar os dados das transações.   

### Nível 3: Aplicação 24/7 O nível 3 exigiu modificações na aplicação para que ela execute 24/7, observando alterações no direrótio de input, validado e persistí-lo no banco de dados.  

### Nível 4: Criação de Container No nível 4 o desafio foi executar todas as aplicações criadas com Docker usando rabbitmq com o docker compose.



## Descrição:

*Este projeto demonstra a implementação de um sistema de mensagens assíncronas em Java utilizando o serviço de mensageria RabbitMQ e focando no uso de Queues. O projeto inclui um produtor e um consumidor que simulam o envio e recebimento de mensagens em uma fila.*

#### Tecnologias:

Java 17   
RabbitMQ 3.12  
Maven      

#### Requisitos:

Ter o RabbitMQ instalado e funcionando em sua máquina local.
Ter o Maven instalado em sua máquina local.

#### Como executar:

*Clone este repositório para sua máquina local.
Navegue até a pasta do projeto.
Execute o seguinte comando para instalar as dependências:
mvn clean install*

*Execute o seguinte comando para iniciar o produtor:
mvn exec:java -Dexec.mainClass="br.com.example.Producer"*

*Execute o seguinte comando para iniciar o consumidor:
mvn exec:java -Dexec.mainClass="br.com.example.Consumer"*

#### Funcionamento:

*O produtor envia mensagens para a fila "example-queue" no RabbitMQ.
O consumidor escuta a fila e recebe as mensagens assim que elas são enviadas.
As mensagens são simples strings que podem ser personalizadas de acordo com a necessidade do seu projeto.*  

#### Exemplo de mensagem:

*Hello, world!*

#### Observações:

*Este é um projeto simples para demonstrar o uso básico de Queues no RabbitMQ.
Você pode modificar o código para atender às suas necessidades específicas.
Para mais informações sobre o RabbitMQ, consulte a documentação oficial: https://www.rabbitmq.com/documentation.html*

#### Agradecimentos:

*Agradecemos a Kevin Oliveira, Kaellen Oliveira, Matheus Julio, Pedro Viana, Vinicius Santos.*

*✉️ Contato:*

#### Linkedin Squad:


*https://www.linkedin.com/in/kevineoliveira/https:/*  
*https://www.linkedin.com/in/matheusjuliosantana/*    
*https://www.linkedin.com/in/vhiana-pedro/*    
*https://www.linkedin.com/in/vinicius-lima-7b3b23235/*  

#### Github Squad:

*https://github.com/Kaellen-heleni*    
*https://github.com/KievKiss*  
*https://github.com/MatheusJulioSantana*    
*https://github.com/Pedro-Vhiana*     
*https://github.com/vinysl*  

