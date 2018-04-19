package animalFarm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class FarmTest {

	/**
	 * Den h�r metoden har varken "public", "protected" eller "private" framf�r sig.
	 * Har vi skrivt fel? Nej, Java har ett tredje access skyddsalternativ -
	 * "package private", som vi f�r om vi inte skriver n�gonting alls, som h�r.
	 * 
	 * Package Private inneb�r att metoden bara �r �tkomlig f�r instanser av den h�r
	 * klassen, instanser av dess barn och andra klasser i SAMMA PAKET (i det h�r
	 * fallet "animalFarm", som det st�r l�ngst upp i filen).
	 * 
	 * S�h�r kan vi summera hur alla de olika access skydden funkar:
	 * 
	 * private: BARA instanser av den h�r klassen kommer �t den h�r metoden.
	 * 
	 * protected: Instanser av den h�r klassen OCH instanser av barn till den h�r
	 * klassen kommer �t metoden. Tillexempel om Animal har en protected metod, s�
	 * kommer b�de Pig och Horse �t den.
	 * 
	 * public: ALLA kommer �t den h�r metoden. Ungef�r som din pojkv�n.
	 * 
	 * package private (tomt): instanser av klasser som lever i samma paket som den
	 * h�r klassen kommer �t metoden.
	 */
	
	//package private// void test(){
	@Test
	void test() {
		// Given
		Farm farm = new Farm(); //skapar en ny farm,instans av Farm
		Animal animal1 = new Pig("Piggy", 39, 2);
		Animal horse = new Horse("Lilly", 500, 1);
		Animal sheep = new Sheep("B�B�", 100, 1);
		farm.addAnimal(animal1);
		farm.addAnimal(horse);
		farm.addAnimal(sheep);
		// When
		/**ny List variabel, man kan �ven testa utan den
		 * tex. assertTrue(farm.getAnimal().size() ==3);
		 */
		List<Animal> list = farm.getAnimal(); 
		// Then
		assertTrue(list.size() == 3);

	}
   @Test
	void test2() {
		Farm farm1 = new Farm();
		Animal animal1 = new Pig("Piggy", 39, 2);
		farm1.addAnimal(animal1);
		// List<Animal> list= farm1.getAnimal();
		// getNrOfAnimals();
		assertTrue(farm1.getNrOfAnimals() == 1);

	}
   @Test
	void test3() {
		Farm farm1 = new Farm();
		Animal animal1 = new Pig("Piggy", 39, 2);
		farm1.addAnimal(animal1);
		List<Animal> list = farm1.getHeavierThan(20);
		
		assertEquals(farm1.getNrOfAnimals(), 1);
		assertTrue(list.size() == 1);
		// assertEquals(list.size(),3); eller s� kan man skriva s� h�r

	}
    @Test
	void testAge() {
		Farm farm1 = new Farm();
		Animal animal1 = new Pig("Piggy", 39, 2);
		Animal horse = new Horse("Lilly", 500, 1);
		Animal sheep = new Sheep("B�B�", 100, 1);
		farm1.addAnimal(animal1);
		farm1.addAnimal(horse);
		farm1.addAnimal(sheep);

		assertEquals(farm1.getAverage(), 1);
		assertEquals(farm1.getTotalAge(), 4);

	}
}