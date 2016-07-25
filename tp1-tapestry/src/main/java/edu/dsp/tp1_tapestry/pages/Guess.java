package edu.dsp.tp1_tapestry.pages;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class Guess {

	@InjectPage
	private Guess guess;
	@InjectPage
	private GameOver gameOver;

	@Property
	@Persist
	private int nbADeviner;
	
	@Property
	@Persist
	private int current;
	
	@Property
	@Persist
	private String message;
//	PersistenceConstants.FLASH (réutilisable une fois)
//	PersistenceConstants.CLIENT (réutilisable une fois) 

	@Property
	@Persist
	private int nbTentatives;

	@Property
	@Persist
	private int dernierEssai;

	public void setup(int value) {
		this.nbADeviner = value;
		this.nbTentatives=0;
		this.message=null;
	}

	Object onActionFromDeviner(int numero)
	{
		if (numero != nbADeviner) {
			if (numero < nbADeviner) {
				message="Le nombre "+numero+" est trop bas";
			}

			else {
				message="Le nombre "+numero+" est trop haut";
			}
			
			dernierEssai=numero;
			nbTentatives++;
			return guess;
			// il vaut mieux faire un return null pour ne pas réinstancer guess.java
		}
		else {
			gameOver.setup(nbADeviner, nbTentatives);
			return gameOver;
		}
	}


	public Guess() {
	}
}
