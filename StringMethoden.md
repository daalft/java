Methoden der Klasse String
==========================

Erstellung
----------

`String s = new String("hello");`  

`String s = "hello";`

Konkatenation (Aneinanderreihen)
--------------------------------

    String s = "hello";
    String t = "world";
    String u = s + t;
    String v = s.concat(t);

Weitere Methoden
----------------
Für alle weiteren Methoden, sei `s` ein String.

* `s.split(" ");`
          
Spaltet eine Zeichenkette an dem angegebenen Zeichen. Das Trennzeichen ist nicht im Output enthalten. Gibt einen String Array (`String[]`) zurück.
* `s.charAt(0);`
        
Gibt das Zeichen (`char`) an der angegebenen Position zurück. Die Position (Index) fängt bei 0 an.
* `s.contains("in");`
        
Prüft, ob die angegebene Zeichenkette in `s` enthalten ist. Gibt den Index zurück, an der sich das erste gefundene Zeichen befindet (Im Beispiel den Index von i). Gibt -1 zurück, wenn `s` die Zeichenkette nicht enthält.
* `s.startsWith("Str");`
        
Spezifischer als `contains`. Prüft, ob `s` mit der angegebenen Zeichenkette anfängt. Gibt einen `boolean` Wert zurück.
* `s.endsWith("ing");`
        
Spezifischer als `contains`. Prüft, ob `s` mit der angegebenen Zeichenkette endet. Gibt einen `boolean` Wert zurück.
* `s.indexOf("ng");`
        
"Umgekehrtes" `charAt`. Gibt für eine Zeichenkette den Index zurück, an der die Zeichenkette in `s` anfängt, oder -1 wenn die Zeichenkette nicht in `s` enthalten ist.
* `s.equals("other");`
        
Prüft zwei Strings auf Gleichheit (Inhalt, nicht Pointer). Gibt einen `boolean` Wert zurück.
* `s.equalsIgnoreCase("other");`
        
Prüft zwei Strings auf Gleichheit ohne die Gross/Kleinschreibung zu beachten. Gibt einen `boolean` Wert zurück.
* `s.length();`
        
Gibt die Länge des Strings `s` zurück.
* `s.matches("regex");`
        
Wie `contains`, ausser dass der angegebene Ausdruck als regulärer Ausdruck ausgewertet wird. Gibt einen `boolean` Wert zurück.
* `s.toLowerCase();`
        
Gibt eine Kopie von `s` zurück, in der alle Grossbuchstaben durch Kleinbuchstaben ersetzt sind.
* `s.toUpperCase();`
        
Gibt eine Kopie von `s` zurück, in der alle Kleinbuchstaben durch Grossbuchstaben ersetzt sind.
* `s.substring(1);`
        
Gibt den String `s` ab der angegebenen Position zurück. Im Beispiel wird `s` bis auf den ersten Buchstaben zurückgegeben. `s.substring(3);` gibt `s` ab der Position 3 zurück.
* `s.replace("what", "withThis");`
        
Gibt eine Kopie von `s` zurück, in der alle Vorkommen der angegebenen Zeichenkette durch die zweite Zeichenkette ersetzt wurden.
* `s.replaceAll("regex", "with");`
        
Wie `replace`. Allerdings wird der erste Ausdruck als regulärer Ausdruck ausgewertet.
* `s.trim();`
        
Gibt eine Kopie von `s` zurück, in der alle Whitespace-Zeichen rechts und links entfernt wurden (alle Whitespace-Zeichen innerhalb des Strings bleiben erhalten).


Eigenschaften
-------------

`String` wird abgebildet durch ein `char` Array -> String ist unveränderbar
-> String Manipulation führt zur Erzeugung  (`new`) neuer Strings.
-> Speicherverbrauch steigt

StringBuilder/StringBuffer
=========================

Erlauben das Aufbauen und Ändern von Strings ohne grosses Speicherbedarf.

Erstellung
----------

`StringBuilder sb = new StringBuilder();`
`StringBuilder sb = new StringBuilder("String");`

Hinzufügen
----------

`sb.append("text");`
`sb.append("text").append("text").append(" ");`

toString
--------

Wandelt den StringBuilder/StringBuffer in einen String um

`sb.toString();`

reverse
-------

Kehrt den Inhalt des StringBuilder/StringBuffer um

`sb.reverse()`;
