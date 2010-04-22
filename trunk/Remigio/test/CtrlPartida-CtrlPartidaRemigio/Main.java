import java.util.LinkedList;
import java.util.List;



public class Main {

	/**
	 * @autor Victor Mier
	 */
	public static inout io = new inout();
	
	public static void runTest() throws Exception
	{		
		
		CtrlPartidaRemigio c = new CtrlPartidaRemigio();
		
		io.writeln("TESTER CtrlPartidaRemigio/CtrlPartida");
        io.writeln("1- Crear un CtrlPartidaRemigio buit - [constructora]");
        io.writeln("2- Crea una partida per a CtrlPartidaRemigio [crearPartida()](tambe la juga, un cop creada crida a jugarPartida())");
        io.writeln("3- Obtenir partida [getter]");
        io.writeln("4- Obtenir ctrlRonda [getter]");
        io.writeln("5- Obtenir ctrlJugadors [getter]");
        io.writeln("6- Jugar la partida des de la ronda de ctrlRonda [jugarPartida]");
        io.writeln("7- Fer les tasques de fi de ronda [finalitzarRonda()]");
        io.writeln("8- Fer les tasqeus de fi de partida [finalitzarPartida()]");
        io.writeln("9- S'ha acabat la partida? [fiPartida()]");
        io.writeln("10- Col-locar partida [setter]");
        io.writeln("11- Col-locar ctrlRonda [setter]");
        io.writeln("12- Col-locar ctrlJugadors [setter]");
        io.writeln("0- Sortir");        
        int op = -1;
        
        while (op != 0) {
                op = io.readint();
                switch (op) {

                case 1:// CtrlPartidaRemigio()
                		c = new CtrlPartidaRemigio();
                        io.writeln("S'ha creat un Controlador Partida Remigio buit");
                        break;
                case 2:// crearPartida(List<String>, Integer)
                        io.writeln("Entra un nom de jugador");
                        List<String> jugs = new LinkedList<String>();
                        String paraula = io.readword();
                        while(!paraula.equals("0")){
                        	jugs.add(paraula);
                        	io.writeln("Entra un altre nom de jugador o 0 per acabar");
                            paraula = io.readword();
                        }
                        io.writeln("Entra el valor del cashInicial");
                        int cashIni = io.readint();
                        c = new CtrlPartidaRemigio();
                        c.crearPartida(jugs, cashIni);
                        io.writeln("S'ha creat una Partida i la seva primera Ronda.");
                        io.writeln("La Partida s'ha assignat al ctrlPartidaRemigio i s'ha creat un ctrlRonda assignat a ctrlPartidaRemigio amb la Ronda inicialitzada i jugada	");
                        break;
                case 3:// getPartida()
	                    if (c.getPartida() == null) io.writeln("No hi ha cap partida carregada al controlador");
	                    else io.writeln("Hi ha una partida carregada al controlador");
	                    break;
                case 4:// getCtrlRonda()
	                    if (c.getCtrlRonda() == null) io.writeln("No hi ha cap CtrlRonda carregat al controlador");
	                    else io.writeln("Hi ha una CtrlRonda carregat al controlador");
	                    break;
                case 5:// getCtrlJugadors()
	                    if (c.getCtrlJugadors() == null) io.writeln("No hi ha cap CtrlJugador carregat al controlador");
	                    else io.writeln("Hi ha "+c.getCtrlJugadors().size()+" ctrlJugadors carregats al controlador");
	                    break;
		        case 6:// jugarPartida()
			            if(c.getPartida() == null) io.writeln("No hi ha cap Partida carregada");
			            else{
			            	c.jugarPartida();
			            	io.writeln("S'ha jugat i finalitzat la partida");
			            }
			            break;
		        case 7:// finalitzarRonda()
		            if(c.getCtrlRonda() == null) io.writeln("No hi ha cap Ronda carregada");
		            else{
		            	c.finalitzarRonda();
		            	io.writeln("S'han fet les gestions de fi de ronda");
		            }
		            break;
		        
		        case 8:// finalitzarPartida()
		            if(c.getPartida() == null) io.writeln("No hi ha cap Partida carregada");
		            else{
		            	c.finalitzarPartida();
		            	io.writeln("S'han fet les gestions de fi de partida");
		            }
		            break;
		            
		        case 9:// fiPartida()
		            if(c.getPartida() == null) io.writeln("No hi ha cap Partida carregada");
		            else{
		            	if(c.fiPartida()){
		            		io.writeln("S'ha acabat la partida");
		            	}else{
		            		io.writeln("No s'ha acabat la partida");
		            	}
		            }
		            break;
		            
		        case 10:// setPartida()
		        	io.writeln("Entra un nom de jugador");
                    LinkedList<Jugador> jugrs = new LinkedList<Jugador>();
                    paraula = io.readword();
                    while(!paraula.equals("0")){
                    	jugrs.add(new Jugador());
                    	io.writeln("Entra un altre nom de jugador o 0 per acabar");
                        paraula = io.readword();
                    }
                    io.writeln("Entra el valor del cashInicial");
                    cashIni = io.readint();
                    Partida part = new PartidaFirstToKnock(jugrs);
                    c.ctrlRonda = new CtrlRonda();
                    c.setPartida(part);
                    io.writeln("S'ha creat i setejat una nova partida");
		            break;
		            
		        case 11://setCtrlRonda()
		        	CtrlRonda aux = new CtrlRonda();
		        	c.setCtrlRonda(aux);
                    io.writeln("S'ha creat i setejat un nou controladorRonda");
                    break;
                    
		        case 12://setCtrlJugadors()
		        	List<CtrlJugadorRemigio> controlsJ = new LinkedList<CtrlJugadorRemigio>();
		        	io.writeln("Entra el numero de jugadors");
                    int nJ = io.readint();
                    for(int i = 0; i < nJ; i++){
                    	controlsJ.add(new CtrlJugadorRemigio());
                    }
		        	c.setCtrlJugadors(controlsJ);
                    io.writeln("S'han creat "+nJ+" controladors de jugador i setejat un nou CtrlJugadors (llista de controladors de jugador)");
                    break;

	}}}
	
	public static void main(String[] args) throws Exception {
		 runTest();
	}

}
