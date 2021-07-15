package  ordenação_lg2 ;

import  java.util.Arrays ;


import  java.util.Random ;




 classe  pública Ordenação_2 {



	public  static  void  main ( String [] args ) {


		


		int [] v = gerarVetor ( 10 );


		selectionSort (v);


		Sistema . para fora . println ( Arrays . toString (v));


	}


	private  static  void  selectionSort ( int [] v ) {


		para ( int i =  0 ; i < v . comprimento; i ++ ) {


			int menor = i;


			para ( int j = i +  1 ; j < v . comprimento; j ++ ) {


				if (v [j] < v [menor])


					menor = j;


			}



			trocar (v, i, menor);


		}


	}
	


	 trocarte privado estático  vazio  ( int [] v , int i , int menor ) {  


		int aux = v [i];


		v [i] = v [menor];


		v [menor] = aux;


	}


	public  static  int [] gerarVetor ( int  n ) {


	int [] v =  novo  int [n];


	Gerador aleatório =  novo  Random ();


	para ( int i =  0 ; i < n; i ++ ) {


		v [i] = gerador . nextInt ( 100 );


	}


	return v;


	}


}
