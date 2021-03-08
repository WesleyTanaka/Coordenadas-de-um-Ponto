Atividade da coodernadas de um ponto
URI 1041

public class URI 1041

 public static void main (String[] args) throws IOException {
   Scanner leitor = new Scanner (System.in);
   double y = leitor. nextDouble ();
   double x = leitor. nextDouble ();
   if ( y == 0 x == 0) {
     System.out.println ("Origem");
   } else if (x == 0) {
     System.out.println ("Eixo y");
   } else if (y == 0) {
     System.out.println ("Eixo x");
   } else if (y > 0 x > 0) {
     System.out.println ("Q1");
   } else if (y > 0 x < 0) {
     System.out.println ("Q2");
   } else if (y < 0 x < 0) {
     System.out.println ("Q3");
   } else if (y< 0 x > 0 ) {
     System.out.println ("Q4");
   }
  