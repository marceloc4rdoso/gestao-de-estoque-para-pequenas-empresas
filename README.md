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
    <th class="1_1">1. Usuarios</th>
    <th class="1_2">2. Perfis</th>
    <th class="1_3">3. Fornecedores</th>
    <th class="1_4">4. Enderecos</th>
    <th class="1_5">5. Produtos</th>
    <th class="1_6">6. Pedidos</th>
    <th class="1_7">7. MovimentacaoEstoque</th>
  </tr>
  <tr>
    <td class="1_1">id_usuario (PK, inteiro)</td>
    <td class="1_2">id_perfil (PK, inteiro)</td>
    <td class="1_3">id_fornecedor (PK, inteiro)</td>
    <td class="1_4">id_endereco (PK, inteiro)</td>
    <td class="1_5">id_produto (PK, inteiro)</td>
    <td class="1_6">id_pedido (PK, inteiro)</td>
    <td class="1_7">id_movimentacao (PK, inteiro)</td>
  </tr>
  <tr>
    <td class="2_1">nome_usuario (texto)</td>
    <td class="2_2">nome_perfil (texto)</td>
    <td class="2_3">nome_fornecedor (texto)</td>
    <td class="2_4">logradouro (texto)</td>
    <td class="2_5">nome_produto (texto)</td>
    <td class="2_6">data_pedido (data)</td>
    <td class="2_7">id_produto (FK referenciando a tabela "Produtos)</td>
  </tr>
    <tr>
    <td class="3_1">email (texto)</td>
    <td class="3_2">descricao_perfil (texto)</td>
    <td class="3_3">id_endereco (PK referenciando a tabela "Enderecos")</td>
    <td class="3_4">numero (texto)</td>
    <td class="3_5">descricao (texto)</td>
    <td class="3_6">id_fornecedor (PK referenciando a tabela fornecedores)</td>
    <td class="3_7"></td>
  </tr>
    <tr>
    <td class="4_1">email (texto)</td>
    <td class="4_2"></td>
    <td class="4_3"></td>
    <td class="4_4">complemento () texto</td>
    <td class="4_5">preco_unitario (decimal)</td>
    <td class="4_6"></td>
    <td class="4_7"></td>
  </tr>
    <tr>
    <td class="5_1">id_perfil (chave estrangeira referenciando a tabela "Perfis")</td>
    <td class="5_2"></td>
    <td class="5_3"></td>
    <td class="5_4">bairro (texto)</td>
    <td class="5_5">quantidade_estoque (inteiro)</td>
    <td class="5_6"></td>
    <td class="5_7"></td>
  </tr>
    <tr>
    <td class="6_1"></td>
    <td class="6_2"></td>
    <td class="6_3"></td>
    <td class="6_4">cidade (texto)</td>
    <td class="6_5">id_fornecedor (FK referenciando a tabela Fornecedores)</td>
    <td class="6_6"></td>
    <td class="6_7"></td>
  </tr>
  <tr>
    <td class="7_1"></td>
    <td class="7_2"></td>
    <td class="7_3"></td>
    <td class="7_4">estado (texto)</td>
    <td class="7_5">categoria (texto)</td>
    <td class="7_6"></td>
    <td class="7_7"></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td class="8_3"></td>
    <td class="8_4">pais (texto)</td>
    <td class="8_5">marca (texto)</td>
    <td class="8_6"></td>
    <td class="8_7"></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td>cep (texto)</td>
    <td>data_validade (data)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td>telefone (texto)</td>
    <td>lote (texto)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td>email (texto)</td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td class="7_1"></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
