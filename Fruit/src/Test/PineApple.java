package Test;
//la class pineapple herite de la class fruit
//on redefini les methodes qu'on veut
public class PineApple extends Fruit {
	public PineApple() {
		super("2ananas");//super(name)signifie on cible le constructeur fde la super class
		// TODO Auto-generated constructor stub
	}
	//definir les class taste,getsize,hasbeen de pinapple
	public void taste() {
		System.out.println("l'ananas a un gout acide");
	}
	public int getSize() {
		return 1;
	}
	public boolean hasSeed() {
		return true;
	}

}
