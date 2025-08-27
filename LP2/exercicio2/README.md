# 📚 Exercício - Sistema simples de empréstimo de livros

O sistema deve permitir cadastrar livros e usuários, além de realizar empréstimos de livros para os usuários.

A classe **Livro** (código, título, autor e qtd disponíveis).  
A classe **Usuario** deve representar um usuário da biblioteca, contendo atributos para nome e um identificador único, além de um método para exibir suas informações.  
A classe **Emprestimo** deve representar a ação de um usuário pegando um livro emprestado, com atributos que referenciam o livro e o usuário envolvidos no empréstimo, e métodos para realizar o empréstimo (marcando o livro como indisponível) e para devolver o livro (marcando-o novamente como disponível).  
Além disso, crie a classe **Biblioteca**, que gerencia coleções de livros e usuários por meio de listas, e deve conter métodos para adicionar livros e usuários, bem como listar os livros e usuários cadastrados.  

Adicione **2 ou 3 livros** e **1 ou 2 usuários**, realizar um empréstimo de livro para um usuário, e mostrar o status do livro antes e depois do empréstimo, evidenciando a mudança de disponibilidade.
