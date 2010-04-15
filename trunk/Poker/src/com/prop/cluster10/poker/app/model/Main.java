/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;


/**
 *
 * @author Daniel Mulero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        inout io= new inout();
        System.out.println("Nom jugador");
        String s=io.readword();
	Jugador j=new JugadorFiveCardDraw(s);
        System.out.println("5 cartas");
        Carta[] c=new Carta[5];
        for (int i=0; i<5; i++) {
            Carta x=new Carta();
            System.out.println("Pal de la carta "+(i+1)+":");
            String a=io.readword();
            x.setPal(a);
            System.out.println("Numero de la carta "+(i+1)+":");
            int b=io.readint();
            x.setNumero(b);
            c[i]=x;
           }
        j.setMa(c);
        j.setAposta(0);
        boolean[] b=j.evaluador(5000, false, 50, 50, 0);
        for (int z=0;z<b.length;z++) {
            if (b[z]==true) System.out.print(z+",");
                    }
    }


    }
