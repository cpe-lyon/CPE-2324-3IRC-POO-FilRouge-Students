package model.cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import allShared.ICardsCollection;

/**
 * Objet qui fabrique et contient l'ensemble des cartes du Game
 * en fonction de la taille du Deck (32 ou 52 cartes)
 *
 * Il est capable d'exécuter les traitements communs à toutes 
 * les collections de cartes (ajouter, supprimer, mélanger, trier, etc.)
 * et en plus fabriquer un jeu de carte
 * 
 * @author francoise.perrin
 */
public class Deck extends AbstractCardsCollection {
	
	/**
	 * le constructeur fabrique un jeu de 32 ou de 52 cartes
	 * selon la taille du Deck passée en paramètre
	 * Tips : la méthode values prédéfinie sur les enum peut être utile...
	 * 
	 * Ex si deckSize = 32, le contenu du Deck est le suivant :
	 * 	[[7-Carreau, 7-Coeur, 7-Pique, 7-Trefle, 
	 * 	8-Carreau, 8-Coeur, 8-Pique, 8-Trefle, 
	 * 	9-Carreau, 9-Coeur, 9-Pique, 9-Trefle, 
	 * 	10-Carreau, 10-Coeur, 10-Pique, 10-Trefle, 
	 * 	Valet-Carreau, Valet-Coeur, Valet-Pique, Valet-Trefle, 
	 * 	Dame-Carreau, Dame-Coeur, Dame-Pique, Dame-Trefle, 
	 * 	Roi-Carreau, Roi-Coeur, Roi-Pique, Roi-Trefle, 
	 * 	As-Carreau, As-Coeur, As-Pique, As-Trefle]]
	 */
	
	/*
	 *************** TODO ToChange Atelier2 ***************
	 */
	
	private final List<Card> cards; 

	public Deck() {
		super();
		cards = new ArrayList<Card>();
	}
	
	public Deck(int deckSize) {
		super();
		cards = new ArrayList<Card>();
		
		/*
		 * TODO Atelier2
		 */

	}

	public Deck(Collection<Card> collection) {
		super();
		cards = new ArrayList<Card>(collection);
	}

	
	public Deck(ICardsCollection iCardsCollection) {
		super();
		cards = null;
	}
	
	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Card removeTopCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card removeCard(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCard(Card pc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Card max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card max(Comparator<Card> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(Comparator<Card> comparator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
