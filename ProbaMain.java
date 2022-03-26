import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbaMain {

	public static void main(String[] args) {
		Brigi brigi = new Brigi();
		Dani dani = new Dani();
		Marci marci = new Marci();
		System.out.print(brigi.metodus(9) + "\n" + dani.metodus(73) + "\n" + marci.metodus("Alabama"));

		Test t = new Test();
		System.out.print(t.metodus(5));
		System.out.print("shdg");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.print(marci.metodus(br.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
