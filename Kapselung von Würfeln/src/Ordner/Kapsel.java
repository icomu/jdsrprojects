package Ordner;

class Quader{
	private int laenge,breite,hoehe;

public int flaecheninhalt(){
	return this.laenge*this.breite;
}
public int umfang(){
	return 2*(this.breite+this.laenge);
}
public void setbreite(int br){
	this.breite=br;
}
public int getbreite(){
	return this.breite;
}
public void setlaenge(int lae){
	this.laenge=lae;
}
public int getlaenge(){
	return this.laenge;
}
public void sethoehe(int lae){
	this.hoehe=lae;
}
public int gethoehe(){
	return this.hoehe;
}
}
public class Kapsel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quader r1;
		r1=new Quader();
		
		System.out.println("Zuerst den gew�nschten Wert in -setbreite- eingeben, dann mit -getbreite- umwandeln.");
		r1.setbreite((int)(99*Math.random()));
		System.out.println("Die Breite ist " + r1.getbreite()+" cm");
		System.out.println();
		System.out.println("Zuerst den gew�nschten Wert in -setlaenge- eingeben, dann mit -getlaenge- umwandeln.");
		r1.setlaenge((int)(99*Math.random()));
		System.out.println("Die L�nge ist " + r1.getlaenge()+ " cm");
		System.out.println();
		System.out.println("Zuerst den gew�nschten Wert in -sethoehe- eingeben, dann mit -gethoehe- umwandeln.");
		r1.sethoehe((int)(99*Math.random()));
		System.out.println("Die H�he ist " + r1.gethoehe()+ " cm");
		System.out.println();
		System.out.println("Dann mit den Programmen -flaecheninhalt- und -umfang- ausrechnen.");
		System.out.println("Der Umfang betr�gt: "+r1.umfang()+" cm");
		System.out.println("Der Fl�cheninhalt betr�gt: "+r1.flaecheninhalt()+" cm");
		
	}}


