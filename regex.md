<h1>Zusammenfassung Reguläre Ausdrücke</h1>

<h2>Seite zum Testen von regulären Ausdrücken:<a href="rubular.com">rubular.com</a></h2>
<h2>Weitere Informationen zu regulären Ausdrücken:<a href="http://www.regular-expressions.info">www.regular-expressions.info</a></h2>
<p>
<h3>Wortwörtliche Suche:</h3> Zeichen stehen für sich selbst, Zeichen werden gefunden wie eingegeben, <b>ausser</b><br/>
<code>$ ( ) * + . ? [ \ ^ { |</code>
<br/>
Folgende Zeichen haben nur in bestimmten Kontexten eine besondere Funktion:<br/>
<ul>
<li><code>]</code> wenn davor irgendwo <code>[</code> steht<br/>
<li><code>-</code> wenn davor irgendwo <code>[</code> steht und das Zeichen weder am Anfang noch am Ende einer Bereichsmarkierung (range) steht<br/>
<li><code>}</code> wenn davor irgendwo <code>{</code> steht<br/>
</ul>
</p>
<p>
<h3>Charakterklassen:</h3> <b>Ein</b> Zeichen aus den angegebenen Zeichen<br/><br/>
<code>[abc]</code> findet <b>entweder</b> a <b>oder</b> b <b>oder</b> c<br/> 
<code>[abc]+</code> findet eine Zeichenkette aus einer beliebigen Aneinanderreihung von a,b und c (z.B. aabacaabbbbcccaaabb)<br/>
</p>
<p>
<h3>Spezielle Charakterklassen:</h3>
</p>
<table>
<tr><th>Kurzschreibweise</th><th>Entsprechende Charakterklasse</th></tr>
<tr><td><code>\w</code></td><td><code>[A-Za-z0-9_]</code></td></tr>
<tr><td><code>\d</code></td><td><code>[0-9]</code></td></tr>
<tr><td><code>\s</code></td><td><code>[\s\t\r\n\f]</code></td></tr>
<tr><td><code>\b</code></td><td>Wortgrenze</td></tr>
</table>
<p>
Zudem gibt es die "umgekehrten" Charakterklassen, die für alles stehen, was nicht durch die ursprüngliche Charakterklasse abgedeckt wurde. Diese Klassen werden mit Grossbuchstaben geschrieben:
</p>
<table>
<tr><th>Kurzschreibweise</th><th>Entsprechende Charakterklasse</th></tr>
<tr><td><code>\W</code></td><td><code>[^A-Za-z0-9_]</code></td></tr>
<tr><td><code>\D</code></td><td><code>[^0-9]</code></td></tr>
<tr><td><code>\S</code></td><td><code>[^\s\t\r\n\f]</code></td></tr>
<tr><td><code>\B</code></td><td>Keine Wortgrenze</td></tr>
</table>


<p>
<h3>Punkt</h3>
<code>.</code> steht für <b><u>ein</u> beliebiges</b> Zeichen ausser <code>\n</code>
</p>

<p>
<h3>Wiederholung</h3>
</p>
<table>
<tr><th>Art</th><th>Schreibweise</th></tr>
<tr><td>Fix</td><td><code>{n}</code></td></tr>
<tr><td>Variabel</td><td><code>{n,m}</code></td></tr>
<tr><td>Unendlich</td><td><code>{n,}</td></tr>
</table>
<p>
Folgende Wiederholungen haben auch eine Kurzschreibweise:
<ul>
<li><code>{1,}</code> ==> <code>+</code>
<li><code>{0,}</code> ==> <code>*</code>
</ul>

Die Wiederholung wird immer hinter das Element geschrieben, auf das sie sich bezieht:<br/>
<code>a{2}</code> ==> aa<br/>
<code>[nmf]{2,4}</code> ==> 2 bis 4 Zeichen aus der Charakterklasse <code>[nmf]</code>
</p>

<p>
<h3>Optionalität</h3>
Wir können die Optionalität auf zwei Arten schreiben:
<ul>
<li><code>{0,1}</code>
<li><code>?</code>
</ul>
Wie die Wiederholung bezieht sich die Optionalität immer auf das voranstehende Element
</p>

<p>
<h3>Gierige Quantoren</h3>
Die Quantoren (Wiederholungsoperatoren) <code>+</code> und <code>*</code> sind standardmässig 'gierig', das heisst es wird vom ersten gefundenen Zeichen bis zum letzten gefundenen Zeichen gesucht. Um die Quantoren in den trägen Suchmodus zu versetzen (vom ersten gefundenen Zeichen bis zum nächsten) wird ein <code>?</code> an den Operator gehängt:<br/><code>a+?</code>
</p>

<p>
<h3>Gruppenbildung</h3>
Gruppen werden mittels runder Klammern gebildet. Auf diese Gruppen können wir später zurückgreifen. Die Gruppennummerierung fängt bei 1 an. Gruppe 0 bildet den gesamten gefundenen Ausdruck.
</p>
