package Test;
//la class apple herite de la class fruit
//on redefini les methodes qu'on veut
public class Apple1 extends Fruit {

	//definir les class taste,getsize,hasbeen de apple
	
		public Apple1() {
			super("ppomme1");//signifie on cible le constructeur fde la super class
			// TODO Auto-generated constructor stub
		}

		public void taste() {
			System.out.println("la pomme a un gout sucré");
			super.miam();//pour acceder a une fonction de la super class dans la class fille
		}

		public int getSize() {
			return 2;
		}
		
		public boolean hasSeed() {
			return true;
		}

}

