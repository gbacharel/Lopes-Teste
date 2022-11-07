<h1 align="center"> Projeto Engenheiro de Software Jr Lopes</h1>

## :bangbang: Status do Projeto
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>  
</p>

## :hammer: Funcionalidades do projeto

- `Postgres Docker`: Imagem Docker: 
Imagem Docker - São utilizadas para otimizar o processo 

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/postgres-docker">Link do Projeto PostGres</a>

- `Kafka Docker`: Imagem Docker: 
Imagem Docker - São utilizadas para otimizar o processo 

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/kafka-docker">Link do Projeto Kafka</a>

- `API-SERVICO` : API do Projeto
A API do Projeto possibilita exibir informações, cadastrar, excluir, atualizar um serviço e salvar os dados no banco de dados através dos métodos 
HTTP (POST, GET, DELETE e PUT).

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/API-SERVICO">Link do Projeto API-SERVICO</a>

- `service-producer`: Processo que cria uma solicitação: 
Processo que cria uma solicitação via Kafka para a json-consumer. 

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/service-producer">Link do Projeto service-producer</a>

- `json-consumer`: Mostrando a solicitação: 
Realiza o consumo da solicitação service-producer e exibe o recebimento com sucesso na tela. 

   <a href="https://github.com/gbacharel/Lopes-Teste/tree/master/json-consumer">Link do Projeto json-consumer</a>

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
-  `Java 17`
-  `Spring`
-  `Postgres`
-  `Docker`
-  `Kafka`
