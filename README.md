<br />
<div align="center" id="top">
  <a href="https://linkedin.com/in/ldnovaes">
    <img src="imagens/icon-document.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Projeto Final para conclusão de curso Especialista Back-End Java da EBAC</h3>

  <p align="center">
    Um projetinho para aprimorar o conhecimento em microsserviços como também apresentá-lo como um projeto final de curso para conclusão do mesmo.
    <br />
    <br />
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Conteúdo</summary>
  <ol>
    <li>
      <a href="#sobre">Sobre o Projeto</a>
      <ul>
        <li><a href="#ferramentas">Ferramentas Utilizadas</a></li>
      </ul>
    </li>
    <li>
      <a href="#comeco">Começando</a>
      <ul>
        <li><a href="#requisitos">Requisitos</a></li>
        <li><a href="#deploy">Deploy</a></li>
      </ul>
    </li>
    <li><a href="#swagger">Swagger</a></li>
    <li><a href="#contato">Contato</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## <span id="sobre">Sobre o Projeto</span>

Este projeto surge como uma oportunidade para aprimorar profundamente meus conhecimentos em microsserviços, consolidando-se como a peça-chave para a conclusão do curso de Especialista Back-End Java. Dividido em três serviços essenciais – Memes, Categoria e Usuario –, o projeto destaca-se pela sua arquitetura robusta.

O uso estratégico do RabbitMQ merece destaque, pois demonstra de maneira clara e prática a capacidade de otimizar a comunicação entre os serviços por meio de filas. Além disso, a integração eficaz do OpenFeign adiciona uma camada de modernidade, facilitando a comunicação entre os serviços de forma ágil e eficiente. Este projeto não apenas aprimora conhecimentos técnicos, mas também evidencia uma abordagem contemporânea na construção de microsserviços.

<p align="right">(<a href="#top">Topo</a>)</p>


### <span id="ferramentas">Ferramentas Utilizadas</span>

* ![JDK 17+](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
* ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
* ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
* ![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)


<p align="right">(<a href="#top">Topo</a>)</p>


## <span id="requisitos">Requisitos</span>

Desde que você tenha docker em sua máquina, o projeto deve rodar sem maiores problemas. Cada microsserviço possui seu próprio docker-compose

#### <span id="comeco">Começando</span>

Clone o repositório nesse local escolhido:

```sh
git clone https://github.com/ldnovaes/projeto-final-ebac.git
```

#### <span id="deploy">Deploy</span>

Os microsserviços foram construídos para rodarem em um container docker. Eles são auto-implantável. É possível entrar na raiz de cada microsserviço e executar o comando abaixo: 

```sh
docker-compose up -d
```

O argumento `-d` permite a execução do container mesmo que o seu terminal esteja fechado.

Feito isso, os microsserviços são listados pelos links abaixo:

- <a href="http://localhost:8081/api/categoria">Serviço de Categoria</a>
- <a href="http://localhost:8082/api/usuario">Serviço de Usuário</a>
- <a href="http://localhost:8083/api/meme">Serviço de Meme</a>

<p align="right">(<a href="#top">Topo</a>)</p>

#### <span id="swagger">Swagger</span>

Feito o deploy, a documentação de cada microsserviço (embora muito simples) pode ser conferida em:

- <a href="http://localhost:8081/swagger-ui/index.html">Swagger de Categoria</a>
- <a href="http://localhost:8082/swagger-ui/index.html">Swagger de Usuário</a>
- <a href="http://localhost:8083/swagger-ui/index.html">Swagger de Meme</a>

<p align="right">(<a href="#top">Topo</a>)</p>

## <span id="contato">Contato</span>

* Hotmail - [Envie-me um email](leandroduarte2012@hotmail.com)
* Linkedin - [Envie-me uma DM](https://linkedin.com/in/ldnovaes)


<p align="right">(<a href="#top">Topo</a>)</p>

