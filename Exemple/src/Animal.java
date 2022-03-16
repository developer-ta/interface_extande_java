
public abstract class Animal {

	protected String couleur;
	protected int poids;
	
	public void boire() {
		System.out.println("Je bois de l'eau");
	}
	
	public abstract void manger();

}
