package Test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple1 a=new Apple1();//Instantiation
		a.taste();//appeler la fonction taste qui retourne le gout
		System.out.println("size: "+a.getSize()+"  hasSeen: "+a.hasSeed());
		PineApple p=new PineApple();
		p.taste();
		System.out.println("size: "+p.getSize()+"  hasSeen: "+p.hasSeed());
		p.miam();//miam est une fonction de Apple class ,on peut l'acceder
		p.setName("banane");//changer le nom
		System.out.println(p.getName());//retourner le nouveau nom
		
	}

}
