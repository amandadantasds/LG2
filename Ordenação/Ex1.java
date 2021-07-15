package  ordenação_lg2 ;


 classe  pública Ordena ção_1 {
 

	public  static  void  main ( String [] args ) {



		vetor int [] = { 3 , 6 , 2 , 1 , 8 , 4 };


		int aux;


		controle booleano ;


		para ( int i =  0 ; i < vetor . comprimento; ++ i) {


			controle =  verdadeiro ;


			for ( int j =  0 ; j < (vetor . comprimento -  1 ); ++ j) {


				se (vetor [j] > vetor [j +  1 ]) {


					aux = vetor [j];


					vetor [j] = vetor [j +  1 ];


					vetor [j +  1 ] = aux;


					controle =  falso ;


				}


				


			}



				if (controle) {


					pausa ;


				}


			}


		


		para ( int i =  0 ; i < vetor . comprimento; ++ i) {


			Sistema . para fora . println (vetor [i] +  " " );	


		}


	







	}





 

}
