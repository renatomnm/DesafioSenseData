O Projeto foi implementado na linguagem Java, utilizando o IDE eclipse, selenium webdriver para a automação da navegação do site, JUnit para execução dos testes e Maven para o gerenciamento das dependências. Faça o clone do projeto no repositório do github

1 - Instalação do google chrome
- Verificar a versão atual do google chrome. Acessar  Menu Lateral > Ajuda > Sobre o google chrome
- Acessar o site https://chromedriver.chromium.org/downloads, para baixar o chromedriver. Selecione a versão correspondente ao Chrome, ou inferior. 
- Descompacte a pasta e salve em c:/

2 - Instalação do eclipse
	- Baixar o instalador em https://www.eclipse.org/downloads/
	- execute o instalador

3 - Importar o projeto 
Navegar em Menu > Import > General > Projects from Folder or Archive
No campo import source: selecione a opção Directory
Selecione a pasta na janela de seleção 
Clique em Finish, o projeto foi importado e aparece na aba Package explorer


5- Execução
Na aba Package Explorer clique com o botão direito no arquivo src/Run/RunTest.java
Clique em Run As > JUnit Test
Uma aba JUnit é criada ao lado da Package explorer
A aba JUnit demonstra o status atual da execução do teste
Quando a barra fica verde, o teste foi aprovado
