package Test;
//a la creation de la suoer class on coche abstract//abstract permet de dire qu'on peut redefinir une chose
//la class fruit est la class mere//on regroupe tout les points communs
//la super class contient les methodes abstraites et les variables qu'on veut utiliser,et les methodes qu'on veut les redefinir aux seins des class fille on les declare static sans mettre le code
public abstract class Fruit {
	private String name;//variable name ,on genere le get et set pour la retourner et la modifier
	public Fruit(String name) {//constructeur de Fruit 
		this.name=name;//definir le nom du fruit
	}
	public abstract void taste();//on ne met pas le code pour laisser la possiblité a la personne qui herite de fruit la possibilité de mettre qcqu'il veut
	public abstract int getSize();//abstract:prcq la methode va se redefinir dans la class fille
	public abstract boolean hasSeed();
	public void miam() {//toutes les class fille ont l'accée a cette classe explicitement
		System.out.println("miam manger 5 fruits par jours/nom du fruit: "+getName());
	}
	public String getName() {//retourner le nom du fruit
		return name;
	}
	public void setName(String name) {//chnager le nom du fruit
		this.name = name;
	}
	
}