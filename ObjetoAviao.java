import java.util.Scanner;
public class ObjetoAviao {
    public static void main (String [] args){
         Scanner ler = new Scanner(System.in);

        {
            Aviao aviao1 = new Aviao();
            Aviao aviao2 = new Aviao();

         String tipo,tipo2,tipo3, cor, cor2, cor3;
         int velocidades,velocidades2,velocidades3, qtDeAssentos, qtDeAssentos2, qtDeAssentos3;

         System.out.println(" Seja bem Vindo Gerente, declare as características de cada avião! ");
         System.out.println(" ------------------------------------------------------------------- ");

         System.out.println( " Insira o tipo do Avião 1° por favor : " );
         tipo = ler.nextLine();
         System.out.println( " Insira a cor do Avião 1° por favor : " );
         cor = ler.nextLine();
        System.out.println( " Insira a Velocidade do Avião 1° por favor : " );
        velocidades = ler.nextInt();
        System.out.println( " Insira a Quantidade de Objetos do Avião 1° por favor : " );
        qtDeAssentos = ler.nextInt();

            System.out.println(" ------------------------------------------------------------------- ");

            System.out.println( " Insira o tipo do Avião 2° por favor : " );
        tipo2 = ler.nextLine();
            ler.nextLine();
        System.out.println( " Insira a cor do Avião 2° por favor : " );
        cor2 = ler.nextLine();
            ler.nextLine();
        System.out.println( " Insira a Velocidade do Avião 2° por favor : " );
        velocidades2 = ler.nextInt();
            ler.nextLine();
        System.out.println( " Insira a Quantidade de Objetos do Avião 2° por favor : " );
        qtDeAssentos2 = ler.nextInt();

            System.out.println(" ------------------------------------------------------------------- ");

        System.out.println( " Insira o tipo do Avião 3° por favor : " );
        tipo3 = ler.nextLine();
        ler.nextLine();
        System.out.println( " Insira a cor do Avião 3° por favor : " );
        cor3 = ler.nextLine();
            ler.nextLine();
        System.out.println( " Insira a Velocidade do Avião 3° por favor : " );
        velocidades3 = ler.nextInt();
            ler.nextLine();
        System.out.println( " Insira a Quantidade de Objetos do Avião 3° por favor : " );
        qtDeAssentos3 = ler.nextInt();

            aviao1.setTipo(tipo);
            aviao1.setCor(cor);
            aviao1.setVelocidades(velocidades);
            aviao1.setQtDeAssentos(qtDeAssentos);

            aviao2.setTipo(tipo2);
            aviao2.setCor(cor2);
            aviao2.setVelocidades(velocidades2);
            aviao2.setQtDeAssentos(qtDeAssentos2);
            Aviao aviao3 = new Aviao();


            aviao3.setTipo(tipo3);
            aviao3.setCor(cor3);
            aviao3.setVelocidades(velocidades3);
            aviao3.setQtDeAssentos(qtDeAssentos3);

            System.out.println(" ------------------------------------------------------------------- ");
        System.out.println( "  o tipo do Avião 1°  : " + aviao1.getTipo());
        System.out.println( "  a cor do Avião 1°  : " + aviao1.getCor());
        System.out.println( " a Velocidade do Avião 1°: " + aviao1.getVelocidades());
        System.out.println( "  a Quantidade de Objetos do Avião 1°  : " + aviao1.getQtDeAssentos());
            System.out.println(" ------------------------------------------------------------------- ");
        System.out.println( "  o tipo do Avião 2°  : " + aviao2.getTipo());
        System.out.println( "  a cor do Avião 2° : "  + aviao2.getCor());
        System.out.println( " a Velocidade do Avião 2°: " + aviao2.getVelocidades());
        System.out.println( "  a Quantidade de Objetos do Avião 2°  : " + aviao2.getQtDeAssentos());
            System.out.println(" ------------------------------------------------------------------- ");
        System.out.println( "  o tipo do Avião 3° : " + aviao3.getTipo());
        System.out.println( "  a cor do Avião 3° : "  + aviao3.getCor());
        System.out.println( " a Velocidade do Avião 3°  : " + aviao3.getVelocidades());
        System.out.println( " a Quantidade de Objetos do Avião 3°  : " + aviao3.getQtDeAssentos());

    }

}}
