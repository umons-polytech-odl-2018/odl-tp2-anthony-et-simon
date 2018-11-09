package exercise1;

public abstract class Employee {
	private String name;
	private int sales=0;						// pas besoin de static car au sein création d'un même objet, ça garde en mémoire
	private int workedHours=0;					// ex création plusieurs pers et calcul moyenne age -> plusieurs objets -> besoin de static

	public Employee (String name) {		//constructeur
		this.name = name ;
	}

	public abstract int computeSalary();		//méthode abstraite qui va être redéfinie

	public void sell() {
		sales++;
	}

	public void workOneHour() {
		workedHours++;
	}

	public String getName() {
		return name;
	}

	public int getSales(){
		return sales;
	}

	public int getWorkedHours(){
		return workedHours;
	}
}
