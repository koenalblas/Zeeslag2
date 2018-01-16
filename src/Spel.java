
class  Spel{
	void starten() {
		System.out.println("Spel starten");
		Speler spelera = new Speler();
		Speler spelerb = new Speler();

		spelera.spelen();
		spelerb.spelen();
		}
	}