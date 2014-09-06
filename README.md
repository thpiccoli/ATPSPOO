ATPSPOO
=======

ATPS Programação estruturada 2

Definição do menu da tela inicial:

Cadastro
Equipamento
Novo
Atualizar
Excluir
Software
Novo
Atualizar
Excluir
Colaboradores
Novo
Atualizar
Excluir
Departamento
Novo
Atualizar
Excluir



Definição da Classe Equipamento:
	
	int idSequencial;
int codigoPatrimonial;// Gerado a partir da junção do IdSequencial e do AnoAquisição.
    	String tipoEquipamento; //Portatil ou fixo
    	String[] acessorios;
    	String tipoUso; //Coletivo ou individual
    	String acessoRede; //Wireless, radio, fixo
   	
	//Se tipoUso individual
int matricula;
//Se tipoUso Coletivo
	int CentroCusto = 4361;
	int anoAquisicao;

Definição da Classe Software:
	
int idSequencial;;
String nomeSoftware;
String fabricanteSoftware;
int versaoSoftware;
int numeroNotaFiscal;
int dataAquisição;
int chaveLicenciamento;
int validadeChaveLicenciamento;
String classificacao; //sistema operacional, utilitário, ferramenta de 
desenvolvimento, driver e outros

Boolean backupCorporativo;


Definição da Classe Colaborador:

	int matricula;
	String nome;
	String localTrabalho; // interno ou externo

Definição da Classe Departamento::

	int codDepartamento;
	String descricao;
