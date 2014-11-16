import java.io.*;

public class Woche4 {

	public static void main(String[] args) throws IOException {
		// Pfad zur Datei
		String filename = "";
		// Gepufferter Leser
		BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
		// Platzhalter
		String l = "";
		
		// für jede Zeile im Dokument
		while((l=br.readLine())!=null) {
			// Platzhalter-String l entspricht einer Zeile im Dokument
			// TODO: etwas mit l machen
		}
		
		// schliesse den Lesestrom
		br.close();
	}
}