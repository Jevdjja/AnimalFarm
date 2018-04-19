package animalFarm;

import java.util.ArrayList;
import java.util.List;

/**
 * Den här klassen representerar en bondgård, typ sådana vi har 
 * i Skåne med massa djur och människor som duschar en gång i
 * kvartalet.
 * 
 * På gården finns det olika djur, som grisar, kor, osv.
 * 
 * @author Vesna
 *
 */
public class Farm {
	
	/**
	 * Det här är alla djuren som finns på gården. Varje djur är
	 * en instans av klassen Animal, och vi lagrar dem i en List
	 * som lagrar objekt av typen Animal.
	 */
	List<Animal> list = new ArrayList<Animal>();

	/**
	 * Det här är vår konstruktor - den används för att bygga upp 
	 * en ny instans av klassen, alltså när du någonstans i koden
	 * skriver:
	 * 
	 * Farm minBondgard = new Farm();
	 * 
	 * Då kallas konstruktorn. Om vi vill skulle vi kunna ge argument
	 * till den för att bygga upp instansen på ett visst sätt.
	 */
	public Farm() {

	}

	/**
	 * Med den här metoden hämtar vi listan med ALLA djur på gården, och
	 * returnerar den.
	 * 
	 * @return
	 */
	public List<Animal> getAnimal() {
		return list;

	}

	/**
	 * Med den här metoden lägger vi till ett djur på gården. Metoden tar
	 * ett argument - "animal" - som är av typen Animal. I vår klass har 
	 * vi som bekant en lista - "list" - som är av typen List<Animal>. 
	 * Detta betyder att vi kan ta argumentet animal och lägga det i list,
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
	 * Den här metoden låter oss leta upp alla djur på gården som väger mer
	 * än ett visst antal kilo. 
	 * 
	 * Metoden tar ett argument - "weight" - som är av typen double. Det här
	 * argumentet kan t.ex. ha värdet 75.2, och representerar minimi-vikten på
	 * de djur vi vill leta upp. Om vi till exempel har två grisar som väger 80
	 * och 90 kilo var, men också ett lamm som äger 50 kilo, så skulle en lista
	 * med de båda grisarna returneras.
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

