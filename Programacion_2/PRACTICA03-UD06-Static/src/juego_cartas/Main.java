package juego_cartas;

public class Main {

	public static void main(String[] args) {
		Esbirro recluta = new Esbirro("Recluta", 2, 1, 3, "HUMANO", "Comun", "Añade 2 de salud al aliado cercano");
		Esbirro paladin = new Esbirro("Paladin", 5, 3, 9, "HuMaNo", "Raro", "Tienes que atacar a este esbirro primero");
		Esbirro jaraxus = new Esbirro("Jaraxus", 9, 9, 9, "deMonIo", "Legendario", "Infingle 10 de daño a los esbirros enemigos");
		Esbirro goblin = new Esbirro("Goblin", 1, 1, 1, "gobLin", "Epica", "Inflinge 1 de daño");
		
		Hechizo bolaFuego = new Hechizo("Bola de Fuego", 5, 5, "Fuego", "Raro", "Quema al objetivo durenate 2 turnos");
		Hechizo meteoro = new Hechizo("Meteoro", 8, 10, "fUEGo", "Epica", "Quema al objetivo durenate 5 turnos");
		Hechizo lanzaHielo = new Hechizo("Lanza de hielo", 3, 2, "Hielo", "Comun", "Inflige 2 daños a los objetivos adyacentes");
		Hechizo roboArcano = new Hechizo("Robo Arcano", 1, 1, "Arcano", "Legendario", "Invoca un diablillo 1/1");
		
		recluta.resumenCarta();
		paladin.resumenCarta();
		jaraxus.resumenCarta();
		goblin.resumenCarta();
		
		Esbirro.resumenMazo();
		
		bolaFuego.resumenCarta();
		meteoro.resumenCarta();
		lanzaHielo.resumenCarta();
		roboArcano.resumenCarta();
		
		Hechizo.resumenMazo();



	}

}
