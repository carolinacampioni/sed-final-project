Design Pattern Utilizado: Arquitetura MVC

Explicando o MVC: Primeiro de tudo, MVC significa Model-View-Controller. A camada de Modelo (Model), da qual fazem parte as classes de domínio, tem como função organizar os dados e garantir que as regras do negócio sejam atendidas. As classes de domínio podem ser consideradas como o alicerce da aplicação. 
á a camada de Visão (View), é a camada disponível para o usuário interagir com o sistema. Ou seja, é a camada responsável por apresentar os dados para o usuário, e permitir que ele utilize as funcionalidades disponíveis no sistema. No Grails, alguns componentes presentes nessa camada são as views (arquivos gsp), as taglibs e os renderers, entre outros.
A outra camada, é a camada Controlador (Controller). Nela os principais componentes são os controllers. Essa camada é a intermediária entre a camada de visão e a camada de modelo, integrando-as. É importante salientar que essa camada não deve conter lógica de negócio. Ela deve ser uma camada mais “burra”, ou seja, deve ser somente o meio de campo entre a camada de Visão e a camada de Modelo.
Vale lembrar que, no serviço que criamos, não utilizamos a camada “View”, pois criamos uma api validada no postman.

O serviço que criamos: O serviço que criamos seria para o cadastro de uma pessoa, colocamos na camada Model(onde fica a domain) o mapeamento das tabelas do banco que criamos e apenas isso, o que era o suficiente para atender as regras do cadastro, vale lembrar que não criamos nenhum tipo de validação de campo, mas o serviço identifica se está faltando algum campo, se os dados inseridos já existem e também é possível deletar o cadastro caso queira.
Já na classe Controladora (Controller) colocamos a regra para a criação do cadastro, uma pequena regra que solicita a inserção dos dados para a inserção no banco.
Não utilizamos a classe view, pois criamos apenas com o intuito de validar pelo postman, sem algum tipo de tela html para o mesmo.

Como acessar o banco de dados? 
O framework escolhido(grails) cria um banco in memory, sendo assim, não precisamos configurar nenhum banco de dados externo, assim como não precisamos colocar credenciais fixadas no código. O link de acesso para o banco de dados seria: localhost:(porta)/h2-console. Bastar dar um select na tabela que os dados serão apresentados, e inserimos um id incremental para ficar bem-organizado cada registro.
Evidências: 

Criação:
 


Exclusão:







Registro existente:  
Registro não preenchido:
 

Banco in memory junto com a url: 
