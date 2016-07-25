package edu.dsp.tp1_tapestry.pages;

import org.apache.tapestry5.annotations.InjectPage;

/**
 * Start page of application tp1-tapestry.
 */
public class Index

{

@InjectPage
private Guess guess;
  
private int nbADeviner;

  Object onActionFromOnYVa()
  {
	  nbADeviner = (int) (Math.random() * 10);
	  guess.setup(nbADeviner);

    return guess;
  }
}
