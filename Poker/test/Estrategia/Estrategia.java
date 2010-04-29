package Estrategia;

import java.util.*;

public class Estrategia {

        private class ComparadorRegla implements Comparator<ReglaFinal> {

            @Override
            public int compare(ReglaFinal a, ReglaFinal b) {
                    return a.getPrioritat() - b.getPrioritat();
            }
        }

	private List<ReglaFinal> conjuntRegles;
	

	public Estrategia() {
		conjuntRegles = new ArrayList<ReglaFinal>();
                inicialitzadorReglesSimples();
	}
	
        private void inicialitzadorReglesSimples(){
                ReglaSimple simple=new ReglaSimple();
                //Regles que actuaran en cas de que no es complis cap altra regla
                simple.setNom("Per defecte fase aposta 1");
                simple.setFrase("Primera ronda d'apostes");
                simple.setPrioritat(999);
                simple.setAccio("FOLD");
                simple.setNom("Per defecte fase aposta 2");
                simple.setFrase("Segona ronda d'apostes");
                simple.setPrioritat(999);
                simple.setAccio("FOLD");
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Per defecte fase descart");
                simple.setFrase("Fase descart");
                simple.setPrioritat(999);
                simple.setAccio("DESCARTAR_RES");
                
                //Conjunt de regles simples sobre les quals crearem altres regles finals (amb accio associada)
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Parella");
                simple.setFrase("Parella");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Doble Parella");
                simple.setFrase("Doble Parella");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Trio");
                simple.setFrase("Trio");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Escala");
                simple.setFrase("Escala");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Color");
                simple.setFrase("Color");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Full");
                simple.setFrase("Full");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Poker");
                simple.setFrase("Poker");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Escala de color");
                simple.setFrase("Escala de color");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Carta alta");
                simple.setFrase("Carta alta");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Projecte de color");
                simple.setFrase("Projecte de color");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Projecte d'escala");
                simple.setFrase("Projecte d'escala");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Primera ronda d'apostes");
                simple.setFrase("Primera ronda d'apostes");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Fase descart");
                simple.setFrase("Fase descart");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Segona ronda d'apostes");
                simple.setFrase("Segona ronda d'apostes");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Jugador intermig");
                simple.setFrase("Jugador intermig");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Cega gran");
                simple.setFrase("Cega gran");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Cega petita");
                simple.setFrase("Cega petita");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Tothom ha igualat la cega");
                simple.setFrase("Tothom ha igualat la cega");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("No mes apostes");
                simple.setFrase("No mes apostes");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Raise entre 0% i 20%");
                simple.setFrase("Raise entre 0% i 20%");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Raise entre 20% i 40%");
                simple.setFrase("Raise entre 20% i 40%");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Raise entre 40% i 60%");
                simple.setFrase("Raise entre 40% i 60%");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Raise entre 60% i 80%");
                simple.setFrase("Raise entre 60% i 80%");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);
                simple=new ReglaSimple();
                simple.setNom("Raise superior al 80%");
                simple.setFrase("Raise superior al 80%");
                simple.setPrioritat(0);
                conjuntRegles.add(simple);


            }
	
	public void afegirRegla(ReglaFinal reglaFinal) {
		conjuntRegles.add(reglaFinal);
	}

	public String avaluaRegles(Map m) {
		// Ordenem regles
		Collections.sort(conjuntRegles, new ComparadorRegla());

		Iterator<ReglaFinal> pateaReglas = conjuntRegles.iterator();
		boolean reglaOK = false;
		ReglaFinal reglaFinal = null;

		// Iterem sobre cada regla que tenim al set, buscant la primera que s'acompleixi i
                // ademes tingui una accio associada.
		while (!reglaOK && pateaReglas.hasNext()) {
			reglaFinal = pateaReglas.next();
			reglaOK = avaluaReglaFinal(reglaFinal,m);

                        if (reglaOK && reglaFinal.getAccio()==null) reglaOK=false;
		}
                //A las malas, acaba saltant alguna de les regles per defecte
                return reglaFinal.getAccio();

        }

	/* PRIVATE */
	private boolean avaluaReglaFinal(ReglaFinal reglaFinal, Map m) {
		boolean reglaOK = false;

		// Comprovem quin tipus de regla evaluem
		if (reglaFinal instanceof ReglaSimple) {
			// Si es simple l'evaluem com a simple
			reglaOK = avaluaReglaSimple((ReglaSimple) reglaFinal,m);
		} else {
			// Si es composta l'evaluem com composta
			reglaOK = avaluaReglaComposta((ReglaComposta) reglaFinal,m);
		}

		return reglaOK;
	}

	
	private boolean avaluaReglaSimple(ReglaSimple a, Map m) {
		//Si la frase esta present al mapa proporcionat per l'evaluador de situaci�
                if (m.containsKey(a.getFrase())) return true;
                else return false;
	}

	private boolean avaluaReglaComposta(ReglaComposta reglaComposta, Map m) {
		boolean compleix1 = avaluaReglaFinal(reglaComposta.getRegla1(),m);
                boolean compleix2 = avaluaReglaFinal(reglaComposta.getRegla2(),m);
		
		// Si la primera es compleix i la operacio es "or" ja podem tornar que si
		if ((compleix1 || compleix2) && reglaComposta.getComparacio().compareToIgnoreCase("or")==0) {
			return true;
		}
		
		// Si la primera no es compleix i la operacio es "and" ja podem tornar que no
		if ((compleix1 && compleix2) && reglaComposta.getComparacio().compareToIgnoreCase("and")==0) {
			return true;
		}
		return false;
	}

        //Getters & Setters
        public List getConjuntRegles() {
            return conjuntRegles;
        }

        public void setConjuntRegles(List<ReglaFinal> x) {
            conjuntRegles=x;
        }

	
	
	
}
