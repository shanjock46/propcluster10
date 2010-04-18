
import com.prop.cluster10.poker.app.model.Carta;
import com.prop.cluster10.poker.app.model.inout;

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
                io.writeln("1- Crear carta buida");
                io.writeln("2- Crear carta inicialitzada");
                io.writeln("3- Veure pal de la carta");
                io.writeln("4- Veure numero de la carta");
                io.writeln("5- Veure valor de la carta");
                io.writeln("6- Canviar pal de la carta");
                io.writeln("7- Canviar numero de la carta");
                io.writeln("8- Canviar valor de la carta");
                io.writeln("9- Comparar carta");
                io.writeln("0- Sortir");

                while (op != 0) {
                        op = io.readint();
                        switch (op) {

                        case 1:// Carta()
                            c = new Carta();
                                io.writeln("S'ha creat una carta buida");
                                break;
                        case 2:// Carta(String, Integer, Integer)
                                io.writeln("Entra el pal de la nova carta");
                                String pal=io.readword();
                                io.writeln("Entra el numero de la nova carta");
                                int num=io.readint();
                                io.writeln("Entra el valor de la nova carta");
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
                        case 7:// Carta()
                                io.writeln("Entra el numero nou carta");
                                int numNou=io.readint();
                                c.setNumero(numNou);
                                io.writeln("S'ha actualitzat el pal de la carta a "+numNou+".");
                                break;
                        case 8:// Carta()
                            c = new Carta();
                                io.writeln("S'ha creat una carta inicialitzada a valors nuls");
                                break;
                        case 9:// Carta()
                            c = new Carta();
                                io.writeln("S'ha creat una carta inicialitzada a valors nuls");
                                break;


}
                }
}
}