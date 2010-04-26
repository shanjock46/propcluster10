/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prop.cluster10.common.test.app.model.jugador;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Dani
 */
public class TestJugador {

           public static void main(String[] args) throws Exception {

                int op = 30;
                inout io = new inout();
                Jugador jug=new JugadorFiveCardDraw();
                io.writeln("1- Crear un jugador buit");
                io.writeln("2- Crear un jugador amb nom i cash");
                io.writeln("3- Crear un jugador amb nom");
                io.writeln("4- Veure el nom del jugador");
                io.writeln("5- Veure la ma del jugador");
                io.writeln("6- Veure el cash del jugador");
                io.writeln("7- Veure l'aposta del jugador");
                io.writeln("8- Veure les estadistiques del jugador");
                io.writeln("9- Veure l'estrategia");
                io.writeln("10- Canviar el nom del jugador");
                io.writeln("11- Canviar la ma del jugador");
                io.writeln("12- Canviar el cash del jugador");
                io.writeln("13- Canviar l'aposta del jugador");
                io.writeln("14- Canviar les estadistiques del jugador");
                io.writeln("15- Canviar l'estrategia");
                io.writeln("16- Afegir una carta a la ma");
                io.writeln("17- Buidar la ma");
                io.writeln("18- Descartar una carta");
                io.writeln("19- Fer una evaluació");
                io.writeln("20- Carrega les estadístiques");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Creadora buida. Jugador es abstracta.
                                jug=new JugadorFiveCardDraw();
                                io.writeln("S'ha creat un nou jugador");
                                break;
                        
                        case 2:// Creadora amb parametres. Jugador es abstracta
                                io.writeln("Nom del jugador:");
                                String x=io.readword();
                                io.writeln("Cash inicial:");
                                int i=io.readint();
                                jug=new JugadorFiveCardDraw(x,i);
                                io.writeln("S'ha creat un jugador amb nom "+jug.getNom()+" i amb el cash inicial igual a "+jug.getCash());
                                break;
                                
                        case 3:// Creadora amb parametres. Jugador es abstracta
                                io.writeln("Nom del jugador:");
                                String s=io.readword();
                                jug=new JugadorFiveCardDraw(s);
                                io.writeln("S'ha creat un jugador amb nom "+jug.getNom());
                                break;

                        case 4:// getNom()
                                io.writeln("El jugador es diu "+jug.getNom());
                                break;

                         case 5:// getMa()
                                ArrayList<Carta> ma=jug.getMa();
                                io.writeln("La ma del jugador es la seguent:");
                                Iterator<Carta> pateador=ma.iterator();
                                Carta c=new Carta();
                                while (pateador.hasNext()){
                                    c=pateador.next();
                                    io.writeln("El "+c.getNumero()+" de "+c.getPal());
                                }
                                io.writeln("Fi de la ma");
                                
                                break;

                        case 6:// getCash()
                                io.writeln("El cash del jugador es "+jug.getCash());
                                break;

                        case 7:// getAposta()
                                io.writeln("L'aposta del jugador es "+jug.getAposta());
                                break;

                        case 8:// getEstadistiques()
                                io.writeln("Les estadistiques del jugador son:");
                                io.writeln("Partides Jugades: "+jug.getEst().getPartidesJugades());
                                io.writeln("Partides Guanyades: "+jug.getEst().getPartidesGuanyades());
                                io.writeln("Partides Eliminat: "+jug.getEst().getPartidesEliminat());
                                io.writeln("Rondes Jugades: "+jug.getEst().getRondesJugades());
                                io.writeln("Rondes Guanyades: "+jug.getEst().getRondesGuanyades());
                                io.writeln("Rondes Perdudes: "+jug.getEst().getRondesPerdudes());
                                io.writeln("Fitxes Guanyades: "+jug.getEst().getFitxesGuanyades());
                                break;

                        case 9:// getEstrategia()
                                if (jug.getEstrategia()==null) io.writeln("El jugador no te estrategia");
                                else io.writeln("La id de la estrategia es "+jug.getEstrategia());
                                break;

                        case 10:// setNom(String)
                                io.writeln("Nou nom del jugador:");
                                String n=io.readword();
                                jug.setNom(n);
                                io.writeln("Ara el jugador es diu "+jug.getNom());
                                break;

                        case 11:// setMa(ArrayList<Carta>)
                                io.writeln("Cuantes cartes vols ficar?");
                                int r=io.readint();
                                ArrayList<Carta> f=new ArrayList();
                                for (int w=0; w<r; w++) {
                                    Carta xx=new Carta();
                                    io.writeln("Pal de la carta "+(w+1)+":");
                                    String a=io.readword();
                                    xx.setPal(a);
                                    io.writeln("Numero de la carta "+(w+1)+":");
                                    int b=io.readint();
                                    xx.setNumero(b);
                                    f.add(xx);
                               }
                                jug.setMa(f);
                                io.writeln("La ma ha canviat");
                                break;

                        case 12:// setCash(Integer)
                                io.writeln("Introdueix un nou cash pel jugador");
                                int y=io.readint();
                                jug.setCash(y);
                                io.writeln("El cash del jugador ara es "+jug.getCash());
                                break;

                        case 13:// setAposta(Integer)
                                io.writeln("Introdueix una nova aposta");
                                int q=io.readint();
                                jug.setAposta(q);
                                io.writeln("El cash del jugador ara es "+jug.getAposta());
                                break;

                        case 14:// setEstadistiques(Estadistiques)
                                Estadistiques dfg=new Estadistiques();
                                io.writeln("Introdueix Partides Jugades:");
                                int de=io.readint();
                                dfg.setPartidesJugades(de);
                                io.writeln("Introdueix Partides Guanyades:");
                                de=io.readint();
                                dfg.setPartidesGuanyades(de);
                                io.writeln("Introdueix Partides Eliminat:");
                                de=io.readint();
                                dfg.setPartidesEliminat(de);
                                io.writeln("Introdueix Rondes Jugades:");
                                de=io.readint();
                                dfg.setRondesJugades(de);
                                io.writeln("Introdueix Rondes Guanyades:");
                                de=io.readint();
                                dfg.setRondesGuanyades(de);
                                io.writeln("Introdueix Rondes Eliminat");
                                de=io.readint();
                                dfg.setRondesPerdudes(de);
                                io.writeln("Introdueix Fitxes Guanyades:");
                                de=io.readint();
                                dfg.setFitxesGuanyades(de);
                                jug.setEst(dfg);
                                io.writeln("S'han modificat les estadistiques del jugador");
                                break;

                        case 15:// setEstrategia(Estrategia)
                                EstrategiaSB fdsa=new EstrategiaSB();
                                io.writeln("Introdueix la id de la nova estrategia");
                                int dre=io.readint();
                                fdsa.setId(dre);
                                jug.setEstrategia(fdsa);
                                io.writeln("S'ha modificat la estrategia del jugador");
                                break;

                        case 16:// afegeixCarta(Carta)
                                Carta klj=new Carta();
                                io.writeln("Pal de la carta:");
                                String m=io.readword();
                                klj.setPal(m);
                                io.writeln("Numero de la carta:");
                                int b=io.readint();
                                klj.setNumero(b);
                                jug.afegeixCarta(klj);
                                io.writeln("S'ha afegit el "+b+" de "+m+" a la ma del jugador");
                                break;

                        case 17:// buidaCartes()
                                jug.buidaCartes();
                                io.writeln("S'ha buidat la ma del jugador");
                                break;

                        case 18:// Descartar(int,String)
                                io.writeln("Introduiu el numero de la carta a descartar");
                                int num=io.readint();
                                io.writeln("Introduiu el pal de la carta a descartar");
                                String pal=io.readword();
                                jug.descartar(num, pal);
                                io.writeln("La carta de numero: "+num+" i pal"+pal+" ha estat descartada");
                                break;

                        /*case 19:// Evaluador(int,boolean,int,int,int)
                                                               
                                boolean[] rc=jug.
                                for (int ui=0;ui<rc.length;ui++) {
                                    if (rc[ui]==true) io.writeln("El boolea en posicio "+ui+" es TRUE");
                    }

                                break;*/

                        case 19:// Carrega estadistiques()
                                io.writeln("Les estadistiques son...");
                                Map<String,Double> pepe=jug.carregaEstadistiques();

                                Iterator iterator = pepe.keySet().iterator();

                                while (iterator.hasNext()) {
                                    String key = iterator.next().toString();
                                    String value = pepe.get(key).toString();
                                    io.writeln(key + ": " + value);
                                   }

                                break;

                       

           }
}
           }
}
