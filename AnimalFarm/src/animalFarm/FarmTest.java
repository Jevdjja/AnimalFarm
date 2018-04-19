package animalFarm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class FarmTest {

	/**
	 * Den här metoden har varken "public", "protected" eller "private" framför sig.
	 * Har vi skrivt fel? Nej, Java har ett tredje access skyddsalternativ -
	 * "package private", som vi får om vi inte skriver någonting alls, som här.
	 * 
	 * Package Private innebär att metoden bara är åtkomlig för instanser av den här
	 * klassen, instanser av dess barn och andra klasser i SAMMA PAKET (i det här
	 * fallet "animalFarm", som det står längst upp i filen).
	 * 
	 * Såhär kan vi summera hur alla de olika access skydden funkar:
	 * 
	 * private: BARA instanser av den här klassen kommer åt den här metoden.
	 * 
	 * protected: Instanser av den här klassen OCH instanser av barn till den här
	 * klassen kommer åt metoden. Tillexempel om Animal har en protected metod, så
	 * kommer både Pig och Horse åt den.
	 * 
	 * public: ALLA kommer åt den här metoden. Ungefär som din pojkvän.
	 * 
	 * package private (tomt): instanser av klasser som lever i samma paket som den
	 * här klassen kommer åt metoden.
	 */
	
	//package private// void test(){
	@Test
	void test() {
		// Given
		Farm farm = new Farm(); //skapar en ny farm,instans av Farm
		Animal animal1 = new Pig("Piggy", 39, 2);
		Animal horse = new Horse("Lilly", 500, 1);
		Animal sheep = new Sheep("BäBä", 100, 1);
		farm.addAnimal(animal1);
		farm.addAnimal(horse);
		farm.addAnimal(sheep);
		// When
		/**ny List variabel, man kan även testa utan den
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
		// assertEquals(list.size(),3); eller så kan man skriva så här

	}
    @Test
	void testAge() {
		Farm farm1 = new Farm();
		Animal animal1 = new Pig("Piggy", 39, 2);
		Animal horse = new Horse("Lilly", 500, 1);
		Animal sheep = new Sheep("BäBä", 100, 1);
		farm1.addAnimal(animal1);
		farm1.addAnimal(horse);
		farm1.addAnimal(sheep);

		assertEquals(farm1.getAverage(), 1);
		assertEquals(farm1.getTotalAge(), 4);

	}
}