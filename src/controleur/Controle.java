package controleur;

import vue.EntreeJeu;
import outils.connexion.AsyncResponse;
import outils.connexion.ClientSocket;
import outils.connexion.Connection;
import outils.connexion.ServeurSocket;
import vue.Arene;
import vue.ChoixJoueur;

public class Controle implements AsyncResponse {
	
	/**
	 * Port du serveur
	 */
	private static final int PORT = 6666;
	/**
	 * EntreeJeu
	 */
	private EntreeJeu frmEntreeJeu ;
	/**
	 * Arene
	 */
	private Arene frmArene;
	/**
	 * ChoixJoueur
	 */
	private ChoixJoueur frmChoixJoueur;
	/*
	 * Type du jeu
	 */
	private String typeJeu;

	/**
	 * Méthode de démarrage
	 */
	public static void main(String[] args) {
		new Controle();
	}
	
	/**
	 * Constructeur
	 */
	private Controle() {
		this.frmEntreeJeu = new EntreeJeu(this) ;
		this.frmEntreeJeu.setVisible(true);
	}
	
	public void evenementEntreeJeu(String info) {
		if(info.equals("serveur")) {
			this.typeJeu = "serveur";
			new ServeurSocket(this, PORT);
			this.frmEntreeJeu.dispose();
			this.frmArene = new Arene();
			this.frmArene.setVisible(true);
		} else {
			this.typeJeu = "client";
			new ClientSocket(this, info, PORT);
		}
		
	}

	public void reception(Connection connection, String ordre, Object info) {
		switch(ordre) {
		case "connexion" :
			if(this.typeJeu.equals("client")) {
				this.frmEntreeJeu.dispose();
				this.frmArene = new Arene();
				this.frmChoixJoueur = new ChoixJoueur();
				this.frmChoixJoueur.setVisible(true);
			}
			break;
		case "reception" :
			break;
		case "deconnexion" :
			break;
		}
		
	}
}