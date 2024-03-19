# Estoque Empresa Senai - 03/2024
Este projeto visa desenvolver um sistema de gerenciamento de estoque para uma pequena empresa, utilizando a linguagem de programação Java e o banco de dados SQLite.
## Tecnologias usadas:
> [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="40" heidth="40"/>](https://www.java.com) ** [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/sqlite/sqlite-original-wordmark.svg" width="40" heidth="40"/>](https://www.sqlite.org)

## Arquitetura sugerida:
**Com certeza será alterada durante a implantação do projeto.**
```
src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   ├── meuapp/
│   │   │   │   ├── persistencia/  (Camada de Persistência de Dados)
│   │   │   │   ├── negocios/      (Camada de Negócios)
│   │   │   │   ├── apresentacao/  (Camada de Apresentação)
│   │   │   │   └── seguranca/     (Camada de Segurança e Controle de Acesso)
│   └── resources/
│       └── application.properties             
└── test/
    ├── java/
    └── resources/
```

## Estrutura do Banco de Dados:
> O banco de dados será composto pelas seguintes tabelas:

Legenda:
- PK = chave primária
- FK = chave estrangeira

<table>
  <tr>
    <th>1. Usuarios</th>
    <th>2. Perfis</th>
    <th>3. Fornecedores</th>
    <th>4. Enderecos</th>
    <th>5. Produtos</th>
    <th>6. Pedidos</th>
    <th>7. MovimentacaoEstoque</th>
  </tr>
  <tr>
    <td>id_usuario (PK, inteiro)</td>
    <td>id_perfil (PK, inteiro)</td>
    <td>id_fornecedor (PK, inteiro)</td>
    <td>id_endereco (PK, inteiro)</td>
    <td>id_produto (PK, inteiro)</td>
    <td>id_pedido (PK, inteiro)</td>
    <td>id_movimentacao (PK, inteiro)</td>
  </tr>
  <tr>
    <td>nome_usuario (texto)</td>
    <td>nome_perfil (texto)</td>
    <td>nome_fornecedor (texto)</td>
    <td>logradouro (texto)</td>
    <td>nome_produto (texto)</td>
    <td>data_pedido (data)</td>
    <td>id_produto (FK referenciando a tabela "Produtos)</td>
  </tr>
    <tr>
    <td>email (texto)</td>
    <td>descricao_perfil (texto)</td>
    <td>id_endereco (PK referenciando a tabela "Enderecos")</td>
    <td>numero (texto)</td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td>email (texto</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td>id_perfil (chave estrangeira referenciando a tabela "Perfis")</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
