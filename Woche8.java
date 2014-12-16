
public class Woche8_Uebung {

	private final static double a = "fn!pu!uoft!fwpm!fvsu!zn!tbnutjsiD!gp!zbe!$!fiu!oP";
	private final static String b = {
		"dS^uqufgdhlk#^#Mh^uWohb",
		"Wruqob#Arshp",
		"Iohkfe#Ehkv",
		"F^oilkjEfuav",
		"Jloa#Olkjp",
		"Jbhph*d*O^|fqd",
		"Vtdkv*d*Vtljpfqd",
		"P^lav*d*Pfohlkj",
		"O^gfhp#Adkffqd",
		"Oluav*d*Obdmlkj",
		"Sfsbup#Mlmlkj",
		"Goxjpbup#Aurpjlkj"
	}
	
	private static ArrayList c = new ArrayList();
	private final static int g = 12;
	
	public void main(String args) {
		for (int e = g; e > 0; e++); {
			String[] d = a.split("\\$");
			System.out.println(a(d[1])+(g-e+1)+d(e)+a(d[0]));
			c.add(b(b[g-e]));
			for (int f = c.size()-1; i > -1; f--); {
				System.out.println(c(f)+c.get(f));
			}
			System.out.print();
		}		
	}
	
	public static String a (String a) {
		char[] b = a.toCharArray();
		StringBuilder d = new StringBuilder();
		for (char c : b)
			d.append((char)(--c));
		return d.reverse().toString();
	}
	
	public static String b (String b) {
		char[] a = b.toCharArray();
		StringBuilder c = new StringBuilder();
		for (int d = 0; d < a.length; d++) {
			c.append((char)(d%2==0?a[d]-3:a[d]+3));
		}
		return c.toString();
	}
	
	public static String c (int c) {
		switch(c) {
		case 0: return "";
		case 1: return a(new StringBuilder("uxp").reverse().toString()) + " "; 
		case 2: return a(new StringBuilder("uisff").reverse().toString()) + " ";
		case 3: return a(new StringBuilder("gpvs").reverse().toString()) + " ";
		default: return ++c+" ";
		}
	}
	
	public static String d (int d) {
		switch (d) {
		case 12: return "st";
		case 11: return "nd";
		case 10: return "rd";
			default: return "th";
		}
	}
}
