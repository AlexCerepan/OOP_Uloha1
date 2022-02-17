import java.util.Random;

public class Knight {
	int energy;
	Random rand = new Random();
	float sila = rand.nextInt(50); // URCUJE SILU UTOKU
	
	void attack(Ogre ogre) {
		sila *= 0.01; //ABY JU MOHOL VYUZIT VZOREC MUSIM CISLO ZMENSIT NA DESATINNE
		ogre.energy = (int) (ogre.energy * sila) ; // (int) just casts a float result into an int
		ogre.revenge(this); // this represents a reference to the current knight object
		System.out.println(this); // PRIDAL SOM VYPIS
	}
}
