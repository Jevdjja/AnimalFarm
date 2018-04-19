package animalFarm;

import java.util.ArrayList;
import java.util.List;

/**
 * Den h�r klassen representerar en bondg�rd, typ s�dana vi har 
 * i Sk�ne med massa djur och m�nniskor som duschar en g�ng i
 * kvartalet.
 * 
 * P� g�rden finns det olika djur, som grisar, kor, osv.
 * 
 * @author Vesna
 *
 */
public class Farm {
	
	/**
	 * Det h�r �r alla djuren som finns p� g�rden. Varje djur �r
	 * en instans av klassen Animal, och vi lagrar dem i en List
	 * som lagrar objekt av typen Animal.
	 */
	List<Animal> list = new ArrayList<Animal>();

	/**
	 * Det h�r �r v�r konstruktor - den anv�nds f�r att bygga upp 
	 * en ny instans av klassen, allts� n�r du n�gonstans i koden
	 * skriver:
	 * 
	 * Farm minBondgard = new Farm();
	 * 
	 * D� kallas konstruktorn. Om vi vill skulle vi kunna ge argument
	 * till den f�r att bygga upp instansen p� ett visst s�tt.
	 */
	public Farm() {

	}

	/**
	 * Med den h�r metoden h�mtar vi listan med ALLA djur p� g�rden, och
	 * returnerar den.
	 * 
	 * @return
	 */
	public List<Animal> getAnimal() {
		return list;

	}

	/**
	 * Med den h�r metoden l�gger vi till ett djur p� g�rden. Metoden tar
	 * ett argument - "animal" - som �r av typen Animal. I v�r klass har 
	 * vi som bekant en lista - "list" - som �r av typen List<Animal>. 
	 * Detta betyder att vi kan ta argumentet animal och l�gga det i list,
	 * eftersom animal har just den typ som list lagrar.
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		list.add(animal);

	}

	/**
	 * antal djur i farmen
	 * 
	 */
	public int getNrOfAnimals() {
		return list.size();
	}

	/**
	 * Den h�r metoden l�ter oss leta upp alla djur p� g�rden som v�ger mer
	 * �n ett visst antal kilo. 
	 * 
	 * Metoden tar ett argument - "weight" - som �r av typen double. Det h�r
	 * argumentet kan t.ex. ha v�rdet 75.2, och representerar minimi-vikten p�
	 * de djur vi vill leta upp. Om vi till exempel har tv� grisar som v�ger 80
	 * och 90 kilo var, men ocks� ett lamm som �ger 50 kilo, s� skulle en lista
	 * med de b�da grisarna returneras.
	 * 
	 * @param weight
	 * @return
	 */
	public List<Animal> getHeavierThan(double weight) {
		List<Animal> getHeavier = new ArrayList();

		for (Animal animal1 : list) {
			if (animal1.getWeight() >= weight) {
				getHeavier.add(animal1);

			}

		}

		/**
		 * for (Record record : list) { if (record.getCategory() == category) {
		 * categoryRecords.add(record);
		 */
		return getHeavier;

	}

	public int getTotalAge() {

		int sum = 0;
		for (Animal animal : list) {

			sum += animal.getAge();

		}
		return sum;

	}

	public int getAverage() {
		return getTotalAge() / getNrOfAnimals();
	}
    /**
	public List<Animals>isTimeFor() {
   return getPigs
   **/
}

