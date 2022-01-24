# :computer: Testes FrontEnd :memo:

### Relatório - Atividade do Encontro Remoto 1:



- #### Objetivos:

  - Este documento do Plano de Testes do Curso "Programador FullStack" do Senai, tem os seguintes objetivos:

    - Listar os requisitos a testar recomendados;
    - Descrever as estratégias de teste que a serem empregadas;
    - Listar os recursos utilizados no teste;
    - Descrever os elementos resultantes dos testes.

    

- #### Escopo: 

  - Os testes serão realizados no site do [Senai São Paulo Online](https://online.sp.senai.br/).

  - O teste realizado nesta atividade foi o teste de navegabilidade na Home Page do site, verificando a interação do usuário com a plataforma e resposta do site á respectiva interação do usuário:

    1. Verificar a funcionalidade da busca de cursos;
    2. Verificar resultado da busca no site;
    3. Verificar o funcionamento do Link da página de Fale Conosco do menu lateral esquerdo da Home Page.
    4. Verificar o preenchimento e validação dos campos do formulário da página Fale Conosco na nova Aba.

- #### **Requisitos a testar:**

  - A lista abaixo identifica os itens - use cases, requisitos funcionais e não funcionais - que serão os alvos do teste:
    1. Teste da função de Busca de cursos;
       - Na página inicial do site, deve-se interagir com o campo de busca, procurar o termo "Gestão" e verificar o retorno desta busca, que deve retornar cursos com esta expressão buscada sem erros.
    2. Resposta da página á funcionalidade de Busca;
       - O retorno da página deve ser uma lista de cursos com a expressão buscada e  o quantitativo destes cursos.
    3. Verificar o funcionamento do Link de Fale Conosco na Home Page;
       - Na página inicial, deve se interagir com o menu lateral de links, clicando no link da página de "Fale Conosco", e verificar se esta interação redireciona corretamente o usuário para a página de Fale Conosco do site.

    4. Verificar o preenchimento e validação dos campos do formulário da página Fale Conosco na nova Aba.
       - Na página de "Fale Conosco", deve haver o preenchimento do formulário de Fale conosco, para avaliar se a página realiza o preenchimento as validações corretas dos campos que necessitam serem validados.

-  #### Ferramentas:

  |                       | Ferramentas     | Proprietário       |
  | --------------------- | --------------- | ------------------ |
  | Planejamento de Teste | Markdown Editor | Typora             |
  | Desenho de teste      | Eclipse IDE     | Eclipse Foundation |
  | Execução de Teste     | Java            | Oracle             |

- #### Resultado do Teste:

  - O navegador foi aberto, sendo maximizado a tela do navegador seguido de redirecionamento para a home page do site do SENAI São Paulo. Ao carregamento da página inicial, o campo de busca foi selecionado e digitado em seu input a expressão “gestão” para realização da pesquisa. No entanto, a resposta do site á essa solicitação foi o aparecimento de uma página vazia escrito apenas a informação **"Bad Request"**  o que caracteriza um erro na requisição do site, uma vez que o retorno á solicitação de busca não retornou uma listagem de cursos com a expressão pesquisada. Este teste evidenciou um erro á ser tratado pela equipe responsável pela manutenção do site.
  - No segundo teste realizado, o teste automatizado foi capaz de retornar á página anteriormente visitada, clicar no link do menu lateral do site que representa o link da página de Fale Conosco, resultando em um correto redirecionamento á página de Fale Conosco em outra aba do site.
  - No teste de verificação do preenchimento do formulário, o teste automatizado foi capaz de realizar o correto preenchimento dos campos da página e as validações de formato dos campos de CEP e CPF (Retornando "Formato Inválido" quando os campos eram preenchidos por valores inválidos).
  
  











