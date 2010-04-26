package com.prop.cluster10.common.test.app.model.carta;






/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dani
 */
public class TestCarta {

    public static void main(String[] args) throws Exception {


                int op = 30;
                inout io = new inout();
                Carta c=new Carta();
                Carta aux=new Carta();
                io.writeln("1- Crear carta buida");
                io.writeln("2- Crear carta inicialitzada");
                io.writeln("3- Veure pal de la carta");
                io.writeln("4- Veure numero de la carta");
                io.writeln("5- Veure valor de la carta");
                io.writeln("6- Canviar pal de la carta");
                io.writeln("7- Canviar numero de la carta");
                io.writeln("8- Canviar valor de la carta");
                io.writeln("9- Comparar carta amb cartes predeterminades");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Carta()
                            c = new Carta();
                                io.writeln("S'ha creat una carta buida");
                                break;
                        case 2:// Carta(String, Integer, Integer)
                                io.writeln("Entra el pal de la nova carta (Diamants, Cors, Trevols, Piques)");
                                String pal=io.readword();
                                io.writeln("Entra el numero de la nova carta");
                                int num=io.readint();
                                io.writeln("Entra el valor de la nova carta (0 per comodin)");
                                int val=io.readint();
                                c = new Carta(pal,num,val);
                                io.writeln("S'ha creat una carta inicialitzada amb pal="+pal+", numero="+num+", i valor="+val+".");
                                break;
                        case 3:// getPal()
                                io.writeln("El pal de la carta actual es: "+c.getPal()+".");
                                break;
                        case 4:// getNumero()
                                io.writeln("El numero de la carta actual es: "+c.getNumero()+".");
                                break;
                        case 5:// getValor()
                                io.writeln("El valor de la carta actual es: "+c.getValor()+".");
                                break;
                        case 6:// setPal(String)
                                io.writeln("Entra el pal nou carta");
                                String palNou=io.readword();
                                c.setPal(palNou);
                                io.writeln("S'ha actualitzat el pal de la carta a "+palNou+".");
                                break;
                        case 7:// setNumero(Integer)
                                io.writeln("Entra el numero nou carta");
                                int numNou=io.readint();
                                c.setNumero(numNou);
                                io.writeln("S'ha actualitzat el pal de la carta a "+numNou+".");
                                break;
                        case 8:// setValor(Integer)
                                io.writeln("Entra el valor nou carta");
                                int valNou=io.readint();
                                c.setValor(valNou);
                                io.writeln("S'ha actualitzat el pal de la carta a "+valNou+".");
                                break;
                        case 9:// compareTo(Carta)
                                aux=new Carta("Diamants", 9, 9);
                                io.writeln("Resultat de la comparació amb la carta "+aux.getNumero()+" de "+aux.getPal()+":");
                                    if (c.compareTo(aux)==-3) io.writeln("La teva carta es un comodin (valor=0)");
                                    else if (c.compareTo(aux)==-2) io.writeln("Pal: Diferent. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==-1) io.writeln("Pal: Igual. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==0) io.writeln("Pal: Igual. Numero: Igual");
                                    else if (c.compareTo(aux)==1) io.writeln("Pal: Igual. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==2) io.writeln("Pal: Diferent. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==3) io.writeln("Pal: Diferent. Numero: Igual");
                                io.writeln("------------------------------------------------------");
                                aux=new Carta("Cors", 2, 2);
                                io.writeln("Resultat de la comparació amb la carta "+aux.getNumero()+" de "+aux.getPal()+":");
                                    if (c.compareTo(aux)==-3) io.writeln("La teva carta es un comodin (valor=0)");
                                    else if (c.compareTo(aux)==-2) io.writeln("Pal: Diferent. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==-1) io.writeln("Pal: Igual. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==0) io.writeln("Pal: Igual. Numero: Igual");
                                    else if (c.compareTo(aux)==1) io.writeln("Pal: Igual. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==2) io.writeln("Pal: Diferent. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==3) io.writeln("Pal: Diferent. Numero: Igual");
                                io.writeln("------------------------------------------------------");
                                aux=new Carta("Piques", 7, 7);
                                io.writeln("Resultat de la comparació amb la carta "+aux.getNumero()+" de "+aux.getPal()+":");
                                    if (c.compareTo(aux)==-3) io.writeln("La teva carta es un comodin (valor=0)");
                                    else if (c.compareTo(aux)==-2) io.writeln("Pal: Diferent. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==-1) io.writeln("Pal: Igual. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==0) io.writeln("Pal: Igual. Numero: Igual");
                                    else if (c.compareTo(aux)==1) io.writeln("Pal: Igual. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==2) io.writeln("Pal: Diferent. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==3) io.writeln("Pal: Diferent. Numero: Igual");
                                io.writeln("------------------------------------------------------");
                                aux=new Carta("Trevols", 4, 4);
                                io.writeln("Resultat de la comparació amb la carta "+aux.getNumero()+" de "+aux.getPal()+":");
                                    if (c.compareTo(aux)==-3) io.writeln("La teva carta es un comodin (valor=0)");
                                    else if (c.compareTo(aux)==-2) io.writeln("Pal: Diferent. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==-1) io.writeln("Pal: Igual. Numero: Carta de sistema més gran");
                                    else if (c.compareTo(aux)==0) io.writeln("Pal: Igual. Numero: Igual");
                                    else if (c.compareTo(aux)==1) io.writeln("Pal: Igual. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==2) io.writeln("Pal: Diferent. Numero: La teva carta es mes gran");
                                    else if (c.compareTo(aux)==3) io.writeln("Pal: Diferent. Numero: Igual");
                                io.writeln("------------------------------------------------------");

                                break;


}
                }
}
}