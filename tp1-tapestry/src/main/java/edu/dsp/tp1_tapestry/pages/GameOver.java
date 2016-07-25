package edu.dsp.tp1_tapestry.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class GameOver {
	@Property
	@Persist
	private int nbMagique;
	@Property
	@Persist
	private int nbTentatives;
	

	public void setup(int pNbADeviner, int pNbTentatives) {
		this.nbMagique = pNbADeviner;
		this.nbTentatives = pNbTentatives;
		
	}
	
	public GameOver() {
	}
	
	
}
