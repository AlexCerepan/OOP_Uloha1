
public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	public static void main(String[] args) {
		Knight[] k = new Knight[20];
		Ogre[] o = new Ogre[20];

		// another kind of an ogre has been added: BadOgre
		// this is just the initialization of ogre and knight arrays so that different combinations would occur
		for (int i = 0; i < 10; i++) {
			k[i] = new Knight();
			k[i].energy = 40;
			o[i] = new Ogre();
			o[i].energy = 50;
		}

	/*	for (int i = 10; i < 15; i++) {
			k[i] = new Knight();
			k[i].energy = 40;
			o[i] = new BadOgre();
			o[i].energy = 50;
			o[i].hungry = true;
		}

		for (int i = 15; i < 20; i++) {
			k[i] = new Knight();
			k[i].energy = 40;
			o[i] = new Ogre();
			o[i].energy = 50;

		}*/

		// the clash loop with an output statement
		for (int i = 0; i < 10; i++) {
			clash(o[i], k[i]);
			
			System.out.println(i + ":"
					+ "knight " + k[i].energy + " / "
					+ "ogre " + o[i].energy);
		}
	}

	//VYPRACOVANIE ULOH
	//1.) SLEDOVAL SOM ZMENU VýPISU KTORá JE ZáVYSLá OD ZMENY OBRA ROVNAKO AKO AJ OD ZMENY JEHO PARAMETROV (AK SPRAVNE CHAPEM OTAZKU)
	//2.) PRIDAL SOM DO TRIEDY kNIGHT VýPIS KTORý MI VYPISUJE CELU TRIEDU A VZDY SA MENI PRETOZE ZA KAZDYM JE KNIGHT NOVY  V JEDNODUCHOSTI VZDY JE NOVY KNOGHT A AJ OGRE
	//3.) NIE JE POTREBNE UPRAVOVAT SLUCKU STRETU AK PRI KAZDOM FOR-CYKLE JE ZADEFINOVANE O AKEHO OBRA IDE TAK STRET SA VYKONA VZDY MEDZI INSTANCIAMI
	//    KTORE MAM VYTVORENE
	// 4.) NIE JE POTREBNE UPRAVIT SLUCKU STRETU A RIESIME A KEDZE MAME 2xKNIGHT A 3xOGRE RIESIME 6 KOMBINACII AK NEPREDPOKLADAME ZE KNIGHTS NEBUDU UTOCIT NA SEBA ROVNAKO AKO ANI OGRES
	// 5.) VYTVORIL SOM RANDOM SILU UTOKU PRE METODU ATTACK TRIEDY KNIGHT POMOCOU FUNKCIE RANDOM
}
