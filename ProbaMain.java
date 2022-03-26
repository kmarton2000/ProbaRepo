
public class ProbaMain {

	public static void main(String[] args) {
		Brigi brigi = new Brigi();
		Dani dani = new Dani();
		Marci marci = new Marci();
		System.out.print(brigi.metodus(9) + "\n" + dani.metodus(73) + "\n" + marci.metodus("Alabama"));

		Test t = new Test();
		System.out.print(t.metodus(5));
	}
}
