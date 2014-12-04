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
* `s.charAt(0);`
* `s.contains("in");`
* `s.startsWith("Str");`
* `s.endsWith("ing");`
* `s.indexOf("ng");`
* `s.equals("other");`
* `s.equalsIgnoreCase("other");`
* `s.length();`
* `s.matches("regex");`
* `s.toLowerCase();`
* `s.toUpperCase();`
* `s.substring(1);`
* `s.replace("what", "withThis");`
* `s.replaceAll("regex", "with");`
* `s.trim();`

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
