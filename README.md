<h1 align="center"> Projeto Engenheiro de Software Jr Lopes</h1>

## :bangbang: Status do Projeto
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
<img src="http://img.shields.io/static/v1?label=STATUS&message=ENTREGUE%20&color=GREEN&style=for-the-badge"/>   
</p>

## :hammer: Funcionalidades do projeto

- `Postgres Docker`: Imagens Docker: 
Imagem Docker para otimizar o processo  

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/postgres-docker">Link do Projeto PostGres</a>

- `Kafka Docker`: Imagens Docker: 
Imagem Docker para otimizar o processo  

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/kafka-docker">Link do Projeto Kafka</a>

- `API Servico` : API do Projeto
Cadastra, mostra,deleta e atualiza um serviço e salva no banco de Dados, usando os metodos HTTP (POST, GET, DELETE e PUT)

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/API-SERVICO">Link do Projeto</a>

- `service-producer`: Processo que cria uma solicitação: 
Cria uma solicitação via Kafka para a json-consumer 

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/service-producer">Link do Projeto</a>

- `json-consumer`: Mostrando a Mensagem: 
Consume a solicitação do service-producer e mostra na tela o recebimento com sucesso  

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/json-consumer">Link do Projeto</a>

-----------------------------------------------------------------------------------------------------------------------------
## :computer: Abrir e rodar o projeto 
Após baixar o projeto, voce pode abrir no Intellij(ou em qualquer ide que rode Java) 
com as extensões de Java baixadas, Postgres,Docker, PostMan e Maven 

-`Codigos`:

- `open the folder` na IDE de sua preferencia e abra o arquivo baixado no GIT 

Para rodar os - `Dockers`

-`Kafka`

cd kafka-docker

docker-compose up -d 

cd ..

-`Postgres`
nessa caso pode baixar direto a ferramenta ou baixar o docker 
Crie o banco API-SERVICO 
user: postgres 
senha:teste1234
criando o banco: API-SERVICO 
no arquivo application.properties no API-SERVICO 

ou via Docker 

cd postgres-docker 
docker-compose up -d

-`Aplicações`

podem ser rodadas normalmente na ide 

----------------------------------------------------------------------------------------------------------------
## 📀 Comandos para usar o sistema 

Utilizando o PostMan 

-`API-SERVICO`

Para cadastrar um serviço no Postgres 

-`Metodo POST` 

http://localhost:8080/cadastro-servico

-`Json` 
{
    "profName": "TI"
}

Para retornar resultado 

Todos os resultados 

-`Metodo GET` 

http://localhost:8080/cadastro-servico

para um serviço 

http://localhost:8080/cadastro-servico/id cadastrado no POST 

-`Metodo Delete`

para deletar o serviço 

http://localhost:8080/cadastro-servico/id cadastrado no POST 

-`Metodo Put`

Para atualizar o serviço

http://localhost:8080/cadastro-servico/id cadastrado no POST 
-`Json`

{
    "profName": "Mecanico"
}

-------------------------------------------------------------------------------------------------
Para os `json-consumer` e `service-producer`

rodar os dois projetos e rodar o `Post` abaixo 

A solicitação vai ser criada no `service-producer` e recebida pelo `json-consumer`

-`Post` http://localhost:8000/mensagem-servico 

-`Json`
{
    "id":1,
    "idService":8
}

---------------------------------------------------------------------------------------------------

## :hotsprings: Tecnologias Utilizadas no Projeto
-  `Java`
-  `Spring`
-  `Postgres`
-  `Docker`
-  `Kafka`
