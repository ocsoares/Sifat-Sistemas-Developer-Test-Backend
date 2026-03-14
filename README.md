# Sifat Sistemas Developer Test — Backend

API RESTful desenvolvida com Spring Boot para alimentar o dashboard de vendas.

## Tecnologias

- Java 17
- Spring Boot 3.5.11
- Spring Web
- Spring Data JPA
- MySQL 8.0
- Flyway
- Lombok
- Docker / Docker Compose

## Pré-requisitos

- Java 17
- Maven
- Docker e Docker Compose

## Configuração

Crie um arquivo `.env` na raiz do projeto e passe os valores para as variáveis:

```env
# EXEMPLO

MYSQL_ROOT_PASSWORD=rootpassword
MYSQL_DATABASE=sifat_dashboard
MYSQL_USER=sifat_user
MYSQL_PASSWORD=sifat_password
FRONTEND_URL=http://localhost:8080
```

> `FRONTEND_URL` deve apontar para a URL onde o frontend está rodando, para liberar o CORS corretamente.

## Como iniciar

**1. Suba o banco de dados:**

```bash
docker-compose up -d
```

**2. Aguarde ~10 segundos para o MySQL inicializar, depois rode a aplicação:**

> **Linux/Mac:** caso apareça `Permission denied`, rode antes:
> ```bash
> chmod +x mvnw
> ```

```bash
./mvnw spring-boot:run
```

No Windows use:

```bash
mvnw.cmd spring-boot:run
```

```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:3000`.

O Flyway criará as tabelas e populará o banco com dados de exemplo automaticamente na primeira execução.

## Endpoints

| Método | Rota            | Descrição                                        |
|--------|-----------------|--------------------------------------------------|
| GET    | `/api/cmv`      | Retorna os dados de CMV por mês                  |
| GET    | `/api/groups`   | Retorna os grupos ordenados por mais vendidos    |
| GET    | `/api/products` | Retorna os produtos ordenados por menos vendidos |

### Parâmetros opcionais

`/api/groups` e `/api/products` aceitam o parâmetro `order` para alterar a ordenação:

```
GET /api/groups?order=DESC
GET /api/products?order=ASC
```

Valores aceitos: `ASC` ou `DESC`. Qualquer outro valor retorna `400 Bad Request`.

## Estrutura do projeto

```
src/main/java/com/ocsoares/sifat_sistemas_developer_test/
├── config/
│   └── CorsConfig.java
├── controllers/
│   ├── CmvController.java
│   ├── GroupController.java
│   └── ProductController.java
├── entities/
│   ├── CmvEntity.java
│   ├── GroupEntity.java
│   └── ProductEntity.java
├── repositories/
│   ├── CmvRepository.java
│   ├── GroupRepository.java
│   └── ProductRepository.java
├── services/
│   ├── CmvService.java
│   ├── GroupService.java
│   └── ProductService.java
└── SifatSistemasDeveloperTestApplication.java

src/main/resources/
├── db/migration/
│   ├── V1__create_tables.sql
│   └── V2__insert_sample_data.sql
└── application.properties
```