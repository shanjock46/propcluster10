package com.prop.cluster10.common.test.app.controller.ctrlronda;

import java.util.LinkedList;
import java.util.List;



public class TestCtrlRonda_CtrlRondaRemigio {

	/**
	 * @param args
	 */
	public static inout io = new inout();
	
	public static void runTest() throws Exception
	{		
		
		CtrlRondaRemigio c = new CtrlRondaRemigio();
		
		io.writeln("TESTER CtrlRondaRemigio/CtrlRonda");
        io.writeln("1- Crear un CtrlRondaRemigio buit - [constructora]");
        io.writeln("2- Crear un CtrlRondaRemigio amb Ronda");
        io.writeln("3- Obtenir el controladorJugador del jugadorActual [getter]");
        io.writeln("4- Obtenir la Ronda [getter]");
        io.writeln("5- Col-locar jugador actual [setter]");
        io.writeln("6- Col-locar la ronda [setter]");
        io.writeln("7- Eliminar un subconjunt de jugadors de la ronda [eliminarJugador()]");
        io.writeln("8- Juga la ronda [jugarRonda()]");
        io.writeln("0- Sortir");        
        int op = -1;
        
        while (op != 0) {
                op = io.readint();
                switch (op) {

                case 1:// CtrlRondaRemigio()
                		c = new CtrlRondaRemigio();
                        io.writeln("S'ha creat un Controlador Ronda Remigio buit");
                        break;
                        
                case 2:// CtrlRondaRemigio(Ronda)
                		Ronda ronda = new Ronda();
                		c = new CtrlRondaRemigio(ronda);
                		io.writeln("S'ha creat un Controlador Ronda Remigio amb ronda");
                		break;
                		
                case 3:// getJugadorActual()
	                    if (c.getJugadorActual() == null) io.writeln("No hi ha cap jugadorActual carregat al controlador");
	                    else io.writeln("Hi ha una CtrlJugador carregat al controlador com a jugadorActual");
	                    break;
	                    
                case 4:// getRonda()
	                    if (c.getRonda() == null) io.writeln("No hi ha cap ronda carregada al controlador");
	                    else io.writeln("Hi ha una ronda carregada al controlador");
	                    break;
	                    
                case 5:// setJugadorActual()
                		CtrlJugadorRemigio actual = new CtrlJugadorRemigio();
			        	c.setJugadorActual(actual);
	                    io.writeln("S'ha [creat] i setejat un nou jugadorActual");
	                    break;
	                    
                case 6:// setRonda()
	                	io.writeln("Entra un nom de jugador diferent de 0");
	                    List<Jugador> jugs = new LinkedList<Jugador>();
	                    String paraula = new String();
	                    paraula = io.readword();
	                    while(!paraula.equals("0")){
	                    	jugs.add(new Jugador(paraula));
	                    	io.writeln("Entra un altre nom de jugador o 0 per acabar");
	                        paraula = new String();
	                    	paraula = io.readword();
	                    }
	            		Ronda aux = new Ronda(jugs);
			        	c.setRonda(aux);
	                    io.writeln("S'ha creat i setejat una nova ronda");
	                    break;
	                    
                case 7:// eliminarJugador(List<Jugador>)
                		if(c.getRonda() == null) io.writeln("No hi ha cap ronda carregada al controlador");
                		else{
                			jugs = c.getRonda().getJugadorsActius();
                			io.writeln("Escull un jugador a eliminar");
                			int ind = 0;
                			List<Jugador> jugsE = new LinkedList<Jugador>();
                			for(Jugador j: jugs){
                				io.writeln("Eliminar "+j.nom+"? 1-SI 0-NO");
                				ind = io.readint();
                				if(ind == 1) jugsE.add(j);
                			}
                			c.eliminarJugador(jugsE);
                			io.writeln("Els jugadors seleccionats han estat eliminats");
                		}
                		break;
                		
                case 8:// jugarRonda()
                		if(c.getRonda() == null) io.writeln("No hi ha cap ronda carregada al controlador");
                		else{
                			c.jugarRonda();
                			io.writeln("S'ha jugat la ronda");
                		}
                		break;
	}}}
	
	public static void main(String[] args) throws Exception {
		 runTest();
	}

}
