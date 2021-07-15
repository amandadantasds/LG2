package  ordenação_lg2 ;

public  class  Recurs ão {


		public  static  int  fatorialNaoRecursivo ( int  num ) {


			


			if (num ==  0 ) {


				return  1 ;


			}



			total int =  1 ;


			para ( int i = num; i >  1 ; i - ) {


				total * = i;


			}
			


			retorno total;


		}


		public  static  int  fatorial ( int  num ) {


			
			if (num ==  0 ) {


				return  1 ;


			}


			
			retornar num * fatorial (num - 1 );


		}



	}
